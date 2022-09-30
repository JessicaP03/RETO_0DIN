/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelBDImplementationTest {
    
  
    /**
     * Test of openConnection method, of class ModelBDImplementation.
     */
    @Test
    public void testOpenConnection() throws Exception {
        System.out.println("openConnection");
        ModelBDImplementation instance = new ModelBDImplementation();
        instance.openConnection();
        
    }

    /**
     * Test of closeConnection method, of class ModelBDImplementation.
     */
    @Test
    public void testCloseConnection() throws Exception {
        System.out.println("closeConnection");
        ModelBDImplementation instance = new ModelBDImplementation();
        instance.closeConnection();
       
       
    }

    /**
     * Test of getGreeting method, of class ModelBDImplementation.
     */
    @Test
    public void testGetGreeting() throws Exception {
        System.out.println("getGreeting");
        ModelBDImplementation instance = new ModelBDImplementation();
        String expResult = "";
        String result = instance.getGreeting();
        
      
    }
    
}
