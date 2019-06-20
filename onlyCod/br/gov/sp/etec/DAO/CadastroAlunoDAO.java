package br.gov.sp.etec.DAO;

import br.gov.sp.etec.modelagem.CadastroAluno;
import br.gov.sp.etec.conectar.UtilDAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class CadastroAlunoDAO {

    /* Insert */
    public void insert(CadastroAluno a) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO ALUNO VALUES (?,?,?,?,?,?)";

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, a.getId_aluno());
            ps.setString(2, a.getNome());
            ps.setString(3, a.getRg());
            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getEndereco());
            ps.setString(6, a.getDtNasc());
            
            ps.execute();
            ps.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }

    /* Select */
    public void select(CadastroAluno a) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("SELECT * FROM ALUNO");

            ResultSet result = ps.executeQuery();

            if (result.next()) {
                a.setNome(result.getString("nome"));
                a.setRg(result.getString("rg"));
                a.setTelefone(result.getString("telefone"));
                a.setEndereco(result.getString("endereco"));
                a.setDtNasc(result.getString("dt_nascimento"));

            }

            result.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado durante a busca de dados", "ERRO", 0);
            e.printStackTrace();
        }
    }

    /* Update */
    public void update(CadastroAluno a) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("UPDATE ALUNO SET NOME=?, RG=?, TELEFONE=?, ENDERECO=?, DT_NASCIMENTO=? WHERE ID_ALUNO=?");
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getRg());
            ps.setString(3, a.getTelefone());
            ps.setString(4, a.getEndereco());
            ps.setString(5, a.getDtNasc());
            ps.setInt(6, a.getId_aluno());
            
            ps.execute();
            ps.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Dados atualizados com êxito", "Sucesso", 1);
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o dados do Produto", "Erro #UP0", 0);
            e.printStackTrace();
        }
    }

    /* Delete */
    public void delete(CadastroAluno a) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("DELETE FROM ALUNO WHERE ID_ALUNO=?");
            
            ps.setInt(1, a.getId_aluno());

            ps.execute();

            ps.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Aluno excluido", "Sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o aluno");
            e.printStackTrace();
        }
    }

}
