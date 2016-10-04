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
    FacadePerson instance = new FacadePerson(Persistence.createEntityManagerFactory("ca2pu"));
    
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
        int id = 8;
        Person expResult = new Person("Emil", "Ulrik");
        expResult.setEmail("mymain@lol.dk");
        Person result = instance.getPerson(id);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getPersons method, of class FacadePerson.
     */
    @Test
    public void testGetPersons_0args() {
        System.out.println("getPersons");
        List<Person> expResult = instance.getPersons();
        List<Person> result = instance.getPersons();
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).toString(), result.get(i).toString());
        }
        
    }

//    /**
//     * Test of getPersons method, of class FacadePerson.
//     */
//    @Test
//    public void testGetPersons_int() {
//        System.out.println("getPersons");
//        int zipCode = 3600;
//        List<Person> expResult = null;
//        List<Person> result = instance.getPersonsbyzipcode(zipCode);
//        assertEquals(expResult, result);
//    }
    
}
