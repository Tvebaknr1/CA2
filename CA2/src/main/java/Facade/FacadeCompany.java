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

    public Company getCompanyById(int id)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            Company company = em.find(Company.class, id);
            em.getTransaction().commit();
            return company;
        } finally
        {
            em.close();
        }
    }

    public List<Company> getCompaniesByMarketValue(int markV)
    {
        EntityManager em = emf.createEntityManager();

        List<Company> companies = null;

        try
        {
            em.getTransaction().begin();
            companies = em.createQuery("Select c from Company c where c.marketValue = :marketValue").setParameter("marketValue", markV).getResultList();
            em.getTransaction().commit();
            return companies;
        } finally
        {
            em.close();
        }
    }

    public Company getCompanyByName(String name)
    {
        EntityManager em = emf.createEntityManager();
        List<Company> company = null;

        try
        {
            em.getTransaction().begin();
            company = em.createQuery("Select c from Company c where c.name = :name").setParameter("name", name).getResultList();
            em.getTransaction().commit();
            return company.get(0);
        } finally
        {
            em.close();
        }
    }

    public Company addCompany(Company company)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            em.persist(company);
            em.getTransaction().commit();
            return company;
        } finally
        {
            em.close();
        }
    }
}
