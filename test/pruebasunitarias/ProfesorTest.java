/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class ProfesorTest {
    
    public ProfesorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of altaProfesor method, of class Profesor.
     */
    @Test
    public void testAltaProfesor() {
        System.out.println("altaProfesor");
        String us = "Pepe1";
        String con = "1234569";
        String nomb = "Pepe";
        int cuil = 123456;
        boolean expResult = false;
        boolean result = Profesor.altaProfesor(us, con, nomb, cuil);
        if(result == expResult){
            
        }else{ fail("The test case is a prototype.");}
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
