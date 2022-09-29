/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.view;

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
public class ViewFactoryTest {
    


    /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        ViewFactory instance = new ViewFactory();
        View expResult = null;
        View result = instance.getView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
