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
public class AlumnoTest {
    
    public AlumnoTest() {
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
    public void testCalcularNuevoNivel() {
        System.out.println("calcularNuevoNivel");
        int puntajeActual = 102;
        int expResult = 2;
        int result = Alumno.calcularNuevoNivel(puntajeActual);
        if(result == expResult){
        }else{
        fail("The test case is a prototype.");
        }
    }
    
    
    /*
    @Test
    public void testCambiarContrasenia() {
        System.out.println("cambiarContrasenia");
        String us = "Pep1";
        String cont = "123546879";
        Alumno instance = new Alumno();
        boolean expResult = true;
        boolean result = instance.cambiarContrasenia(us, cont);
       if(result == expResult){
        }else{
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of calcularNuevoNivel method, of class Alumno.
     */
    
    
    /**
     * Test of altaAlumno method, of class Alumno.
     */
    /*@Test
    public void testAltaAlumno() {
        System.out.println("altaAlumno");
        String us = "Pep1";
        String con = "123456789";
        int leg = 0;
        String nomb = "Pepe";
        int cuilp = 0;
        boolean expResult = true;
        boolean result = Alumno.altaAlumno(us, con, leg, nomb, cuilp);
        if(result == expResult){
        }else{
        fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of cambiarContrasenia method, of class Alumno.
     */
    
    
}
