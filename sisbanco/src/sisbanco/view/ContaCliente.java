package sisbanco.view;

import sisbanco.entities.Cliente;
import sisbanco.entities.ContaCorrente;
import sisbanco.entities.ContaInvestimento;
import sisbanco.bd.BancoDeDados;
import sisbanco.exceptions.ClienteJaTemContaException;

import javax.swing.*;

public class ContaCliente extends javax.swing.JFrame {
    // START OF GENERATED CODE
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Inicio = new javax.swing.JPanel();
        Cliente = new javax.swing.JLabel();
        Conta = new javax.swing.JLabel();
        ComboCliente = new javax.swing.JComboBox<>();
        ComboConta = new javax.swing.JComboBox<>();
        Vincular = new javax.swing.JButton();
        ContaCorrente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        ContaInvestimento = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cliente.setText("Cliente");
        ComboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboConta, 0, 159, Short.MAX_VALUE)
                            .addComponent(ComboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(Vincular, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboConta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Vincular, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Cliente", Inicio);

        jLabel1.setText("Depósito Inicial");

        jLabel2.setText("Limite");

        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContaCorrenteLayout = new javax.swing.GroupLayout(ContaCorrente);
        ContaCorrente.setLayout(ContaCorrenteLayout);
        ContaCorrenteLayout.setHorizontalGroup(
            ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaCorrenteLayout.createSequentialGroup()
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContaCorrenteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContaCorrenteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        ContaCorrenteLayout.setVerticalGroup(
            ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaCorrenteLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Conta Corrente", ContaCorrente);

        jButton2.setText("Criar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Montante Mínimo");

        jLabel4.setText("Depósito Mínimo");

        jLabel5.setText("Depósito Inicial");

        javax.swing.GroupLayout ContaInvestimentoLayout = new javax.swing.GroupLayout(ContaInvestimento);
        ContaInvestimento.setLayout(ContaInvestimentoLayout);
        ContaInvestimentoLayout.setHorizontalGroup(
            ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaInvestimentoLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(87, 87, 87)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(177, 177, 177))
            .addGroup(ContaInvestimentoLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContaInvestimentoLayout.setVerticalGroup(
            ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContaInvestimentoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContaInvestimentoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4))
                    .addGroup(ContaInvestimentoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ContaInvestimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContaInvestimentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(118, 118, 118))
                    .addGroup(ContaInvestimentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        jTabbedPane1.addTab("Conta Investimento", ContaInvestimento);

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
    }

    private javax.swing.JLabel Cliente;
    private javax.swing.JComboBox<String> ComboCliente;
    private javax.swing.JComboBox<String> ComboConta;
    private javax.swing.JLabel Conta;
    private javax.swing.JPanel ContaCorrente;
    private javax.swing.JPanel ContaInvestimento;
    private javax.swing.JPanel Inicio;
    private javax.swing.JButton Vincular;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // START OF GENERATED CODE

    private String nameOfSelectedClient;

    public ContaCliente() {
        initComponents();

        for (Cliente cliente : BancoDeDados.getAllClientes()) {
            ComboCliente.addItem(cliente.getNome());
        }

        // Adiciona o JComboBox ao painel 'Inicio'
        //Inicio.add(ComboCliente);
    }

    private void ComboClienteActionPerformed(java.awt.event.ActionEvent evt) {
        this.nameOfSelectedClient = (String) ComboCliente.getSelectedItem();
        System.out.println(this.nameOfSelectedClient);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        double depositoInicial = Double.parseDouble(jTextField1.getText());
        double limite = Double.parseDouble(jTextField2.getText());

        try {
            Cliente cliente = BancoDeDados.getClienteByNome(this.nameOfSelectedClient);
            ContaCorrente novaContaCorrente = new ContaCorrente(cliente, BancoDeDados.gerarNumeroConta(), depositoInicial, limite);
            BancoDeDados.criarConta(novaContaCorrente);
            JOptionPane.showMessageDialog(null, "Conta corrente criada com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClienteJaTemContaException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        double montanteMinimo = Double.parseDouble(jTextField3.getText());
        double depositoMinimo = Double.parseDouble(jTextField4.getText());
        double depositoInicial = Double.parseDouble(jTextField5.getText());

        try {
            Cliente cliente = BancoDeDados.getClienteByNome(this.nameOfSelectedClient);
            ContaInvestimento novaContaInvestimento = new ContaInvestimento(cliente, BancoDeDados.gerarNumeroConta(), depositoInicial, montanteMinimo, depositoMinimo);
            BancoDeDados.criarConta(novaContaInvestimento);
            JOptionPane.showMessageDialog(null, "Conta de investimento criada com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClienteJaTemContaException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
