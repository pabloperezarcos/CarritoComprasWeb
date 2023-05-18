/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class ControladorEmpleadoIT {
    
    public ControladorEmpleadoIT() {
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
     * Test of processRequest method, of class ControladorEmpleado.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ControladorEmpleado instance = new ControladorEmpleado();
        instance.processRequest(request, response);
    }

    /**
     * Test of doGet method, of class ControladorEmpleado.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ControladorEmpleado instance = new ControladorEmpleado();
        instance.doGet(request, response);
    }

    /**
     * Test of doPost method, of class ControladorEmpleado.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ControladorEmpleado instance = new ControladorEmpleado();
        instance.doPost(request, response);
    }

    /**
     * Test of getServletInfo method, of class ControladorEmpleado.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        ControladorEmpleado instance = new ControladorEmpleado();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
    }
    
}