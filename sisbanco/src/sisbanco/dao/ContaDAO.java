/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sisbanco.dao;

/**
 *
 * @author PCX
 */
import sisbanco.entities.ContaCorrente;
import sisbanco.entities.Conta;
import sisbanco.entities.ContaInvestimento;

public interface ContaDAO {
    void saveContaCorrente(ContaCorrente conta); 
    void saveContaInvestimento(ContaInvestimento conta);  
    void updateBalance(int id, double novoSaldo);
    void deleteById(int id);
    void sacar(String cpf, double valor);
    void depositar(String cpf, double valor);
    double verSaldo(String cpf);
    void remunerar(String cpf);
    Conta findById(int id);
    Conta getContaByCliente(String cpf); 
}