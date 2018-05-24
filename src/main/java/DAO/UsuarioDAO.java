/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import model.Usuario;

/**
 *
 * @author Sanka
 */
public class UsuarioDAO implements DAO<Usuario> {

    private Connection conn;

    @Override
    public void atualizar(Usuario user) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(user);
        t.commit();
    }

    @Override
    public void excluir(Usuario user) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(user);
        t.commit();
    }

    public boolean login(String username, String senha) throws Exception {

        List<Usuario> usuarios = todosDados();

        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(username)) {
                if (usuario.getSenha().equals(senha)) {
                    return true;
                }
            }
        }
        return false;

    }

    @Override
    public Usuario procurarObjeto(Integer id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Usuario) session.load(Usuario.class, id);
    }

    @Override
    public void salvar(Usuario user) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(user);
        t.commit();
    }

    @Override
    public List todosDados() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from usuario").list();
        t.commit();
        return lista;
    }

    /**
     * Get the value of conn
     *
     * @return the value of conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * Set the value of conn
     *
     * @param conn new value of conn
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

}
