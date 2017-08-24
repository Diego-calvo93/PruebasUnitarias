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
public class EjercicioTest {
    
    public EjercicioTest() {
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
     * Test of crearEjercicio method, of class Ejercicio.
     */
    @Test
    public void testCrearEjercicio() {
        System.out.println("crearEjercicio");
        int codigo = 21;
        String expresion = "7 * 9";
        int resultado = 63;
        String nivel = "Facil";
        int puntaje = 10;
        Ejercicio instance = new Ejercicio();
        boolean expResult = false;
        boolean result = instance.crearEjercicio(codigo, expresion, resultado, nivel, puntaje);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
