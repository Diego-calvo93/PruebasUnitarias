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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of sumar method, of class Calculadora.
     */
   @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 6;
        int b = 1;
        int expResult = 7;
        int result = Calculadora.sumar(a, b);
        assertEquals(expResult, result);
        
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of restar method, of class Calculadora.
     */
   @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 8;
        int b = 0;
        int expResult = 8;
        int result = Calculadora.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 2;
        int b = 0;
        int expResult = 0;
        int result = Calculadora.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
   /* @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 6;
        int b = 2;
        int expResult = 3;
        int result = Calculadora.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
        
    
    
    
    
    
    
    
    
    
    
   /**
     * Test of distribucion method, of class Calculadora.
     */
   @Test
    public void testDistribucion() {
        System.out.println("distribucion");
        int a = 0;
        int b = 0;
        int c = 0;
        char o1 = ' ';
        char o2 = ' ';
        int expResult = 0;
        int result = Calculadora.distribucion(a, b, c, o1, o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
} 
    
    
    
    
    
    
    
    
    
    
 
    
