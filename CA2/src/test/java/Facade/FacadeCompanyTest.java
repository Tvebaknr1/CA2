///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Facade;
//
//import Entity.Company;
//import java.util.List;
//import javax.persistence.Persistence;
//import org.junit.After;
//import org.junit.AfterClass;
//import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
///**
// *
// * @author Emil
// */
//public class FacadeCompanyTest
//{
//
//    FacadeCompany facadeCompany;
//
//    public FacadeCompanyTest()
//    {
//        facadeCompany = new FacadeCompany(Persistence.createEntityManagerFactory("ca2pu"));
//        
//        
//    }
//
//    @BeforeClass
//    public static void setUpClass()
//    {
//        
//    }
//
//    @AfterClass
//    public static void tearDownClass()
//    {
//    }
//
//    @Before
//    public void setUp()
//    {
//    }
//
//    @After
//    public void tearDown()
//    {
//    }
//
//    /**
//     * Test of getCompany method, of class FacadeCompany.
//     */
//    @Test
//    public void testGetCompany()
//    {
//        System.out.println("getCompany");
//        String cvr = "";
//        Company expResult = null;
//        Company result = facadeCompany.getCompany(cvr);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getCompanys method, of class FacadeCompany.
//     */
//    @Test
//    public void testGetCompanys()
//    {
//        System.out.println("getCompanys");
//        List<Company> expResult = null;
//        List<Company> result = facadeCompany.getCompanys();
//        assertEquals(expResult, result);
//    }
//
//}
