/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;
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
        assertNotEquals(expResult1, result);
    }

    


    /**
     * Test of getPersonbyid method, of class FacadePerson.
     */
    @Test
    public void testGetPersonbyid() {
        System.out.println("getPersonbyid");
        int id = 1;
        Person expResult = null;
        Person result = facadePerson.getPersonbyid(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPersonByName method, of class FacadePerson.
     */
    @Test
    public void testGetPersonByName() {
        System.out.println("getPersonByName");
        String firstName = "Emil";
        String expResult = "Ulrik";
        List<Person> result = facadePerson.getPersonByName(firstName);
        assertEquals(expResult, result.get(0).getLastName());
    }

    /**
     * Test of getPersonByZip method, of class FacadePerson.
     */
    @Test
    public void testGetPersonByZip() {
        System.out.println("getPersonByZip");
        int zip = 555;
        Person expResult = new Person("Louise", "Nielsen");
        expResult.setEmail("louise@gmail.dk");
        List<Person> result = facadePerson.getPersonByZip(zip);
        assertEquals(expResult.toString(), result.get(0).toString());
    }

    /**
     * Test of getPersonByPhone method, of class FacadePerson.
     */
    @Test
    public void testGetPersonByPhone() {
        System.out.println("getPersonByPhone");
        int phonenr = 45879323;
        Person expResult = new Person("Emilie", "Nielsen");
        expResult.setEmail("lou@mail.dk");
        List<Person> result = facadePerson.getPersonByPhone(phonenr);
        assertEquals(expResult.toString(), result.get(0).toString());
    }

    /**
     * Test of getPersonByHobby method, of class FacadePerson.
     */
    @Test
    public void testGetPersonByHobby() {
        System.out.println("getPersonByHobby");
        String hobbyname = "lob";
        Person expResult = new Person("Louise", "Nielsen");
        expResult.setEmail("louise@gmail.dk");
        List<Person> result = facadePerson.getPersonByHobby(hobbyname);
        assertEquals(expResult.toString(), result.get(0).toString());
    }

//    /**
//     * Test of addPerson method, of class FacadePerson.
//     */
//    @Test
//    public void testAddPersonAndRemove() {
//        System.out.println("addPerson");
//        Person person = new Person("Lars", "Doe");
//        Person result = facadePerson.addPerson(person);
//        assertEquals(person, result);
//        System.out.println("removePersonbyid");
//        int id = 9;
//        result = facadePerson.removePersonbyid(id);
//        assertEquals(person.toString(), result.toString());
//    }
}
