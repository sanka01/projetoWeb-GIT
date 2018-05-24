/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author Sanka
 * @param <Object>
 */
public interface DAO<Object> {

    void atualizar(Object objeto) throws Exception;

    void excluir(Object objeto) throws Exception;

    Object procurarObjeto(Integer id) throws Exception;

    void salvar(Object objeto) throws Exception;

    List todosDados() throws Exception;

}
