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
public class NivelTest {
    
    public NivelTest() {
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
    
    
    @Test
    public void testCrearNivel() {
        System.out.println("crearNivel");
        int rDesde = 102;
        int rHasta = 150;
        int expResult = 2;
        Nivel n = new Nivel();
        n.crearNivel(rDesde, rHasta);
        int result = n.getNumeroNivel() ;
        // TODO review the generated test code and remove the default call to fail.
        if(result == expResult){
        //Esta ok
        }else{
            fail("The test case is a prototype.");
        }
        
    }
    
    /**
     * Test of getNumeroNivel method, of class Nivel.
     */
    @Test
    public void testGetNumeroNivel() {
        System.out.println("getNumeroNivel");
        Nivel instance = new Nivel();
        int expResult = 0;
        int result = instance.getNumeroNivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroNivel method, of class Nivel.
     */
    @Test
    public void testSetNumeroNivel() {
        System.out.println("setNumeroNivel");
        int numeroNivel = 0;
        Nivel instance = new Nivel();
        instance.setNumeroNivel(numeroNivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Nivel.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Nivel instance = new Nivel();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Nivel.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Nivel instance = new Nivel();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRangoDesde method, of class Nivel.
     */
    @Test
    public void testGetRangoDesde() {
        System.out.println("getRangoDesde");
        Nivel instance = new Nivel();
        int expResult = 0;
        int result = instance.getRangoDesde();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of setRangoDesde method, of class Nivel.
//     */
//    @Test
//    public void testSetRangoDesde() {
//        System.out.println("setRangoDesde");
//        int rangoDesde = 0;
//        Nivel instance = new Nivel();
//        instance.setRangoDesde(rangoDesde);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRangoHasta method, of class Nivel.
//     */
//    @Test
//    public void testGetRangoHasta() {
//        System.out.println("getRangoHasta");
//        Nivel instance = new Nivel();
//        int expResult = 0;
//        int result = instance.getRangoHasta();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRangoHasta method, of class Nivel.
//     */
//    @Test
//    public void testSetRangoHasta() {
//        System.out.println("setRangoHasta");
//        int rangoHasta = 0;
//        Nivel instance = new Nivel();
//        instance.setRangoHasta(rangoHasta);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of crearNivel method, of class Nivel.
//     */
    
    
}
