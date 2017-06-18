package br.com.sistema.controll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoMySql {

    private String host = "localhost";
    private String usuario = "root";
    private String senha = "admin";
    private String banco = "pessoa";
    public Connection con;

    public ConexaoMySql() {}
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + host + "/" + banco + "?user=" + usuario + "&password=" + senha);
            System.out.println("Banco conectado!");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o driver");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Conexão:" + ex.getMessage());

        }
        return con;
    }

    public void desconectar() {
        try {
            con.close();
            System.out.println("Fechando...");
            
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        ConexaoMySql conecte = new ConexaoMySql();
        conecte.conectar();
        conecte.desconectar();
    }

}
