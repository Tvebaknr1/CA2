/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Emil
 */
public class FacadePerson
{

    EntityManagerFactory emf;

    public FacadePerson(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public void setFactory(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public Person getPerson(int id)
    {
        EntityManager em = emf.createEntityManager();

        Person p = null;

        try
        {
            em.getTransaction().begin();
            p = em.find(Person.class, id);
            em.getTransaction().commit();
            return p;
        } finally
        {
            em.close();
        }
    }

    public List<Person> getPersons()
    {

        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;

        try
        {
            em.getTransaction().begin();
            persons = em.createQuery("Select * from Person").getResultList();
            em.getTransaction().commit();
            return persons;
        } finally
        {
            em.close();
        }
    }

    public List<Person> getPersons(int zipCode)
    {

        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;

        try
        {
            em.getTransaction().begin();
            persons = em.createQuery("Select * from Person p where zipcode =" + zipCode).getResultList();
            em.getTransaction().commit();
            return persons;
        } finally
        {
            em.close();
        }
    }

}
