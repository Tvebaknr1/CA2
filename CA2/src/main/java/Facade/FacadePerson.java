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

    public Person getPerson(int id) {
        
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

    public List<Person> getPersons(int zipCode) {

        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;
        try {
            em.getTransaction().begin();
            persons = em.createQuery("SELECT p1,c1 FROM Person p1 join Address c1 WHERE c1.id LIKE p1.address").setParameter("zipcode", zipCode).getResultList();
                    //+ "SELECT p, z FROM Person p WHERE p.zip LIKE :zipcode INNER JOIN p1.neighbors c2").setParameter("zipcode", zipCode).getResultList();
            em.getTransaction().commit();
            return persons;
        } finally {
            em.close();
        }
    }

    public static void main(String[] args) {
        FacadePerson fp = new FacadePerson(Persistence.createEntityManagerFactory("ca2pu"));
        System.out.println(fp.getPersons());
    }

}
