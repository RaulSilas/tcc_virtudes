package br.gov.sp.etec.DAO;

import br.gov.sp.etec.modelagem.Chamada;
import br.gov.sp.etec.conectar.UtilDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PresencaDAO {

    public void insert(Chamada c) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "Insert into presenca values (?,?,?,?,?)";

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId_registro());
            ps.setInt(2, c.getId_turma());
            ps.setString(3, c.getNome_aluno());
            ps.setString(4, c.getDia());
            ps.setBoolean(5, c.getPresenca());

            ps.execute();

            ps.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar o registro");
            e.printStackTrace();
        }
    }

    public void delete(Chamada c) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("DELETE FROM PRESENCA WHERE ID_REGISTRO=?");

            ps.setInt(1, c.getId_registro());

            ps.execute();
            ps.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Registro excluido", "Sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o registro do aluno");
            e.printStackTrace();
        }
    }

}
