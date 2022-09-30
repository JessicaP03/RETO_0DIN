/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.exception;

/**
 *
 * Excepción de DAO
 */
public class DaoException extends Exception {

    private static final long serialVersionUID = 1L;

    public DaoException(String message) {
        super(message);
    }
}
