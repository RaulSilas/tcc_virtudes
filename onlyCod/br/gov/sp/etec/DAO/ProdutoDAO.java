/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sp.etec.DAO;

import java.sql.*;
import br.gov.sp.etec.modelagem.Produto;
import br.gov.sp.etec.conectar.UtilDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author iMaj
 */
public class ProdutoDAO {

    /*INSERT*/
    public void insert(Produto p) {

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("INSERT INTO PRODUTO VALUES (?,?,?,?,?)");
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNome());
            ps.setInt(3, p.getId_tipo());
            ps.setInt(4, p.getQuantidade());
            ps.setString(5, p.getCor());
            ps.execute();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Produto registrado!");

        } catch (SQLIntegrityConstraintViolationException in) {
            JOptionPane.showMessageDialog(null, "Descrição: Nome já cadastrado. Por favor, insira outro. \nCódigo: INBD02", "ERRO", 0);
            in.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios \nCódigo: INBD01", "ERRO", 0);
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            ex.printStackTrace();
        }

    }

    /*SELECT*/
    public void select(Produto p) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("SELECT * FROM PRODUTO WHERE ID= ?");
            ps.setInt(1, p.getId());
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                p.setId(result.getInt("ID"));
                p.setNome(result.getString("NOME"));
                p.setTipo(result.getString("TIPO"));
                p.setQuantidade(result.getInt("QUANTIDADE"));
                p.setCor(result.getString("COR"));
                JOptionPane.showMessageDialog(null, "Dados encontrados", "Sucesso", 1);
            }
            result.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado durante a busca de dados", "ERRO", 0);
            e.printStackTrace();
        }

    }

    /*UPDATE*/
    public void update(Produto p) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("UPDATE PRODUTO SET NOME=?, TIPO=?, QUANTIDADE=?, COR=? WHERE ID=?");
            ps.setString(1, p.getNome());
            ps.setInt(2, p.getId_tipo());
            ps.setInt(3, p.getQuantidade());
            ps.setString(4, p.getCor());
            ps.setInt(5, p.getId());
            ps.execute();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Dados atualizados com êxito", "Sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o dados do Produto", "Erro #UP0", 0);
            e.printStackTrace();
        }
    }

    /*DELETE*/
    public void delete(Produto p) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("DELETE FROM PRODUTO WHERE ID=?");
            ps.setInt(1, p.getId());
            ps.execute();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Produto excluido", "Sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o produto");
            e.printStackTrace();
        }

    }

    /*Busca os dados no SGBD*/
    /*A única diferença é que pego o nome do tipo e não a chave estrangeira*/
    public List<Produto> preencher() {
        Connection c = UtilDAO.conectar();
        String sql = " select   p.id, p.nome, tp.nome tipo, p.quantidade, p.cor"
                + " from     produto p, tipo_produto tp"
                + " where	tp.id = p.tipo;";
        Statement ps = null;
        ResultSet rs = null;
        List<Produto> listaContato = new ArrayList<>();
        try {
            ps = c.createStatement();
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("ID"));
                p.setNome(rs.getString("NOME"));
                p.setTipo(rs.getString("TIPO"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setCor(rs.getString("COR"));
                listaContato.add(p);
            }
            rs.close();
            ps.close();
            c.close();
            return listaContato;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /*Busca TIPO de Produto*/
    public List<Produto> tipo() {
        Connection c = UtilDAO.conectar();
        String sql = "select * from tipo_produto";
        Statement ps = null;
        ResultSet rs = null;
        List<Produto> nomeTipoProduto = new ArrayList<>();
        try {
            ps = c.createStatement();
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                Produto p = new Produto();
                p.setTipo(rs.getString("NOME"));
                nomeTipoProduto.add(p);
            }
            rs.close();
            ps.close();
            c.close();
            return nomeTipoProduto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertTipo(Produto p) {
        Connection c;
        String query = "insert into tipo_produto (nome) values (?)";
        PreparedStatement ps;
        try {
            c = UtilDAO.conectar();
            ps = c.prepareStatement(query);
            ps.setString(1, p.getTipo());
            ps.execute();
            ps.close();
            c.close();
            JOptionPane.showMessageDialog(null, "Adicionado!", "Sucesso", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Descrição: Erro Inesperado! \nCódigo: INTPEx", "ERRO", 0);
            ex.printStackTrace();
        }
    }

    public void selectTipo(Produto p) {
        Connection c;
        PreparedStatement ps = null;
        ResultSet rs;
        String query = "select * from tipo_produto where nome = ?";
        try {
            c = UtilDAO.conectar();
            ps = c.prepareStatement(query);
            ps.setString(1, p.getTipo());
            rs = ps.executeQuery();

            if (rs.next()) {
                p.setId_tipo(rs.getInt("ID"));
            }
            rs.close();
            ps.close();
            c.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado durante a busca de dados", "ERRO", 0);
            e.printStackTrace();

        }
    }

    public void deleteTipo(Produto p) {
        Connection c;
        PreparedStatement ps = null;
        String query = "delete from tipo_produto where id= ?";
        try {
            c = UtilDAO.conectar();
            ps = c.prepareStatement(query);
            ps.setInt(1, p.getId_tipo());
            ps.execute();
            
            query = "delete from produto where tipo=?";
            ps = c.prepareStatement(query);
            ps.setInt(1, p.getId_tipo());
            ps.execute();
            
            
            ps.close();
            c.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
