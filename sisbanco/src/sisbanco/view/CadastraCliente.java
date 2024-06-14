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
import sisbanco.entities.Cliente;
import sisbanco.entities.ClienteTableModel;
import sisbanco.bd.BancoDeDados;
import static sisbanco.utils.Validador.validaCpf;
import static sisbanco.utils.Validador.validaRg;

/**
 *
 * @author Alves
 */
public class CadastraCliente extends javax.swing.JFrame {
   private ClienteTableModel tabModel = new ClienteTableModel();
   private TableRowSorter<ClienteTableModel> sorter;
   private int linhaClicadaParaAtualizacao = -1;
   private Cliente clienteSelecionadoParaAtualizacao;
   private String criterioSelecionado;
   private String termoBusca;
   //private ContaCliente contaClienteForm = new ContaCliente();
    /**
     * Creates new form CadastraCliente
     */
    public CadastraCliente() {
        initComponents();
        tabModel.setListaContatos(new ArrayList<>(BancoDeDados.hashClientes.values()));
        this.clienteSelecionadoParaAtualizacao = null;
        linhaClicadaParaAtualizacao=-1;
        tabCliente.setModel(tabModel);
        sorter = new TableRowSorter<>(tabModel);
        tabCliente.setRowSorter(sorter);
        
     for (int i = 0; i < tabModel.getColumnCount(); i++) {
        final int columnIndex = i;
        tabCliente.getTableHeader().addMouseListener(new MouseAdapter() {
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

        jButton1 = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobreNome = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Sobre Nome");

        jLabel3.setText("RG");

        jLabel4.setText("CPF");

        jLabel5.setText("Endereço");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tabCliente.setModel(tabModel);
        tabCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCliente);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobreNome, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnListar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = txtNome.getText();
        String sobreNome = txtSobreNome.getText();
        String rg = txtRG.getText();
        String cpf = txtCPF.getText();
        String endereco = txtEndereco.getText();
        
        if(nome.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nome não Valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(sobreNome.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Sobrenome não Valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(endereco.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Endereço não Valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if(!validaCpf(cpf)) {
            JOptionPane.showMessageDialog(null,"CPF não Valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;  
        }
        if(!validaRg(rg)) {
            JOptionPane.showMessageDialog(null,"RG não Valido\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;  
        }
        
        Cliente c = new Cliente(nome,sobreNome,rg,cpf,endereco);
        BancoDeDados.hashClientes.put(cpf, c);
        this.tabModel.setListaContatos(new ArrayList<>(BancoDeDados.hashClientes.values()));
        this.tabCliente.setRowSelectionInterval(BancoDeDados.hashClientes.size()-1, BancoDeDados.hashClientes.size()-1);
        this.clienteSelecionadoParaAtualizacao = c;
        linhaClicadaParaAtualizacao = BancoDeDados.hashClientes.size()-1;
    }//GEN-LAST:event_btnCadastrarActionPerformed

    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        tabModel.setListaContatos(new ArrayList<>(BancoDeDados.hashClientes.values()));
        this.clienteSelecionadoParaAtualizacao = null;
        linhaClicadaParaAtualizacao=-1;
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtSobreNome.setText("");
        txtRG.setText("");
        txtCPF.setText("");
        txtEndereco.setText("");
        tabModel.setListaContatos(new ArrayList<>(BancoDeDados.hashClientes.values()));
        this.clienteSelecionadoParaAtualizacao = null;
        linhaClicadaParaAtualizacao=-1;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        List<Cliente> listaExcluir = getClienteParaExcluirDaTabela();
        if(listaExcluir.isEmpty()){
            JOptionPane.showMessageDialog(null,"Selecione alguma linha para excluir.\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }
        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o(s) cliente(s) selecionado(s)?\nTodas as contas vinculadas serão apagadas.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
        this.tabModel.removeClientes(listaExcluir);
        for(Cliente c:listaExcluir)
            BancoDeDados.hashClientes.remove(c.getCpf());
        this.clienteSelecionadoParaAtualizacao = null;
        linhaClicadaParaAtualizacao=-1;
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClienteMouseClicked
        //Pega a linha clicada
        linhaClicadaParaAtualizacao = this.tabCliente.rowAtPoint(evt.getPoint());
        //Pega o contato da linha clicada
        Cliente cliente = this.tabModel.getCliente(linhaClicadaParaAtualizacao);
        //Seta os dados no formulário
        this.setCliente(cliente);
    }//GEN-LAST:event_tabClienteMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        
        Cliente c = this.getClienteParaAtualizar();
        if(c==null){
            return;
        }
        BancoDeDados.hashClientes.replace(c.getCpf(), c);
        this.tabModel.atualizarCliente(linhaClicadaParaAtualizacao);

    }//GEN-LAST:event_btnAtualizarActionPerformed
    private void updateContaClienteForm() {
        List<Cliente> clientes = new ArrayList<>(BancoDeDados.hashClientes.values());
        ContaCliente outraTela = new ContaCliente(clientes);
        outraTela.setVisible(true);
    }
    private List<Cliente> getClienteParaExcluirDaTabela() {
        int[] linhasSelecionadas = this.tabCliente.getSelectedRows();
        List<Cliente> listaExcluir = new ArrayList();
        for (int i = 0; i < linhasSelecionadas.length; i++) {
            Cliente contato = this.tabModel.getCliente(linhasSelecionadas[i]);
            listaExcluir.add(contato);
        }
        return listaExcluir;
    }
    
    private Cliente getClienteParaAtualizar() {
        if(clienteSelecionadoParaAtualizacao==null){
            JOptionPane.showMessageDialog(null,"Selecione um cliente na tabela para atualizar.\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
        if(!txtCPF.getText().equals(clienteSelecionadoParaAtualizacao.getCpf())){
            JOptionPane.showMessageDialog(null,"Você não pode atualizar o CPF!!!!\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            txtCPF.setText(clienteSelecionadoParaAtualizacao.getCpf());
            return null;
        }
        clienteSelecionadoParaAtualizacao.setEndereco(txtEndereco.getText());
        clienteSelecionadoParaAtualizacao.setNome(txtNome.getText());
        clienteSelecionadoParaAtualizacao.setRg(txtRG.getText());
        clienteSelecionadoParaAtualizacao.setSobreNome(txtSobreNome.getText());
        return clienteSelecionadoParaAtualizacao;
                
    }
    
    private void setCliente(Cliente c){
        this.clienteSelecionadoParaAtualizacao = c;
        txtNome.setText(c.getNome());
        txtSobreNome.setText(c.getSobreNome());
        txtRG.setText(c.getRg());
        txtCPF.setText(c.getCpf());
        txtEndereco.setText(c.getEndereco());        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCliente;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtSobreNome;
    // End of variables declaration//GEN-END:variables

}
