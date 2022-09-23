/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import reto_0_din.exception.*;


/**
 *
 * @author 2dam
 */
public class ModelBDImplementation implements Model {
    
    private Connection con = null;
    private Properties prope;
    private PreparedStatement stmt= null;
    private ResourceBundle config;
    private String driverDB;
    private String urlDB;
    private String userDB;
    private String passwordDB;
    
    //CONSEULTA DE SQL
    private final String consulMensaje = "SELECT data FROM message";

    //Cojemos la información para conectarnos a la BD
    
    public ModelBDImplementation() {
        this.config = ResourceBundle.getBundle("reto_0_din.model.configDB");
        this.driverDB = this.config.getString("Driver");
        this.urlDB = this.config.getString("Conn");
        this.userDB = this.config.getString("DBUser");
        this.passwordDB = this.config.getString("DBPass");

    }
    
    //Metodo para abrir conexion con la base de datos
    public void openConnection() throws DaoException{
          try {
            Class.forName(this.driverDB);
            con = DriverManager.getConnection(this.urlDB, this.userDB, this.passwordDB);
        } catch (SQLException e) {
            throw new DaoException("Error en la base de datos al intentar conectar" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            throw new DaoException("No se ha encontrado el driver para la conexión con la base de datos" + ex.getMessage());
        }
    }
   
    
    public void closeConnection() throws DaoException {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new DaoException("Error de SQL " + e.getMessage());
        }
    }
    
  
    @Override
    public String getGreeting() throws DaoException, ReadException {
        String text = null;
        
        ResultSet rs = null;
        try {
            this.openConnection();
        } catch (DaoException ex) {
            throw new DaoException(ex.getMessage());
        }
        try {
            stmt = con.prepareStatement(consulMensaje);
            
            rs = stmt.executeQuery();
            while(rs.next()){
            text = rs.getString("message.data");
            }

        } catch (Exception e) {
            throw new ReadException("Error de Lectura");
        }
        this.closeConnection();
        return text;
    
    }
    
    


   

   
    
}
