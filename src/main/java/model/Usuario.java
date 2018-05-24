/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Sanka
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String nome;

    private String instituicao;

    private String usuario;

    private String senha;

    private String semestre;

    private String curso;

    private String email;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario() {
        this.id = 0;
        this.nome = "";
        this.instituicao = "";
        this.usuario = "";
        this.senha = "";
        this.semestre = "";
        this.curso = "";
        this.email = "";
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the value of curso
     *
     * @return the value of curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Set the value of curso
     *
     * @param curso new value of curso
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Get the value of semestre
     *
     * @return the value of semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Set the value of semestre
     *
     * @param semestre new value of semestre
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     * Get the value of senha
     *
     * @return the value of senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Set the value of senha
     *
     * @param senha new value of senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Get the value of instituicao
     *
     * @return the value of instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * Set the value of instituicao
     *
     * @param instituicao new value of instituicao
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
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
