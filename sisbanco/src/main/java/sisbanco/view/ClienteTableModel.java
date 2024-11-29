/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sisbanco.view;

import sisbanco.models.entities.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel{
    private final String[] colunas = new String[] {"Nome", "Sobrenome", "RG", "CPF", "Endereco"};

    private List<Cliente> lista = new ArrayList<>();
    
    public ClienteTableModel(List<Cliente> lista){
        this.lista=lista;
    }

    public ClienteTableModel() {}

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente customer = lista.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> customer.getNome();//if column 0 (code)
            case 1 -> customer.getSobreNome();//if column 1 (name)
            case 2 -> customer.getRg();//if column 2 (birthday)
            case 3 -> customer.getCpf();
            case 4 -> customer.getEndereco();
            default -> null;
        };
    }

    public boolean removeCliente(Cliente customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaCliente(Cliente customer) {
        this.lista.add(customer);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaContatos(List<Cliente> contatos) {
        this.lista = contatos;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }
    
    public void setListaContatos(HashMap<String,Cliente> contatos) {
        
        this.lista = new ArrayList<Cliente>();
        for(Cliente c:contatos.values()){
            this.lista.add(c);
        }
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Cliente getCliente(int linha){
        return lista.get(linha);
    }

    public void removeClientes(List<Cliente> listaParaExcluir) {
        for(Cliente c:listaParaExcluir)
            removeCliente(c);
    }
    
    public void atualizarCliente(int linha){
        this.fireTableRowsUpdated(linha, linha);
    }
}
