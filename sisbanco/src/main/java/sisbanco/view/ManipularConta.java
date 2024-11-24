package sisbanco.view;

import sisbanco.bd.BancoDeDados;
import sisbanco.entities.Cliente;
import sisbanco.entities.Conta;

import javax.swing.*;
import sisbanco.dao.ContaDAO;
import sisbanco.dao.ContaDAOImpl;

public class ManipularConta extends javax.swing.JFrame {
    // START OF GENERATED CODE
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        menu = new javax.swing.JPanel();
        btnSaque = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        btnRemunera = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        saque = new javax.swing.JPanel();
        valorSaque = new javax.swing.JLabel();
        btnSacar = new javax.swing.JButton();
        txtSaque = new javax.swing.JTextField();
        deposito = new javax.swing.JPanel();
        btnDepositar = new javax.swing.JButton();
        valorDeposito = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        btnSaque.setText("Saque");

        btnSaldo.setText("Ver Saldo");

        btnRemunera.setText("Remunerar");

        btnDeposito.setText("Depósito");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemunera, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnRemunera, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Menu", menu);

        valorSaque.setText("Valor");

        btnSacar.setText("Sacar");

        javax.swing.GroupLayout saqueLayout = new javax.swing.GroupLayout(saque);
        saque.setLayout(saqueLayout);
        saqueLayout.setHorizontalGroup(
            saqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saqueLayout.createSequentialGroup()
                .addGroup(saqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saqueLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(valorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(txtSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(saqueLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        saqueLayout.setVerticalGroup(
            saqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saqueLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(saqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Saque", saque);

        btnDepositar.setText("Depositar");

        valorDeposito.setText("Valor");

        javax.swing.GroupLayout depositoLayout = new javax.swing.GroupLayout(deposito);
        deposito.setLayout(depositoLayout);
        depositoLayout.setHorizontalGroup(
            depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(valorDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(depositoLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        depositoLayout.setVerticalGroup(
            depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositoLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorDeposito)
                    .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        jTabbedPane1.addTab("Depósito", deposito);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();

        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });

        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositarActionPerformed(evt);
            }
        });

        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerSaldoActionPerformed(evt);
            }
        });

        btnRemunera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemunerarActionPerformed(evt);
            }
        });
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabbedPane1.setSelectedIndex(2); // Change to the "Depósito" tab
            }
        });
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabbedPane1.setSelectedIndex(1); // Change to the "Saque" tab
            }
        });
    }

    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnRemunera;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSaque;
    private javax.swing.JPanel deposito;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel saque;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtSaque;
    private javax.swing.JLabel valorDeposito;
    private javax.swing.JLabel valorSaque;
    // END OF GENERATED CODE

    private final Cliente cliente;
    private final Conta contaDoCliente;

    public ManipularConta(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        System.out.println("aaa");
        ContaDAO contaDAO = new ContaDAOImpl();
        System.out.println("bbb");
        this.contaDoCliente = contaDAO.getContaByCliente(cliente.getCpf()); 
        System.out.println("ccc");
    }

    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.contaDoCliente == null) {
            JOptionPane.showMessageDialog(this, "Crie uma conta antes de sacar", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        double valorSaque = Double.parseDouble(txtSaque.getText());
        ContaDAO contaDAO = new ContaDAOImpl();
        if (valorSaque < 0) {
            JOptionPane.showMessageDialog(this, "Não é possível sacar um valor menor que 0", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (this.contaDoCliente.getSaldo() > valorSaque) {
            contaDAO.sacar(cliente.getCpf(), valorSaque);
            JOptionPane.showMessageDialog(this, "Saque concluído com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Saldo indisponível", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {
        ContaDAO contaDAO = new ContaDAOImpl();
        if (this.contaDoCliente == null) {
            JOptionPane.showMessageDialog(this, "Crie uma conta antes de depositar", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double valorDeposito = Double.parseDouble(txtDeposito.getText());

        if (valorDeposito < 0) {
            JOptionPane.showMessageDialog(this, "Não é possível depositar um valor menor que 0", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        contaDAO.depositar(cliente.getCpf(), valorDeposito);
        JOptionPane.showMessageDialog(this, "Deposito concluído com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButtonVerSaldoActionPerformed(java.awt.event.ActionEvent evt) {
        ContaDAO contaDAO = new ContaDAOImpl();
        if (this.contaDoCliente == null) {
            JOptionPane.showMessageDialog(this, "Crie uma conta antes de ver o saldo", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double saldo = contaDAO.verSaldo(cliente.getCpf());
        JOptionPane.showMessageDialog(this, "Seu saldo é: " + saldo, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButtonRemunerarActionPerformed(java.awt.event.ActionEvent evt) {
        ContaDAO contaDAO = new ContaDAOImpl();
        if (this.contaDoCliente == null) {
            JOptionPane.showMessageDialog(this, "Crie uma conta antes de remunerar", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        contaDAO.remunerar(cliente.getCpf());
        JOptionPane.showMessageDialog(this, "Remuneração feita com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}
