/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sp.etec.modelagem;

import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iMaj
 */
public class MODTblProduto extends AbstractTableModel {

    public Produto p = new Produto();
    private List<Produto> linhas = new ArrayList<>();
    private String[] colunas = {"ID", "NOME", "TIPO", "QTDE", "COR"};

    public MODTblProduto(List<Produto> p) {
        linhas = new ArrayList<Produto>(p);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0: return linhas.get(linha).getId();
            case 1: return linhas.get(linha).getNome();
            case 2: return linhas.get(linha).getTipo();
            case 3: return linhas.get(linha).getQuantidade();
            case 4: return linhas.get(linha).getCor();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0: linhas.get(linha).setId((int)valor);
            break;
            case 1: linhas.get(linha).setNome((String) valor);
            break;
            case 2: linhas.get(linha).setTipo((String) valor);
            break;
            case 3: linhas.get(linha).setQuantidade((int) valor);
            break;
            case 4: linhas.get(linha).setCor((String) valor);
            break;
    }
     this.fireTableRowsUpdated(linha, linha);
    }
    
    public void tamanho(int t, int c){
        
    }
    
    public void adicionarLinha(Produto p) {
        this.linhas.add(p);
        this.fireTableDataChanged();
    }
    
    public void removerLinha(int linha){
    linhas.remove(linha);
    fireTableRowsDeleted(linha, linha);
    }

}
