/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bd.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;

/**
 *
 * @author Sanka
 */
public class ProjetoDAO  {
/*
    Connection conn;

    public ProjetoDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();

        } catch (Exception e) {
            throw new Exception("Erro: "
                    + "\n" + e.getMessage());
        }

    }

    @Override
    public void atualizar(Projeto objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Projeto objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projeto procurarObjeto(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvar(Projeto projeto) throws Exception {
        PreparedStatement ps = null;
        Connection conn = null;
        if (projeto == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }

        try {
            String SQL = "INSERT INTO repositorio_web.projeto "
                    + "(nome, "
                    + "isPublic, "
                    + ") "
                    + "values (?, ?)";
            conn = this.conn;
            ps = conn.prepareStatement(SQL);
            ps.setString(1, ("".equals(projeto.getNome())) ? "null" : projeto.getNome());
            ps.setString(2, (projeto.isIsPublic()) ? "true" : "false");
        //    ps.setString(3, ("".equals(projeto.getUsuario().getId())) ? "null" : projeto.getUsuario().getId());
       //     ps.setString(4, ("".equals(projeto.getTipo())) ? "null" : projeto.getTipo());

            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new Exception("Erro ao inserir dados " + sqle);
        } finally {
            conn.close();

        }
    }

    @Override
    public List todosDados() throws Exception {
        Connection conn = this.conn;
        PreparedStatement stmt = conn.prepareStatement("select * from projeto");
        ResultSet rs = stmt.executeQuery();
        List<Projeto> projetos = new ArrayList<>();
        while (rs.next()) {
            Projeto projeto = new Projeto();
            projeto.setIsPublic(rs.getBoolean("isPublic"));
            projeto.setNome(rs.getString("nome"));
            projeto.setTipo(rs.getInt("tipo_idtipo"));
            //     projeto.setUsuario();
            projetos.add(projeto);
        }
        return projetos;
    }
*/
}
