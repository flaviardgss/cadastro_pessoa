package br.com.sistema.controll;

import br.com.sistema.model.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDao {

    ConectionMySql base = new ConectionMySql();
    ArrayList<Person> database;
    Person person;

    public PersonDao() {
        database = new ArrayList<>();
    }

    public boolean save(Person p) {
        String sql = "INSERT INTO pessoa ";
        sql += "(nome,registro,sexo,escolaridade) ";
        sql += "VALUES ('" + p.getName() + "'," + p.getRegister() + ",'"
                + p.getSex() + "','" + p.getLevel() + "')";
        try {
            Person newPerson = search(p.getRegister());
            if (newPerson.getRegister() != p.getRegister()) {
                Statement stm = base.connect().createStatement();
                stm.executeUpdate(sql);
                database.add(p);
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        } finally {
            base.disconnect();
        }
    }

    public ArrayList<Person> listing() {
        String sql = "SELECT * FROM pessoa ORDER BY registro";
        ResultSet rs;
        Statement stm;
        database.clear();
        try {
            stm = base.connect().createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                this.person = new Person();
                this.person.setName(rs.getString("nome"));
                this.person.setRegister(rs.getInt("registro"));
                this.person.setSex(rs.getString("sexo").charAt(0));
                this.person.setLevel(rs.getString("escolaridade"));
                database.add(person);
            }
        } catch (SQLException ex) {
        } finally {
            base.disconnect();
        }
        return database;
    }

    public Person search(int cod) {
        Person newPerson = new Person();
        String sql = "SELECT * FROM pessoa WHERE registro=" + cod;
        ResultSet rs;
        Statement stm;
        try {
            stm = base.connect().createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                newPerson.setName(rs.getString("nome"));
                newPerson.setRegister(rs.getInt("registro"));
                newPerson.setSex(rs.getString("sexo").charAt(0));
                newPerson.setLevel(rs.getString("escolaridade"));
            }
        } catch (SQLException ex) {
        } finally {
            base.disconnect();
        }
        return newPerson;
    }

    public Person change(Person p) {
        String sql = "UPDATE pessoa SET nome='" + p.getName() + "'"
                + ", escolaridade='" + p.getLevel() + "', "
                + "sexo='" + p.getSex() + "'"
                + "WHERE registro=" + p.getRegister();
        try {
            Statement stm = base.connect().createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
        } finally {
            base.disconnect();
        }
        return p;
    }

    public boolean delete(int cod) {
        String sql = "DELETE FROM pessoa WHERE registro=" + cod;
        int test;
        try {
            Statement stm = base.connect().createStatement();
            test = stm.executeUpdate(sql);
            if (test > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        } finally {
            base.disconnect();
        }
    }
}
