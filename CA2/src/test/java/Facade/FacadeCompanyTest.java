/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Company;
import java.util.ArrayList;
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
public class FacadeCompanyTest {

    FacadeCompany facadeCompany;

    public FacadeCompanyTest() {
        facadeCompany = new FacadeCompany(Persistence.createEntityManagerFactory("ca2pu"));

    }
    static List<Company> companys;

    @BeforeClass
    public static void setUpClass() {
        companys = new ArrayList<>();
        companys.add(new Company("VISMA", "Penge", 2700, 1000, 100000000));
        companys.add(new Company("Indeni", "Arketekture", 2700, 1800, 100000000));
        companys.add(new Company("Griffen people", "Mellemmand", 2700, 500, 10054400000d));
        companys.add(new Company("Louise", "Medio", 1700, 50, 1005));
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
     * Test of getCompany method, of class FacadeCompany.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
        int cvr = 2700;
        List<Company> expResult = companys;
        List<Company> result = facadeCompany.getCompaniesByCVR(cvr);

        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).toString(), result.get(i).toString());
        }
    }

    /**
     * Test of getCompanys method, of class FacadeCompany.
     */
    @Test
    public void testGetCompanys() {
        System.out.println("getCompanys");
        List<Company> expResult = companys;
        List<Company> result = facadeCompany.getAllCompanies();
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).toString(), result.get(i).toString());
        }
    }
//    
//    @Test
//    public void testDeleteCompany()
//    {
//        System.out.println("deleteCompany");
//        Company company = facadeCompany.deleteCompany(1);
//        assertNotNull(company);
//        company = facadeCompany.deleteCompany(1);
//        assertNull(company);
//    }
    /**
     * Test of getCompanyById method, of class FacadeCompany.
     */
    @Test
    public void testGetCompanyById() {
        System.out.println("getCompanyById");
        int id = 2;
        Company expResult = companys.get(1);
        Company result = facadeCompany.getCompanyById(id);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getCompaniesByMarketValue method, of class FacadeCompany.
     */
    @Test
    public void testGetCompaniesByMarketValue() {
        System.out.println("getCompaniesByMarketValue");
        int markV = 1005;
        Company expResult = companys.get(3);
        List<Company> result = facadeCompany.getCompaniesByMarketValue(markV);
        assertEquals(expResult.toString(), result.get(0).toString());
    }

    /**
     * Test of getCompanyByName method, of class FacadeCompany.
     */
    @Test
    public void testGetCompanyByName() {
        System.out.println("getCompanyByName");
        String name = "Griffen people";
        Company expResult = companys.get(2);
        Company result = facadeCompany.getCompanyByName(name);
        assertEquals(expResult.toString(), result.toString());
    }

}
