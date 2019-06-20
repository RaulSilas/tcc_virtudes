package br.gov.sp.etec.DAO;

import br.gov.sp.etec.modelagem.Mensalidades;
import br.gov.sp.etec.conectar.UtilDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

public class MensalidadeDAO {

    public void insert(Mensalidades m) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "Insert into mensalidade values (?,?,?,?,?)";

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, m.getId_mensalidade());
            ps.setInt(2, m.getId_aluno());
            ps.setString(3, m.getMes());
            ps.setBoolean(4, m.getPendente());
            ps.setString(5, m.getNome());

            ps.execute();

            ps.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }

    public void delete(Mensalidades m) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement("DELETE FROM mensalidade WHERE ID_MENSALIDADE=?");
            ps.setInt(1, m.getId_mensalidade());
            ps.execute();

            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso", "Sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o registro");
            e.printStackTrace();
        }
    }
}
