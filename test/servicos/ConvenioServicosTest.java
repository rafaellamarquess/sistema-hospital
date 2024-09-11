/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package servicos;

import java.util.ArrayList;
import modelo.Convenio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catspajamas
 */
public class ConvenioServicosTest {
    
    public ConvenioServicosTest() {
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
     * Test of buscarConvenio method, of class ConvenioServicos.
     */
    @Test
    public void testBuscarConvenio() throws Exception {
        System.out.println("buscarConvenio");
        ConvenioServicos instance = new ConvenioServicos();
        ArrayList<Convenio> expResult = null;
        ArrayList<Convenio> result = instance.buscarConvenio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
