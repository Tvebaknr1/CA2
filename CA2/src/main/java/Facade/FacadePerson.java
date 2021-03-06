/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.CityInfo;
import Entity.Hobby;
import Entity.Person;
import Entity.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

    public List<Person> getPersonByName(String firstName) {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;

        try {
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT i FROM Person i WHERE i.firstName LIKE :firstName");
            query.setParameter("firstName", firstName);
            persons = query.getResultList();
            em.getTransaction().commit();
            return persons;
        } finally {
            em.close();
        }
    }

    public List<Person> getPersonByZip(int zip) {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;

        try {
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT i FROM Person i ");
            persons = query.getResultList();
            em.getTransaction().commit();
            List<Person> p = new ArrayList();
            for (Person person : persons) {
                if (person.getAddress().getCityInfo() != null &&
                        person.getAddress() != null &&
                        person != null &&
                        person.getAddress().getCityInfo().getZip() == zip) {
                    p.add(person);
                }
            }
            return p;
        } finally {
            em.close();
        }
    }

    
    public List<Person> getPersonByPhone(int phonenr) {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;

        try {
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT i FROM Person i ");
            persons = query.getResultList();
            em.getTransaction().commit();
            List<Person> p = new ArrayList();
            for (Person person : persons) {
                for (Phone phone : person.getPhone()) {
                    if (phone.getNumber() == phonenr) {
                        p.add(person);
                    }
                }
            }
            return p;
        } finally {
            em.close();
        }
    }
    public List<Person> getPersonByHobby(String hobbyname) {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;

        try {
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT i FROM Person i ");
            persons = query.getResultList();
            em.getTransaction().commit();
            List<Person> p = new ArrayList();
            for (Person person : persons) {
                for (Hobby hobby : person.getHobbies()) {
                    if (hobby.getName().toLowerCase().equals(hobbyname.toLowerCase())) {
                        p.add(person);
                    }
                }
            }
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
    
    public Person addPerson(Person person)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
            return person;
        } finally
        {
            em.close();
        }
    }
    
     public List<Integer> getZipCodes() {
        EntityManager em = emf.createEntityManager();

        List<CityInfo> ci = null;

        try {
            em.getTransaction().begin();
            ci = em.createQuery("Select i from CityInfo i").getResultList();
            em.getTransaction().commit();
            List<Integer> list = new ArrayList();
            
            for(int i = 0; i < ci.size(); i++)
            {
                list.add(ci.get(i).getZip());
            }
            
            return list;
            
        } finally {
            em.close();
        }
    }
    
    
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
            em.remove(p);
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

    public Person deletePerson(int id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Person person = em.find(Person.class, id);
            em.remove(person);
            em.getTransaction().commit();
            return person;
        } finally {
            em.close();
        }
    }

}
