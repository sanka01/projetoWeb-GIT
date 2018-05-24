/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAO;
import DAO.UsuarioDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import model.Usuario;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author samuel morais
 */
@ManagedBean(name = "usuarioControl")
@SessionScoped
public class UsuarioControler {

    private DataModel lista_usuarios;
    private String login;
    private String senha;
    private String mensagem;
    private Usuario usuario;
    private boolean cadastroView;
    private boolean loginView = true;

    public String autenticar() throws Exception {

        UsuarioDAO dao = new UsuarioDAO();
        if (dao.login(login, senha)) {
            FacesContext.getCurrentInstance().getExternalContext().
                    getSessionMap().put("Usuario", new Usuario(login, senha));
            return "sucesso";
        }
        this.mensagem = "Usuario ou senha invalidos";
        return "falha";

    }

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    public DataModel getListarUsuarios() throws Exception {
        List<Usuario> lista = new UsuarioDAO().todosDados();
        lista_usuarios = new ListDataModel(lista);
        return lista_usuarios;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioControler() throws Exception {
        this.loginView = true;
        this.cadastroView = false;
        this.inicializar();
    }

    public void salvar() throws Exception {
        this.mensagem = "cadastro concluido";
        DAO dao = new UsuarioDAO();
        dao.salvar(usuario);
        this.inicializar();
        this.cadastroView = false;
        this.loginView = true;
    }

    public void cadastrar(AjaxBehaviorEvent e) {
        this.inicializar();
        this.cadastroView = !this.cadastroView;
        this.loginView = !this.loginView;
    }

    private void inicializar() {
        this.login = "";
        this.senha = "";
        this.mensagem = "";
        this.usuario = new Usuario();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String logout() {
        this.inicializar();
        return ("logout");
    }

    public boolean isLoginView() {
        return loginView;
    }

    public void setLoginView(boolean loginView) {
        this.loginView = loginView;
    }

    /**
     * @return the usuario
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the usuario to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isCadastroView() {
        return cadastroView;
    }

    public void setCadastroView(boolean cadastroBool) {
        this.cadastroView = cadastroBool;
    }

}
