package br.gov.sp.etec.DAO;

import br.gov.sp.etec.conectar.UtilDAO;
import br.gov.sp.etec.modelagem.Turma;
import java.sql.*;
import javax.swing.JOptionPane;

public class TurmaDAO {

    public void insert(Turma t) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO TURMA VALUES (?,?,?,?)";
        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, t.getId_turma());
            ps.setInt(2, t.getId_aluno());
            ps.setInt(3, t.getId_produto());
            ps.setString(4, t.getNome_turma());

            ps.execute();

            ps.close();
            con.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }

}
