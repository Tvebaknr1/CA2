/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Company;
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
public class FacadeCompanyTest
{

    FacadeCompany facadeCompany;

    public FacadeCompanyTest()
    {
        facadeCompany = new FacadeCompany(Persistence.createEntityManagerFactory("ca2pu"));
        
        
    }

    @BeforeClass
    public static void setUpClass()
    {
        
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getCompany method, of class FacadeCompany.
     */
    @Test
    public void testGetCompany()
    {
        System.out.println("getCompany");
        int cvr = 2700;
        List<Company> expResult = facadeCompany.getCompaniesByCVR(cvr);
        List<Company> result = facadeCompany.getCompaniesByCVR(cvr);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).toString(), result.get(i).toString());
        }    }

    /**
     * Test of getCompanys method, of class FacadeCompany.
     */
    @Test
    public void testGetCompanys()
    {
        System.out.println("getCompanys");
        List<Company> expResult = facadeCompany.getAllCompanies();
        List<Company> result = facadeCompany.getAllCompanies();
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).toString(), result.get(i).toString());
        }
    }

}
