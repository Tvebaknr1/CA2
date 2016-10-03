/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Interface.PersonInterface;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emil
 */
public class FacadePersonTest {
    
    public FacadePersonTest() {
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
     * Test of setFactory method, of class FacadePerson.
     */
    @Test
    public void testSetFactory() {
        System.out.println("setFactory");
        EntityManagerFactory emf = null;
        FacadePerson instance = null;
        instance.setFactory(emf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class FacadePerson.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int id = 0;
        FacadePerson instance = null;
        PersonInterface expResult = null;
        PersonInterface result = instance.getPerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersons method, of class FacadePerson.
     */
    @Test
    public void testGetPersons_0args() {
        System.out.println("getPersons");
        FacadePerson instance = null;
        List<PersonInterface> expResult = null;
        List<PersonInterface> result = instance.getPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersons method, of class FacadePerson.
     */
    @Test
    public void testGetPersons_int() {
        System.out.println("getPersons");
        int zipCode = 0;
        FacadePerson instance = null;
        List<PersonInterface> expResult = null;
        List<PersonInterface> result = instance.getPersons(zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
