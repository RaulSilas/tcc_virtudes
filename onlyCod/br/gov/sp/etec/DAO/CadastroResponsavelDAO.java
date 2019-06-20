package br.gov.sp.etec.DAO;

import br.gov.sp.etec.modelagem.CadastroResponsavel;
import br.gov.sp.etec.conectar.UtilDAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class CadastroResponsavelDAO {

    public void insert(CadastroResponsavel cR) {
        UtilDAO dao = new UtilDAO();
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO RESPONSAVEL VALUES (?,?,?,?,?,?)";

        try {
            con = UtilDAO.conectar();

            ps = con.prepareStatement(sql);

            ps.setInt(1, cR.getId_responsavel());
            ps.setString(2, cR.getNome());
            ps.setString(3, cR.getRg());
            ps.setString(4, cR.getCpf());
            ps.setString(5, cR.getTelefone());
            ps.setString(6, cR.getNome_aluno());
            
            ps.execute();
            ps.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }

    public void select(CadastroResponsavel cR) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT * FROM RESPONSAVEL";
            con = UtilDAO.conectar();

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cR.setId_responsavel(rs.getInt("id_responsavel"));
                cR.setNome(rs.getString("nome"));
                cR.setRg(rs.getString("rg"));
                cR.setCpf(rs.getString("cpf"));
                cR.setTelefone(rs.getString("telefone"));
                cR.setNome_aluno(rs.getString("nome_aluno"));
            }

            rs.close();

            ps.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }

    public void update(CadastroResponsavel cR) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE RESPONSAVEL SET NOME=?, RG=?, CPF=?, TELEFONE=?, NOME_ALUNO=? WHERE ID_RESPONSAVEL=?";
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cR.getNome());
            ps.setString(2, cR.getRg());
            ps.setString(3, cR.getCpf());
            ps.setString(4, cR.getTelefone());
            ps.setString(5, cR.getNome_aluno());
            ps.setInt(6, cR.getId_responsavel());

            ps.executeUpdate();

            ps.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Dados atualizados com êxito", "Sucesso", 1);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }

    public void delete(CadastroResponsavel cR) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            String sql = "DELETE FROM RESPONSAVEL WHERE ID_RESPONSAVEL=?";
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, cR.getId_responsavel());

            ps.execute();

            ps.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Responsável excluido", "Sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }
}
