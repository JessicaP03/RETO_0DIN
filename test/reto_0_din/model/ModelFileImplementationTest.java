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
public class ModelFileImplementationTest {

    /**
     * Test of getGreeting method, of class ModelFileImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        ModelFileImplementation instance = new ModelFileImplementation();
        String expResult = "";
        String result = instance.getGreeting();
    }

}
