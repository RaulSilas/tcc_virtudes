package br.gov.sp.etec.conectar;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class UtilDAO {

    public static Connection conectar() {

        Connection con = null;

        try {
            String nomeBD, user, senha, host;
            int porta;
            Properties p = new Properties();
            FileInputStream shevi = new FileInputStream("propriedades/atributos.properties");
            p.load(shevi);
            
            host = p.getProperty("conexao.config.bd.host");
            porta = Integer.parseInt(p.getProperty("conexao.config.bd.porta"));
            nomeBD = p.getProperty("conexao.config.bd.nomebd");
            user = p.getProperty("conexao.config.bd.user");
            senha = p.getProperty("conexao.config.bd.senha");
            
            con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + nomeBD, user, senha);

        } 
        catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado: 'atributos.properties'","Erro #cbd01",0);
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Erro durante leitura do arquivo 'atributos.properties'","Erro #cbd01",0);
            ioe.printStackTrace();
        }catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro inesperado durante a tentativa de conexão com o banco de dados","Erro #cbd00",0);
        } 

        return con;
    }

}
