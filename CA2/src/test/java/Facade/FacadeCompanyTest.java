/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Interface.CompanyInterface;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
public class FacadeCompanyTest
{

    FacadeCompany instance;

    public FacadeCompanyTest()
    {
        instance = new FacadeCompany(Persistence.createEntityManagerFactory("com.mycompany_restAndRestApi_war_1.0-SNAPSHOTPU"));

        
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
        String cvr = "";
        CompanyInterface expResult = null;
        CompanyInterface result = instance.getCompany(cvr);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCompanys method, of class FacadeCompany.
     */
    @Test
    public void testGetCompanys()
    {
        System.out.println("getCompanys");
        List<CompanyInterface> expResult = null;
        List<CompanyInterface> result = instance.getCompanys();
        assertEquals(expResult, result);
    }

}
