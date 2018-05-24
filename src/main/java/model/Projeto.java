/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sanka
 */
public class Projeto {
    
    private String nome;

    private boolean isPublic;
 
    private Usuario usuario;

    private int idProjeto;

    private int tipo;

    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Get the value of idProjeto
     *
     * @return the value of idProjeto
     */
    public int getIdProjeto() {
        return idProjeto;
    }

    /**
     * Set the value of idProjeto
     *
     * @param idProjeto new value of idProjeto
     */
    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Get the value of isPublic
     *
     * @return the value of isPublic
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Set the value of isPublic
     *
     * @param isPublic new value of isPublic
     */
    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
