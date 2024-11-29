/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sisbanco.models.dao;

import java.util.List;
import sisbanco.models.entities.Cliente;

/**
 *
 * @author PCX
 */
public interface ClienteDAO {
    void save(Cliente cliente);
    void updateCliente(Cliente cliente);
    void deleteById(int id);
    void deleteByCpf(String cpf);
    Cliente findById(int id);
    Cliente findByCpf(String cpf);
    Cliente findClientesByName(String name);
    List<Cliente> getAllClientes();
}