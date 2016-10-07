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
    FacadePerson facadePerson = new FacadePerson(Persistence.createEntityManagerFactory("ca2pu"));
    
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
        int id = 5;
        Person expResult = new Person("Louise", "Nielsen");
        expResult.setEmail("louise@gmail.dk");
        Person expResult1 = new Person("Louise", "Nielsen");
        expResult1.setEmail("louise@gmail.com");
        Person result = facadePerson.getPerson(id);
        assertEquals(expResult.toString(), result.toString());
        assertNotEquals(expResult1.toString(), result.toString());
    }

    /**
     * Test of getPersons method, of class FacadePerson.
     */
    @Test
    public void testGetPersons_0args() {
        System.out.println("getPersons");
        List<Person> expResult = facadePerson.getPersons();
        List<Person> result = facadePerson.getPersons();
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).toString(), result.get(i).toString());
        }
        
    }
    
}
