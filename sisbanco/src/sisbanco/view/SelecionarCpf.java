package sisbanco.view;

import javax.swing.*;

import sisbanco.bd.BancoDeDados;
import sisbanco.dao.ClienteDAO;
import sisbanco.dao.ClienteDAOImpl;
import sisbanco.entities.Cliente;
import sisbanco.exceptions.ClienteNaoEncontradoException;
import sisbanco.utils.Validador;

public class SelecionarCpf extends javax.swing.JFrame {
    // START OF GENERATED CODE
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
        );

        pack();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private ClienteDAO clienteDAO;
    // END OF GENERATED CODE

    public SelecionarCpf() {
        initComponents();
        setTitle("Selecionar CPF");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.clienteDAO = new ClienteDAOImpl();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String cpf = jTextField1.getText();

        if (!Validador.validaCpf(cpf)) {
            JOptionPane.showMessageDialog(this, "CPF inválido", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            Cliente cliente = clienteDAO.findByCpf(cpf);   
            ManipularConta manipularConta = new ManipularConta(cliente);
            manipularConta.setVisible(true);
        } catch (ClienteNaoEncontradoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
