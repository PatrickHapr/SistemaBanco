/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbanco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alves
 */
public class Sistema {
    static Map<String, Cliente> hashClientes = new HashMap<>();
    private List<Conta> contas;
    private int proximoNumeroConta;

    public Sistema() {
        contas = new ArrayList<>();
        proximoNumeroConta = 1;
    }

    public void adicionarCliente(Cliente cliente) {
        hashClientes.put(cliente.getCpf(), cliente);
    }

    public void removerCliente(String cpf) {
        Cliente cliente = hashClientes.remove(cpf);
        if (cliente != null) {
            contas.removeIf(conta -> conta.getDono().equals(cliente));
        }
    }

   public List<Cliente> listarClientes() {
        return new ArrayList<>(hashClientes.values());
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> listarContas() {
        return new ArrayList<>(contas);
    }

    public int gerarNumeroConta() {
        return proximoNumeroConta++;
    }
}