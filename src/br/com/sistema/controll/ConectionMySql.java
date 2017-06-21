package br.com.sistema.controll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectionMySql {

    private final String host = "localhost";
    private final String user = "root";
    private final String password = "admin";
    private final String database = "pessoa";
    public Connection connection;

    public ConectionMySql() {
    }

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database + "?user=" + user + "&password=" + password);
            System.out.println("Banco conectado!");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o driver!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Conexão:" + ex.getMessage());

        }
        return connection;
    }

    public void disconnect() {
        try {
            connection.close();
            System.out.println("Banco desconectado!");

        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        ConectionMySql con = new ConectionMySql();
        con.connect();
        con.disconnect();
    }

}
