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

    public FacadeCompany(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public void setFactory(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public List<Company> getAllCompanies()
    {

        EntityManager em = emf.createEntityManager();

        List<Company> companies = null;

        try
        {
            em.getTransaction().begin();
            companies = em.createQuery("Select c from Company c").getResultList();
            em.getTransaction().commit();
            return companies;
        } finally
        {
            em.close();
        }
    }

    public List<Company> getCompaniesByCVR(int cvr)
    {

        EntityManager em = emf.createEntityManager();

        List<Company> companies = null;

        try
        {
            em.getTransaction().begin();
            companies = em.createQuery("Select c from Company c where c.cvr = :cvr").setParameter("cvr", cvr).getResultList();
            em.getTransaction().commit();
            return companies;
        } finally
        {
            em.close();
        }
    }

//    public List<Company> getCompaniesByNumber(int number)
//    {
//
//        EntityManager em = emf.createEntityManager();
//
//        List<Company> companies = null;
//
//        try
//        {
//            em.getTransaction().begin();
//            companies = em.createQuery("Select c from Company c where c.number = :number").setParameter("cvr", number).getResultList();
//            em.getTransaction().commit();
//            return companies;
//        } finally
//        {
//            em.close();
//        }
//    }

    public Company deleteCompany(int id)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            Company company = em.find(Company.class, id);
            em.remove(company);
            em.getTransaction().commit();
            return company;
        } finally
        {
            em.close();
        }
    }

}
