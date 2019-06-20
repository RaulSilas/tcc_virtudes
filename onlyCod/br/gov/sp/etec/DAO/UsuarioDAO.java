package br.gov.sp.etec.DAO;

import br.gov.sp.etec.modelagem.Usuario;
import br.gov.sp.etec.conectar.UtilDAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    //METODO DE LOGIN
    public boolean checkLogin(String login, String senha) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;

        try {

            String sql = ("SELECT USUARIO,SENHA FROM USUARIO WHERE USUARIO = ? AND SENHA =?");
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);

            rs = ps.executeQuery();

            if (rs.next()) {

                check = true;

            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
        return check;
    }

//METODO PARA RECUPERAR A SENHA
    public Usuario recuperarSenha(Usuario u) {
        Connection con = null;

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = ("SELECT * FROM USUARIO WHERE cpf=?");
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getCpf());

            rs = ps.executeQuery();

            if (rs.next()) {
                u.setUsuario(rs.getString("Usuario"));
                u.setSenha(rs.getString("SENHA"));

            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
        return u;
    }

    //METODO PARA CADASTAR USUARIO
    public void cadastrarUsuario(Usuario u) {

        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO USUARIO (USUARIO, CPF, TELEFONE, ENDERECO, SENHA) values (?,?,?,?,?)";

        try {
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getCpf());
            ps.setString(3, u.getTelefone());
            ps.setString(4, u.getEndereco());
            ps.setString(5, u.getSenha());
            

            ps.execute();

            ps.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado!", "Sucesso", 1);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }
    }

    public Usuario select(Usuario u) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT * FROM USUARIO WHERE CPF=?";
            con = UtilDAO.conectar();
            ps.setString(1, u.getCpf());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                u.setUsuario(rs.getString("Usuario"));
                u.setTelefone(rs.getString("Telefone"));
                u.setEndereco(rs.getString("Endereco"));

            }

            rs.close();

            ps.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO!", "ERRO", 0);
            e.printStackTrace();
        }

        return u;
    }

    public void update(Usuario u) {
        try {
            Connection con = null;
            PreparedStatement ps = null;
            String sql = "UPDATE USUARIO SET USUARIO=?, TELEFONE=?, ENDERECO=? WHERE CPF=?";
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getTelefone());
            ps.setString(3, u.getEndereco());
            ps.setString(4, u.getCpf());

            ps.executeUpdate();

            ps.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Dados atualizados com êxito", "Sucesso", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o aluno");
            e.printStackTrace();
        }
    }

    public void delete(Usuario u) {
        try {
            Connection con = null;
            PreparedStatement ps = null;
            String sql = "DELETE FROM USUARIO WHERE CPF=?";
            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, u.getCpf());

            ps.execute();

            ps.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Usuário excluido", "Sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o aluno");
            e.printStackTrace();
        }
    }
}
