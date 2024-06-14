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
import sisbanco.bd.BancoDeDados;
import static sisbanco.utils.Validador.validaCpf;
import static sisbanco.utils.Validador.validaRg;

public class CadastraCliente extends javax.swing.JFrame {
    // START OF GENERATED CODE
    @SuppressWarnings("unchecked")
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
    }

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
    // END OF GENERATED CODE

    private ClienteTableModel tabModel = new ClienteTableModel();
    private TableRowSorter<ClienteTableModel> sorter;
    private int linhaClicadaParaAtualizacao = -1;
    private Cliente clienteSelecionadoParaAtualizacao;

    public CadastraCliente() {
        initComponents();
        this.tabModel.setListaContatos(BancoDeDados.getAllClientes());
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
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
        BancoDeDados.adicionarCliente(novoCliente);
        this.tabModel.setListaContatos(BancoDeDados.getAllClientes());
        this.tabCliente.setRowSelectionInterval(BancoDeDados.getAllClientes().size() - 1, BancoDeDados.getAllClientes().size() - 1);
        this.clienteSelecionadoParaAtualizacao = novoCliente;
        this.linhaClicadaParaAtualizacao = BancoDeDados.getAllClientes().size() - 1;
    }

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
        this.tabModel.setListaContatos(BancoDeDados.getAllClientes());
        this.clienteSelecionadoParaAtualizacao = null;
        this.linhaClicadaParaAtualizacao = -1;
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        this.txtNome.setText("");
        this.txtSobreNome.setText("");
        this.txtRG.setText("");
        this.txtCPF.setText("");
        this.txtEndereco.setText("");
        this.tabModel.setListaContatos(BancoDeDados.getAllClientes());
        this.clienteSelecionadoParaAtualizacao = null;
        this.linhaClicadaParaAtualizacao = -1;
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        List<Cliente> listaExcluir = getClienteParaExcluirDaTabela();

        if (listaExcluir.isEmpty()){
            JOptionPane.showMessageDialog(null,"Selecione alguma linha para excluir.\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }

        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o(s) cliente(s) selecionado(s)?\nTodas as contas vinculadas serão apagadas.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            this.tabModel.removeClientes(listaExcluir);

            for (Cliente c : listaExcluir)
                BancoDeDados.removerCliente(c.getCpf());

            this.clienteSelecionadoParaAtualizacao = null;
            this.linhaClicadaParaAtualizacao = -1;
        }
    }

    private void tabClienteMouseClicked(java.awt.event.MouseEvent evt) {
        this.linhaClicadaParaAtualizacao = this.tabCliente.rowAtPoint(evt.getPoint());
        Cliente cliente = this.tabModel.getCliente(this.linhaClicadaParaAtualizacao);
        this.setCliente(cliente);
    }

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        Cliente clienteParaAtualizar = this.getClienteParaAtualizar();
        BancoDeDados.updateCliente(clienteParaAtualizar);
        this.tabModel.atualizarCliente(this.linhaClicadaParaAtualizacao);
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
}
