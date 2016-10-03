/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Interface.PersonInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Emil
 */
public class FacadePerson {

    EntityManagerFactory emf;

    public FacadePerson(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void setFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PersonInterface getPerson(int id) {
        EntityManager em = emf.createEntityManager();

        PersonInterface p = null;

        try {
            em.getTransaction().begin();
            p = em.find(PersonInterface.class, id);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    public List<PersonInterface> getPersons() {

        EntityManager em = emf.createEntityManager();

        List<PersonInterface> persons = null;

        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select * from Person p").getResultList();
            em.getTransaction().commit();
            return persons;
        } finally {
            em.close();
        }
    }

    public List<PersonInterface> getPersons(int zipCode) {

        EntityManager em = emf.createEntityManager();

        List<PersonInterface> persons = null;

        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select * from Person p where zipcode ="+zipCode).getResultList();
            em.getTransaction().commit();
            return persons;
        } finally {
            em.close();
        }
    }



}
