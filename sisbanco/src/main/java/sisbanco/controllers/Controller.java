package sisbanco.controllers;

import sisbanco.models.dao.ClienteDAO;
import sisbanco.models.dao.ContaDAO;
import sisbanco.models.entities.Cliente;
import sisbanco.models.entities.Conta;
import sisbanco.models.entities.ContaCorrente;
import sisbanco.models.entities.ContaInvestimento;
import sisbanco.view.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.util.List;

public class Controller {
    private final ClienteDAO clienteDAO;
    private final ContaDAO contaDAO;

    private final TelaPrincipal telaPrincipalView;
    private final CadastraCliente cadastraClienteView;
    private final ClienteConta clienteContaView;
    private final SelecionarCpf selecionarCpfView;
    private final ManipularConta manipularContaView;

    public Controller(TelaPrincipal telaPrincipalView, ClienteDAO clienteDAO, ContaDAO contaDAO, CadastraCliente cadastraClienteView, ClienteConta clienteContaView, SelecionarCpf selecionarCpfView, ManipularConta manipularConta) {
        this.telaPrincipalView = telaPrincipalView;
        this.clienteDAO = clienteDAO;
        this.contaDAO = contaDAO;
        this.cadastraClienteView = cadastraClienteView;
        this.clienteContaView = clienteContaView;
        this.selecionarCpfView = selecionarCpfView;
        this.manipularContaView = manipularConta;

        this.telaPrincipalView.addCriarClienteListener(this::showCadastraCliente);
        this.telaPrincipalView.addCriarContaListener(this::showClienteConta);
        this.telaPrincipalView.addManipularContaListener(this::showSelecionarCpf);

        this.cadastraClienteView.addCadastrarButtonListener(this::cadastrarClienteListener);
        this.cadastraClienteView.addExcluirButtonListener(this::excluirClienteListener);
        this.cadastraClienteView.addAtualizarButtonListener(this::atualizarClienteListener);
        this.cadastraClienteView.addListarButtonListener(this::listarListener);
        this.cadastraClienteView.addLimparButtonListener(this::limparListener);

        this.clienteContaView.addCriarContaInvestimentoButtonListener(this::criarContaInvestimentoListener);
        this.clienteContaView.addCriarContaCorrenteListener(this::criarContaCorrenteListener);

        this.selecionarCpfView.addEntrarParaManipularContaButtonListener(this::entrarParaManipularContaListener);

        this.manipularContaView.sacarActionListener(this::sacarListener);
        this.manipularContaView.remunerarActionListener(this::remuneraListener);
        this.manipularContaView.verSaldoActionListener(this::saldoListener);
        this.manipularContaView.depositarActionListener(this::depositarListener);
    }

    public void apresentarErro(String s) {
        JOptionPane.showMessageDialog(null,s + "\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    public void apresentarInfo(String s) {
        JOptionPane.showMessageDialog(null,s + "\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    // TelaPrincipal

    public void showCadastraCliente(ActionEvent e) {
        List<Cliente> clienteList = this.clienteDAO.getAllClientes();
        this.cadastraClienteView.inicializarView(clienteList);
        this.cadastraClienteView.setVisible(true);
    }

    public void showClienteConta(ActionEvent e) {
        List<Cliente> clientes = this.clienteDAO.getAllClientes();
        this.clienteContaView.carregarClientes(clientes);
        this.clienteContaView.setVisible(true);
    }

    public void showSelecionarCpf(ActionEvent e) {
        this.selecionarCpfView.setVisible(true);
    }

    // CadastraCliente

    public void atualizarClienteListener(ActionEvent e) {
        try {
            System.out.println("atualizando...");
            Cliente cliente = this.cadastraClienteView.getClienteParaCadastrar();
            this.clienteDAO.updateCliente(cliente);
            List<Cliente> clienteList = this.clienteDAO.getAllClientes();
            this.cadastraClienteView.listar(clienteList);
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    public void excluirClienteListener(ActionEvent e) {
        try {
            List<Cliente> clientesParaExcluir = this.cadastraClienteView.getClientesParaExcluir();

            System.out.println(clientesParaExcluir);

            if (clientesParaExcluir == null)
                return;

            for (Cliente c : clientesParaExcluir)
                this.clienteDAO.deleteByCpf(c.getCpf());

            List<Cliente> updatedClienteList = this.clienteDAO.getAllClientes();
            this.cadastraClienteView.listar(updatedClienteList);
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    public void cadastrarClienteListener(ActionEvent e) {
        try {
            System.out.println("cadastrando...");
            Cliente novoCliente = this.cadastraClienteView.getClienteParaCadastrar();
            this.clienteDAO.save(novoCliente);
            List<Cliente> clienteList = this.clienteDAO.getAllClientes();
            this.cadastraClienteView.atualizarListaPosCadastro(clienteList, novoCliente);
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    public void listarListener(ActionEvent e) {
        List<Cliente> clienteList = this.clienteDAO.getAllClientes();
        this.cadastraClienteView.listar(clienteList);
    }

    public void limparListener(ActionEvent e) {
        List<Cliente> clienteList = this.clienteDAO.getAllClientes();
        this.cadastraClienteView.limparCampos(clienteList);
    }

    // ClienteConta

    private void criarContaInvestimentoListener(ActionEvent e) {
        try {
            ContaInvestimento conta = this.clienteContaView.getContaInvestimentoParaCriar();
            String nameOfSelectedClient = this.clienteContaView.getNameOfSelectedClient();
            Cliente cliente = this.clienteDAO.findClientesByName(nameOfSelectedClient);
            conta.setDono(cliente);
            this.contaDAO.saveContaInvestimento(conta);
            this.apresentarInfo("Conta de investimento criada com sucesso\n");
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    private void criarContaCorrenteListener(ActionEvent e) {
        try {
            ContaCorrente conta = this.clienteContaView.getContaCorrenteParaCriar();
            String nameOfSelectedClient = this.clienteContaView.getNameOfSelectedClient();
            Cliente cliente = this.clienteDAO.findClientesByName(nameOfSelectedClient);
            conta.setDono(cliente);
            this.contaDAO.saveContaCorrente(conta);
            this.apresentarInfo("Conta corrente criada com sucesso\n");
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    // SelecionarCpf

    private void entrarParaManipularContaListener(ActionEvent e) {
        try {
            String cpf = this.selecionarCpfView.getCpfParaEntrar();
            Cliente cliente = this.clienteDAO.findByCpf(cpf);
            Conta conta = this.contaDAO.getContaByCliente(cpf);

            this.manipularContaView.setCliente(cliente);
            this.manipularContaView.setContaDoCliente(conta);
            this.manipularContaView.setVisible(true);
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    // ManipularCpf

    private void sacarListener(ActionEvent e) {
        try {
            double valorSaque = this.manipularContaView.getValorSaque();
            Conta contaDoCliente = this.manipularContaView.getContaDoCliente();
            this.contaDAO.sacar(contaDoCliente.getDono().getCpf(), valorSaque);
            Conta contaDoClienteUpdated = this.contaDAO.getContaByCliente(contaDoCliente.getDono().getCpf());
            this.manipularContaView.setContaDoCliente(contaDoClienteUpdated);
            this.apresentarInfo("Saque concluído com sucesso");
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    private void depositarListener(ActionEvent e) {
        try {
            double valorDeposito = this.manipularContaView.getValorDeposito();
            Conta contaDoCliente = this.manipularContaView.getContaDoCliente();
            this.contaDAO.depositar(contaDoCliente.getDono().getCpf(), valorDeposito);
            Conta contaDoClienteUpdated = this.contaDAO.getContaByCliente(contaDoCliente.getDono().getCpf());
            this.manipularContaView.setContaDoCliente(contaDoClienteUpdated);
            this.apresentarInfo("Deposito concluído com sucesso");
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    private void saldoListener(ActionEvent e) {
        try {
            Cliente cliente = this.manipularContaView.getCliente();
            double saldo = this.contaDAO.verSaldo(cliente.getCpf());
            this.apresentarInfo("Seu saldo é: " + saldo);
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }

    private void remuneraListener(ActionEvent e) {
        try {
            Cliente cliente = this.manipularContaView.getCliente();
            this.contaDAO.remunerar(cliente.getCpf());
            this.apresentarInfo("Remuneração feita com sucesso");
        } catch (Exception err) {
            err.printStackTrace();
            this.apresentarErro(err.getMessage());
        }
    }
}
