/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sisbanco.models.dao;

import sisbanco.bd.DatabaseConnection;
import sisbanco.models.entities.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PCX
 */
public class ClienteDAOImpl implements ClienteDAO {

    @Override
    public void save(Cliente cliente) {
        String sql = "INSERT INTO users (CPF, RG, NAME, LASTNAME, ADDRESS) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getNome());
            stmt.setString(4, cliente.getSobreNome());
            stmt.setString(5, cliente.getEndereco());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar cliente: " + e.getMessage(), e);
        }
    }

    @Override
    public Cliente findById(int id) {
        String sql = "SELECT * FROM users WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
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
            throw new RuntimeException("Erro ao buscar cliente por ID: " + e.getMessage(), e);
        }
        return null;
    }

    @Override
    public Cliente findByCpf(String cpf) {
        String sql = "SELECT * FROM users WHERE CPF = ?";
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
        return null;
    }

    @Override
    public List<Cliente> getAllClientes() {
        String sql = "SELECT * FROM users";
        List<Cliente> clientes = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                clientes.add(new Cliente(
                        rs.getString("NAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("RG"),
                        rs.getString("CPF"),
                        rs.getString("ADDRESS")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar todos os clientes: " + e.getMessage(), e);
        }
        return clientes;
    }

    @Override
    public void updateCliente(Cliente cliente) {
        String sql = "UPDATE users SET NAME = ?, LASTNAME = ?, ADDRESS = ? WHERE CPF = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSobreNome());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getCpf());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage(), e);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM users WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar cliente: " + e.getMessage(), e);
        }
    }
    @Override
    public void deleteByCpf(String cpf) {
        String sql = "DELETE FROM users WHERE CPF = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar cliente: " + e.getMessage(), e);
        }
    }
    @Override
    public Cliente findClientesByName(String name) {
        String sql = "SELECT * FROM users WHERE NAME = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) { // Caso haja um cliente com o nome fornecido
                return new Cliente(
                        rs.getString("NAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("RG"),
                        rs.getString("CPF"),
                        rs.getString("ADDRESS")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar cliente por nome: " + e.getMessage(), e);
        }
        return null; 
    }
}