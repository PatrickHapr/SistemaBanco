/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbanco.dao;

/**
 *
 * @author PCX
 */
import sisbanco.bd.DatabaseConnection;
import sisbanco.entities.Cliente;
import sisbanco.entities.ContaCorrente;
import java.sql.*;
import sisbanco.entities.ContaInvestimento;

public class ContaDAOImpl implements ContaDAO {

    @Override
    public void saveContaCorrente(ContaCorrente conta) {
        String sql = "INSERT INTO ACCOUNT (OWNER, BALANCE, ACCOUNT_TYPE, LIMITE) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, conta.getDono().getCpf());
            stmt.setDouble(2, conta.getSaldo());
            stmt.setString(3, "ContaCorrente");
            stmt.setDouble(4, conta.getLimite());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar ContaCorrente: " + e.getMessage(), e);
        }
    }

    @Override
    public void saveContaInvestimento(ContaInvestimento conta) {
        String sql = "INSERT INTO ACCOUNT (OWNER, BALANCE, ACCOUNT_TYPE, MINIMUM_BALANCE, INITIAL_DEPOSIT) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, conta.getDono().getCpf());
            stmt.setDouble(2, conta.getSaldo());
            stmt.setString(3, "ContaInvestimento");
            stmt.setDouble(4, conta.getMontanteMinimo());
            stmt.setDouble(5, conta.getDepositoMinimo());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar ContaInvestimento: " + e.getMessage(), e);
        }
    }

    @Override
    public ContaCorrente findById(int id) {
        String sql = "SELECT * FROM ACCOUNT WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Cliente cliente = findClienteByCpf(rs.getString("OWNER"));
                return new ContaCorrente(
                        cliente,
                        rs.getInt("ID"),
                        rs.getDouble("BALANCE"),
                        rs.getDouble("LIMITE")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar conta por ID: " + e.getMessage(), e);
        }
        return null;
    }
    @Override
    public void updateBalance(int id, double novoSaldo) {
        String sql = "UPDATE ACCOUNT SET BALANCE = ? WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, novoSaldo);
            stmt.setInt(2, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar saldo da conta: " + e.getMessage(), e);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM ACCOUNT WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar conta: " + e.getMessage(), e);
        }
    }
    private Cliente findClienteByCpf(String cpf) {
        String sql = "SELECT * FROM USERS WHERE CPF = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Cliente(
                        rs.getString("NAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("RG"),
                        rs.getString("CPF"),
                        rs.getString("ADDRESS")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar cliente por CPF: " + e.getMessage(), e);
        }
        throw new RuntimeException("Cliente não encontrado para o CPF: " + cpf);
    }
    @Override
    public ContaCorrente getContaByCliente(String cpf) {
        String sql = "SELECT * FROM ACCOUNT WHERE OWNER = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Cliente cliente = findClienteByCpf(cpf);
                return new ContaCorrente(
                        cliente,
                        rs.getInt("ID"),
                        rs.getDouble("BALANCE"),
                        rs.getDouble("LIMITE")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar conta pelo CPF do cliente: " + e.getMessage(), e);
        }
        return null; 
    }
    @Override
    public void sacar(String cpf, double valor) {
        String sql = "UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE OWNER = ? AND BALANCE >= ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, valor);
            stmt.setString(2, cpf);
            stmt.setDouble(3, valor);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 0) {
                throw new RuntimeException("Saldo insuficiente ou cliente não encontrado.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao sacar: " + e.getMessage(), e);
        }
    }

    @Override
    public void depositar(String cpf, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para depósito deve ser maior que zero.");
        }

        String sql = "UPDATE ACCOUNT SET BALANCE = BALANCE + ? WHERE OWNER = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, valor);
            stmt.setString(2, cpf);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 0) {
                throw new RuntimeException("Cliente não encontrado para depósito.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao depositar: " + e.getMessage(), e);
        }
    }

    @Override
    public double verSaldo(String cpf) {
        String sql = "SELECT BALANCE FROM ACCOUNT WHERE OWNER = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getDouble("BALANCE");
            } else {
                throw new RuntimeException("Cliente não encontrado.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao consultar saldo: " + e.getMessage(), e);
        }
    }

    @Override
    public void remunerar(String cpf) {
        String sql = "UPDATE ACCOUNT SET BALANCE = BALANCE* 1.01 WHERE OWNER = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 0) {
                throw new RuntimeException("Cliente não encontrado para remuneração.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao aplicar remuneração: " + e.getMessage(), e);
        }
    }
}