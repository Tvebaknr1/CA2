/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest1.ca2;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Emil
 */
public class facade {

    EntityManagerFactory emf;

    public facade(EntityManagerFactory emf) {
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
            persons = em.createQuery("Select * from Person p").getResultList();
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
            persons = em.createQuery("Select * from Person p where zipcode ="+zipCode).getResultList();
            em.getTransaction().commit();
            return persons;
        } finally {
            em.close();
        }
    }

    public Company getCompany(String cvr) {

        EntityManager em = emf.createEntityManager();

        Company c = null;

        try {
            em.getTransaction().begin();
            c = em.find(Company.class, cvr);
            em.getTransaction().commit();
            return c;
        } finally {
            em.close();
        }
    }

    public List<Company> getCompanys() {

        EntityManager em = emf.createEntityManager();

        List<Company> companies = null;

        try {
            em.getTransaction().begin();
            companies = em.createQuery("Select * from Company c").getResultList();
            em.getTransaction().commit();
            return companies;
        } finally {
            em.close();
        }
    }

}
