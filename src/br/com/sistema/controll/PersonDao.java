package br.com.sistema.controll;

import br.com.sistema.model.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonDao {

    ConectionMySql base = new ConectionMySql();
    ArrayList<Person> banco;
    Person pessoa;

    public PersonDao() {
        banco = new ArrayList<>();
    }

    public void gravar(Person p) {
        String sql = "INSERT INTO pessoa ";
        sql += "(nome,registro,sexo,escolaridade) ";
        sql += "VALUES ('" + p.getNome() + "'," + p.getRegistro() + ",'"
                + p.getSexo() + "','" + p.getEscolaridade() + "')";
        try {
            Statement stm = base.conectar().createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {

        }

        banco.add(p);
    }

    public ArrayList<Person> listagem() {
        String sql = "SELECT * FROM pessoa";
        ResultSet rs = null;
        Statement stm = null;
        banco.clear();
        try {
            stm = base.conectar().createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                this.pessoa = new Person();
                this.pessoa.setNome(rs.getString("nome"));
                this.pessoa.setRegistro(rs.getInt("registro"));
                this.pessoa.setSexo(rs.getString("sexo").charAt(0));
                this.pessoa.setEscolaridade(rs.getString("escolaridade"));
                banco.add(pessoa);
            }
        } catch (SQLException ex) {

        }
        return banco;
    }

    public Person buscar(int cod) {
        Person novaPessoa = new Person();
        String sql = "SELECT * FROM pessoa WHERE registro=" + cod;
        ResultSet rs = null;
        Statement stm = null;
        try {
            stm = base.conectar().createStatement();
            rs = stm.executeQuery(sql);
            int teste = 0;
            while (rs.next()) {
                teste++;
                novaPessoa.setNome(rs.getString("nome"));
                novaPessoa.setRegistro(rs.getInt("registro"));
                novaPessoa.setSexo(rs.getString("sexo").charAt(0));
                novaPessoa.setEscolaridade(rs.getString("escolaridade"));
            }
            if (teste <= 0) {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada!");
            }
        } catch (SQLException ex) {
              }
        return novaPessoa;
    }

    public Person alterar(Person p) {
        String sql = "UPDATE pessoa SET nome='" + p.getNome() + "'"
                + ", escolaridade='" + p.getEscolaridade() + "', "
                + "sexo='" + p.getSexo() + "'"
                + "WHERE registro=" + p.getRegistro();
        try {
            Statement stm = base.conectar().createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {

        }
        return p;
    }

    public void excluir(int cod) {
        String sql = "DELETE FROM pessoa WHERE registro=" + cod;
        try {
            Statement stm = base.conectar().createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {

        }
    }
}
