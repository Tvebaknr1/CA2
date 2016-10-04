/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.CityInfo;
import Entity.Person;
import java.io.Console;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Emil
 */
public class FacadePerson {

    EntityManagerFactory emf;

    public FacadePerson(EntityManagerFactory emf) {
        System.out.println("test 2");
        this.emf = emf;
    }

    public void setFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Person getPerson(int phone) {

        EntityManager em = emf.createEntityManager();

        Person p = null;

        try {
            em.getTransaction().begin();
            p = em.find(Person.class, phone);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }
    public Person getPersonbyid(int id) {

        EntityManager em = emf.createEntityManager();

        Person p = null;

        try {
            em.getTransaction().begin();
            p = em.find(Person.class, id);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    public List<Person> getPersons() {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;

        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select i from Person i").getResultList();

            em.getTransaction().commit();
            return persons;
        } finally {
            em.close();
        }
    }

//    public List<Person> getPersonsbyzipcode(int zipCode) {
//
//        EntityManager em = emf.createEntityManager();
//
//        List<Person> persons = null;
//        try {
//            em.getTransaction().begin();
//            persons = em.createQuery("SELECT p1 FROM InfoEntity p1 join Address c1 WHERE p1.address =c1.id").getResultList();
//                    //+ "SELECT p, z FROM Person p WHERE p.zip LIKE :zipcode INNER JOIN p1.neighbors c2").setParameter("zipcode", zipCode).getResultList();
//            em.getTransaction().commit();
//            return persons;
//        } finally {
//            em.close();
//        }
//    }

    public static void main(String[] args) {
        FacadePerson fp = new FacadePerson(Persistence.createEntityManagerFactory("ca2pu"));
        System.out.println(fp.getPersons());
    }
    public Person removePersonbyid(int id) {

        EntityManager em = emf.createEntityManager();

        Person p = null;

        try {
            p = em.find(Person.class, id);
            em.getTransaction().begin();
            em.refresh(p);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    public void put(Person jo) {
        EntityManager em = emf.createEntityManager();


        try {
            em.getTransaction().begin();
            em.persist(jo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
