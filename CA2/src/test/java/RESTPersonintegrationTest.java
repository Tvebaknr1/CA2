///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import Entity.Person;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;
//import io.restassured.parsing.Parser;
//import static org.hamcrest.Matchers.*;
//
///**
// *
// * @author Emil
// */
//public class RESTPersonintegrationTest {
//
//    public RESTPersonintegrationTest() {
//    }
//
//    @BeforeClass
//    public static void setUpBeforeAll() {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = 8080;
//        RestAssured.basePath = "/CA2/api/person";
//        RestAssured.defaultParser = Parser.JSON;
//    }
//
//    @Test
//    public void serverIsRunningV2() {
//        given().when().get("http://localhost:8080/CA2/api/person/all").then().statusCode(200);
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    @Test
//    public void serverIsRunning() {
//        given().
//                when().get("/all").
//                then().
//                statusCode(200);
//    }
//
//    @Test
//    public void getPerson() {
//        
//        expect().
//                body("get(0).lastName", equalTo("Ulrik")).
//                when().
//                get("/firstname/Emil");
////        Person[] persons = given().when().get("/firstname/Emil").as(Person[].class);
////        assertEquals("Ulrik", persons[1].getLastName());
//    }
//
//}
