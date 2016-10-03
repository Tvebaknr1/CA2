/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author LouiseB
 */
public class FacadeCompany
{
        EntityManagerFactory emf;

    public FacadeCompany(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void setFactory(EntityManagerFactory emf) {
        this.emf = emf;
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
