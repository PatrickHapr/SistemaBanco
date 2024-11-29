/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sisbanco.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import sisbanco.dao.ClienteDAO;
import sisbanco.dao.ClienteDAOImpl;
import sisbanco.entities.Cliente;
import static sisbanco.utils.Validador.validaCpf;
import static sisbanco.utils.Validador.validaRg;

/**
 *
 * @author Matheus
 */
public class CadastrarUsuario extends javax.swing.JFrame {

    private ClienteTableModel tabModel = new ClienteTableModel();
    private TableRowSorter<ClienteTableModel> sorter;
    private int linhaClicadaParaAtualizacao = -1;
    private Cliente clienteSelecionadoParaAtualizacao;
    private ClienteDAO clienteDAO = new ClienteDAOImpl();
    /**
     * Creates new form CadastrarUsuario
     */
    public CadastrarUsuario() {
        initComponents();
        this.tabModel.setListaContatos(clienteDAO.getAllClientes());
        this.clienteSelecionadoParaAtualizacao = null;
        this.linhaClicadaParaAtualizacao = -1;
        this.tabCliente.setModel(tabModel);
        this.sorter = new TableRowSorter<>(tabModel);
        this.tabCliente.setRowSorter(this.sorter);

        for (int i = 0; i < tabModel.getColumnCount(); i++) {
            this.tabCliente.getTableHeader().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int columnIndex = tabCliente.columnAtPoint(e.getPoint());
                    List<RowSorter.SortKey> sortKeys = new ArrayList<>();
                    sortKeys.add(new RowSorter.SortKey(columnIndex, SortOrder.ASCENDING));
                    sorter.setSortKeys(sortKeys);
                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AcaoTitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobreNome = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 48, 64));

        AcaoTitulo.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        AcaoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        AcaoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcaoTitulo.setText("Cadastrar Cliente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobrenome :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RG :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço :");

        btnCadastrar.setBackground(new java.awt.Color(90, 36, 166));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(90, 36, 166));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(90, 36, 166));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(90, 36, 166));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(90, 36, 166));
        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(189, 242, 174));
        jPanel5.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(189, 242, 174));
        jPanel6.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        tabCliente.setModel(tabModel);
        tabCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(AcaoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                    .addComponent(txtSobreNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRG, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                    .addComponent(txtCPF)
                                    .addComponent(txtEndereco)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListar)))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AcaoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnListar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = this.txtNome.getText();
        String sobreNome = this.txtSobreNome.getText();
        String rg = this.txtRG.getText();
        String cpf = this.txtCPF.getText();
        String endereco = this.txtEndereco.getText();
        
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nome não valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (sobreNome.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Sobrenome não valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (endereco.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Endereço não valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!validaCpf(cpf)) {
            JOptionPane.showMessageDialog(null,"CPF não valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;  
        }
        if (!validaRg(rg)) {
            JOptionPane.showMessageDialog(null,"RG não valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;  
        }
        
        Cliente novoCliente = new Cliente(nome, sobreNome, rg, cpf, endereco);
        ClienteDAO clienteDAO1 = new ClienteDAOImpl();
        clienteDAO1.save(novoCliente); 
        this.tabModel.setListaContatos(clienteDAO1.getAllClientes());
        this.tabCliente.setRowSelectionInterval(clienteDAO1.getAllClientes().size() - 1, clienteDAO1.getAllClientes().size() - 1);
        this.clienteSelecionadoParaAtualizacao = novoCliente;
        this.linhaClicadaParaAtualizacao = clienteDAO1.getAllClientes().size() - 1;
    
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Cliente clienteParaAtualizar = this.getClienteParaAtualizar();
        clienteDAO.updateCliente(clienteParaAtualizar);
        this.tabModel.atualizarCliente(this.linhaClicadaParaAtualizacao);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
List<Cliente> listaExcluir = getClienteParaExcluirDaTabela();

        if (listaExcluir.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para excluir.\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int option = JOptionPane.showConfirmDialog(null, 
            "Tem certeza que deseja excluir o(s) cliente(s) selecionado(s)?\nTodas as contas vinculadas serão apagadas.", 
            "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            this.tabModel.removeClientes(listaExcluir);

            for (Cliente c : listaExcluir) {
                // Excluir diretamente pelo CPF
                clienteDAO.deleteByCpf(c.getCpf());
            }

            this.clienteSelecionadoParaAtualizacao = null;
            this.linhaClicadaParaAtualizacao = -1;
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.txtNome.setText("");
        this.txtSobreNome.setText("");
        this.txtRG.setText("");
        this.txtCPF.setText("");
        this.txtEndereco.setText("");
        this.tabModel.setListaContatos(clienteDAO.getAllClientes());
        this.clienteSelecionadoParaAtualizacao = null;
        this.linhaClicadaParaAtualizacao = -1;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        this.tabModel.setListaContatos(clienteDAO.getAllClientes());
        this.clienteSelecionadoParaAtualizacao = null;
        this.linhaClicadaParaAtualizacao = -1;
    }//GEN-LAST:event_btnListarActionPerformed

    private void tabClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClienteMouseClicked
        this.linhaClicadaParaAtualizacao = this.tabCliente.rowAtPoint(evt.getPoint());
        Cliente cliente = this.tabModel.getCliente(this.linhaClicadaParaAtualizacao);
        this.setCliente(cliente);
    }//GEN-LAST:event_tabClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }
    
    private List<Cliente> getClienteParaExcluirDaTabela() {
        int[] linhasSelecionadas = this.tabCliente.getSelectedRows();
        List<Cliente> listaExcluir = new ArrayList<>();

        for (int linhasSelecionada : linhasSelecionadas) {
            Cliente contato = this.tabModel.getCliente(linhasSelecionada);
            listaExcluir.add(contato);
        }

        return listaExcluir;
    }

    private Cliente getClienteParaAtualizar() {
        if (this.clienteSelecionadoParaAtualizacao == null) {
            JOptionPane.showMessageDialog(null,"Selecione um cliente na tabela para atualizar.\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
        if (!txtCPF.getText().equals(this.clienteSelecionadoParaAtualizacao.getCpf())) {
            JOptionPane.showMessageDialog(null,"Você não pode atualizar o CPF!!!!\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            txtCPF.setText(this.clienteSelecionadoParaAtualizacao.getCpf());
            return null;
        }
        if (!txtCPF.getText().equals(this.clienteSelecionadoParaAtualizacao.getCpf())) {
            JOptionPane.showMessageDialog(null,"Você não pode atualizar o CPF!!!!\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            txtCPF.setText(this.clienteSelecionadoParaAtualizacao.getCpf());
            return null;
        }

        this.clienteSelecionadoParaAtualizacao.setEndereco(this.txtEndereco.getText());
        this.clienteSelecionadoParaAtualizacao.setNome(this.txtNome.getText());
        this.clienteSelecionadoParaAtualizacao.setRg(this.txtRG.getText());
        this.clienteSelecionadoParaAtualizacao.setSobreNome(this.txtSobreNome.getText());
        return this.clienteSelecionadoParaAtualizacao;
    }
    
    private void setCliente(Cliente c) {
        this.clienteSelecionadoParaAtualizacao = c;
        this.txtNome.setText(c.getNome());
        this.txtSobreNome.setText(c.getSobreNome());
        this.txtRG.setText(c.getRg());
        this.txtCPF.setText(c.getCpf());
        this.txtEndereco.setText(c.getEndereco());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcaoTitulo;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCliente;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtSobreNome;
    // End of variables declaration//GEN-END:variables
}
