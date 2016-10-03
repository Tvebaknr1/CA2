/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Interface.CompanyInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author LouiseB
 */
public class FacadeCompany {

    EntityManagerFactory emf;

    public FacadeCompany(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void setFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CompanyInterface getCompany(String cvr) {

        EntityManager em = emf.createEntityManager();

        CompanyInterface c = null;

        try {
            em.getTransaction().begin();
            c = em.find(CompanyInterface.class, cvr);
            em.getTransaction().commit();
            return c;
        } finally {
            em.close();
        }
    }

    public List<CompanyInterface> getCompanys() {

        EntityManager em = emf.createEntityManager();

        List<CompanyInterface> companies = null;

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
