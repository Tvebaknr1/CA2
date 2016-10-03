/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Person;
import java.util.List;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Emil
 */
public class FacadePersonTest {
    FacadePerson instance = new FacadePerson(Persistence.createEntityManagerFactory("ca2putest"));
    
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
     * Test of getPerson method, of class FacadePerson.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int id = 1;
        Person expResult = null;
        Person result = instance.getPerson(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPersons method, of class FacadePerson.
     */
    @Test
    public void testGetPersons_0args() {
        System.out.println("getPersons");
        List<Person> expResult = null;
        List<Person> result = instance.getPersons();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPersons method, of class FacadePerson.
     */
    @Test
    public void testGetPersons_int() {
        System.out.println("getPersons");
        int zipCode = 3600;
        List<Person> expResult = null;
        List<Person> result = instance.getPersons(zipCode);
        assertEquals(expResult, result);
    }
    
}
