/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package sisbanco.bd;

import sisbanco.entities.Cliente;
import sisbanco.entities.Conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoDeDados {
    public static final Map<String, Cliente> hashClientes = new HashMap<>();
    public static final List<Conta> contas = new ArrayList<>();
    public static int proximoNumeroConta = 1;

    public void adicionarCliente(Cliente cliente) {
        BancoDeDados.hashClientes.put(cliente.getCpf(), cliente);
    }

    public void removerCliente(String cpf) {
        Cliente cliente = hashClientes.remove(cpf);

        if (cliente != null) {
            BancoDeDados.contas.removeIf(
                    conta -> conta.getDono().equals(cliente)
            );
        }
    }

   public List<Cliente> listarClientes() {
        return new ArrayList<>(hashClientes.values());
   }

   public void adicionarConta(Conta conta) {
       contas.add(conta);
   }

   public static List<Conta> listarContas() {
        return BancoDeDados.contas;
   }

   public static int gerarNumeroConta() {
        return BancoDeDados.proximoNumeroConta++;
   }
}
