package sisbanco.bd;

import sisbanco.entities.Cliente;
import sisbanco.entities.Conta;
import sisbanco.entities.ContaCorrente;
import sisbanco.exceptions.ClienteJaTemContaException;
import sisbanco.exceptions.ClienteNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    public static final List<Cliente> clientes = new ArrayList<>();
    public static final List<Conta> contas = new ArrayList<>();
    public static int proximoNumeroConta = 1;

    public static void adicionarCliente(Cliente novoCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(novoCliente.getCpf()))
                throw new RuntimeException("Cliente com o CPF " +  novoCliente.getCpf() + " já existe");
        }

        for (Cliente cliente : clientes) {
            if (cliente.getRg().equals(novoCliente.getRg()))
                throw new RuntimeException("Cliente com o RG " +  novoCliente.getRg() + " já existe");
        }

        BancoDeDados.clientes.add(novoCliente);
    }

    public static void removerCliente(String cpf) {
        Cliente cliente = clientes.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);

        if (cliente != null) {
            clientes.remove(cliente);
            contas.removeIf(conta -> conta.getDono().equals(cliente));
        }
    }

    public static void updateCliente(Cliente clienteParaAtualizar) {
        if (clienteParaAtualizar == null)
            throw new RuntimeException("Cliente não encontrado para atualizar");

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            if (cliente.getCpf().equals(clienteParaAtualizar.getCpf())
                    && cliente.getRg().equals(clienteParaAtualizar.getRg())
                    && cliente.getNome().equals(clienteParaAtualizar.getNome())
                    && cliente.getSobreNome().equals(clienteParaAtualizar.getSobreNome())
                    && cliente.getEndereco().equals(clienteParaAtualizar.getEndereco())
            ) {
                BancoDeDados.clientes.set(i, clienteParaAtualizar);
                return;
            }
        }

        throw new RuntimeException("Cliente não encontrado para atualizar");
    }

    public static Cliente getClienteByNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome))
                return cliente;
        }

        throw new ClienteNaoEncontradoException("Cliente com o nome " + nome + " não encontrado");
    }

    public static Cliente getClienteByCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf))
                return cliente;
        }

        throw new ClienteNaoEncontradoException("Cliente com o CPF " + cpf + " não encontrado");
    }

    public static List<Cliente> getAllClientes() {
        return BancoDeDados.clientes;
    }

    public static List<Conta> getAllContas() {
        return BancoDeDados.contas;
    }

    public static void criarConta(Conta novaConta) {
        for (Conta conta : contas) {
            if (conta.getDono().equals(novaConta.getDono()))
                throw new ClienteJaTemContaException("O cliente já tem uma conta");
        }

        contas.add(novaConta);
    }

    public static Conta getContaByCliente(Cliente cliente) {
        for (Conta conta : contas) {
            if (conta.getDono().equals(cliente))
                return conta;
        }

        return null;
    }

    public static int gerarNumeroConta() {
        return BancoDeDados.proximoNumeroConta++;
    }
}
