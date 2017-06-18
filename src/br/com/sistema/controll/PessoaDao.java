package br.com.sistema.controll;

import br.com.sistema.model.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PessoaDao {

    ConexaoMySql base = new ConexaoMySql();
    ArrayList<Pessoa> banco;
    Pessoa pessoa;

    public PessoaDao() {
        banco = new ArrayList<>();
    }

    public void gravar(Pessoa p) {
        String sql = "insert into pessoa ";
        sql += "(nome,registro,sexo,escolaridade) ";
        sql += "values ('" + p.getNome() + "'," + p.getRegistro() + ",'"
                + p.getSexo() + "','" + p.getEscolaridade() + "')";
        try {
            Statement stm = base.conectar().createStatement();
            stm.executeUpdate(sql);
            //   JOptionPane.showMessageDialog(null,"Dados Cadastrados com Sucesso!");
        } catch (SQLException ex) {

        }

        banco.add(p);
    }

    public ArrayList<Pessoa> listagem() {
        String sql = "select * from pessoa";
        ResultSet rs = null;
        Statement stm = null;
        banco.clear();
        try {
            stm = base.conectar().createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                this.pessoa = new Pessoa();
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

    public Pessoa buscar(int cod) {
        Pessoa novaPessoa = new Pessoa();
        String sql = "select * from pessoa where registro=" + cod;
        ResultSet rs = null;
        Statement stm = null;
        try {
            stm = base.conectar().createStatement();
            rs = stm.executeQuery(sql);
            int teste=0;
                while (rs.next()) {
                    teste++;
                    novaPessoa.setNome(rs.getString("nome"));
                    novaPessoa.setRegistro(rs.getInt("registro"));
                    novaPessoa.setSexo(rs.getString("sexo").charAt(0));
                    novaPessoa.setEscolaridade(rs.getString("escolaridade"));
                }
            if(teste<=0)
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada!");
        } catch (SQLException ex) {

        }
        return novaPessoa;
}

    public Pessoa alterar(Pessoa p) {
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
            System.out.println("tttt   " + sql);
            stm.executeUpdate(sql);
        } catch (SQLException ex) {

        }
    }
}
