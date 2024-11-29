/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sisbanco.view;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;

import sisbanco.controllers.Controller;
import sisbanco.models.entities.Cliente;
import sisbanco.models.entities.ContaCorrente;
import sisbanco.models.entities.ContaInvestimento;
import sisbanco.exceptions.ClienteJaTemContaException;
import sisbanco.models.dao.ClienteDAOImpl;
import sisbanco.models.dao.ClienteDAO;
import sisbanco.models.dao.ContaDAO;
import sisbanco.models.dao.ContaDAOImpl;

/**
 *
 * @author Matheus
 */
public class ClienteConta extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    
    private String nameOfSelectedClient;
    private String nameOfSelectedAccount = "Conta Corrente";

    public ClienteConta() {
        initComponents();
        ContaInvestimento.setVisible(false);
        ContaCorrente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        Cliente = new javax.swing.JLabel();
        ContaCorrente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        DIC = new javax.swing.JTextField();
        LC = new javax.swing.JTextField();
        ContaInvestimento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MM = new javax.swing.JTextField();
        DMI = new javax.swing.JTextField();
        DII = new javax.swing.JTextField();
        ComboCliente = new javax.swing.JComboBox<>();
        Conta = new javax.swing.JLabel();
        ComboConta = new javax.swing.JComboBox<>();
        Vincular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cliente.setText("Cliente");

        ContaCorrente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Depósito Inicial");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Limite");

        jButton3.setText("Criar");

        javax.swing.GroupLayout ContaCorrenteLayout = new javax.swing.GroupLayout(ContaCorrente);
        ContaCorrente.setLayout(ContaCorrenteLayout);
        ContaCorrenteLayout.setHorizontalGroup(
            ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContaCorrenteLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DIC)
                    .addComponent(LC, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addGap(26, 26, 26))
        );
        ContaCorrenteLayout.setVerticalGroup(
            ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaCorrenteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContaCorrenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        ContaInvestimento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Montante Mínimo");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Depósito Mínimo");

        jButton1.setText("Criar");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Depósito Inicial");

        javax.swing.GroupLayout ContaInvestimentoLayout = new javax.swing.GroupLayout(ContaInvestimento);
        ContaInvestimento.setLayout(ContaInvestimentoLayout);
        ContaInvestimentoLayout.setHorizontalGroup(
            ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContaInvestimentoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DMI)
                    .addComponent(MM)
                    .addComponent(DII, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        ContaInvestimentoLayout.setVerticalGroup(
            ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaInvestimentoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DMI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DII, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        ComboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboClienteActionPerformed(evt);
            }
        });

        Conta.setText("Conta");

        ComboConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Conta Investimento" }));
        ComboConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboContaActionPerformed(evt);
            }
        });

        Vincular.setText("Vincular");
        Vincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VincularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContaInvestimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboConta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Vincular, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(ContaCorrente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cliente)
                            .addComponent(ComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboConta, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(Conta))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Vincular, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ContaInvestimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContaCorrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void carregarClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes)
            ComboCliente.addItem(cliente.getNome());
    }

    private void VincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VincularActionPerformed
        if ("Conta Corrente".equals(nameOfSelectedAccount)) {
            ContaInvestimento.setVisible(false);
            ContaCorrente.setVisible(true);
        } else if ("Conta Investimento".equals(nameOfSelectedAccount)) {
            ContaInvestimento.setVisible(true);
            ContaCorrente.setVisible(false);
        }
    }//GEN-LAST:event_VincularActionPerformed

    private void ComboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboClienteActionPerformed
        this.nameOfSelectedClient = (String) ComboCliente.getSelectedItem();
    }//GEN-LAST:event_ComboClienteActionPerformed

    private void ComboContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboContaActionPerformed
        this.nameOfSelectedAccount = (String) ComboConta.getSelectedItem();
    }//GEN-LAST:event_ComboContaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cliente;
    private javax.swing.JComboBox<String> ComboCliente;
    private javax.swing.JComboBox<String> ComboConta;
    private javax.swing.JLabel Conta;
    private javax.swing.JPanel ContaCorrente;
    private javax.swing.JPanel ContaInvestimento;
    private javax.swing.JTextField DIC;
    private javax.swing.JTextField DII;
    private javax.swing.JTextField DMI;
    private javax.swing.JTextField LC;
    private javax.swing.JTextField MM;
    private javax.swing.JButton Vincular;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    public String getNameOfSelectedClient() {
        return this.nameOfSelectedClient;
    }

    public ContaInvestimento getContaInvestimentoParaCriar() {
        double montanteMinimo = Double.parseDouble(MM.getText());
        double depositoMinimo = Double.parseDouble(DMI.getText());
        double depositoInicial = Double.parseDouble(DII.getText());
        int numeroGerado = (int) gerarNumeroAleatorio();

        return new ContaInvestimento(
                null, numeroGerado, depositoInicial, montanteMinimo, depositoMinimo
        );
    }

    public ContaCorrente getContaCorrenteParaCriar() {
        double depositoInicial = Double.parseDouble(DIC.getText());
        double limite = Double.parseDouble(LC.getText());
        int numeroGerado = (int) gerarNumeroAleatorio();

        return new ContaCorrente(null, numeroGerado, depositoInicial, limite);
    }


    public void addCriarContaInvestimentoButtonListener(ActionListener listener) {
        this.jButton1.addActionListener(listener);
    }

    public void addCriarContaCorrenteListener(ActionListener listener) {
        this.jButton3.addActionListener(listener);
    }


    public long gerarNumeroAleatorio() {
        return Math.abs(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE) % 1000000; 
    }
}
