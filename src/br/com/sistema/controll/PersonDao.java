package br.com.sistema.controll;

import br.com.sistema.model.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDao {

    ConectionMySql base = new ConectionMySql();
    ArrayList<Person> banco;
    Person pessoa;

    public PersonDao() {
        banco = new ArrayList<>();
    }

    public boolean gravar(Person p) {
        String sql = "INSERT INTO pessoa ";
        sql += "(nome,registro,sexo,escolaridade) ";
        sql += "VALUES ('" + p.getNome() + "'," + p.getRegistro() + ",'"
                + p.getSexo() + "','" + p.getEscolaridade() + "')";
        try {
            Person newPerson = buscar(p.getRegistro());
            if (newPerson.getRegistro() != p.getRegistro()) {
                Statement stm = base.conectar().createStatement();
                stm.executeUpdate(sql);
                banco.add(p);
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        } finally {
            base.desconectar();
        }
    }

    public ArrayList<Person> listagem() {
        String sql = "SELECT * FROM pessoa ORDER BY registro";
        ResultSet rs;
        Statement stm;
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
        } finally {
            base.desconectar();
        }
        return banco;
    }

    public Person buscar(int cod) {
        Person novaPessoa = new Person();
        String sql = "SELECT * FROM pessoa WHERE registro=" + cod;
        ResultSet rs;
        Statement stm;
        try {
            stm = base.conectar().createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                novaPessoa.setNome(rs.getString("nome"));
                novaPessoa.setRegistro(rs.getInt("registro"));
                novaPessoa.setSexo(rs.getString("sexo").charAt(0));
                novaPessoa.setEscolaridade(rs.getString("escolaridade"));
            }
        } catch (SQLException ex) {
        } finally {
            base.desconectar();
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
        } finally {
            base.desconectar();
        }
        return p;
    }

    public boolean excluir(int cod) {
        String sql = "DELETE FROM pessoa WHERE registro=" + cod;
        int test;
        try {
            Statement stm = base.conectar().createStatement();
            test = stm.executeUpdate(sql);
            if (test > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        } finally {
            base.desconectar();
        }
    }
}
