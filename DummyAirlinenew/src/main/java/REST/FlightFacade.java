package REST;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Entity.Flight;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author LouiseB
 */
public class FlightFacade
{
    EntityManagerFactory emf;

    public FlightFacade()
    {
    }

    public FlightFacade(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public List<Flight> getAllFlights()
    {

        EntityManager em = emf.createEntityManager();

        List<Flight> flight = null;

        try
        {
            em.getTransaction().begin();
            //flight = em.createQuery("SELECT f FROM Flight f").getResultList();
            //em.find(Flight.class, 1);
            flight = em.createNamedQuery("Flight.findAll").getResultList();
            em.getTransaction().commit();
            System.out.println(flight);
            return flight;
        } finally
        {
            em.close();
        }
    }
}
