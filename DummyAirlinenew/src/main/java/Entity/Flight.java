/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose tooAirportls | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author LouiseB
 */
@Entity
public class Flight implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flightID")
    private int flightID;
    
    @Column(name = "flightNumber")
    private String flightNumber;
    
    @Column(name = "seats")
    private int seats;
    
    @Column(name = "flightTimeAirline")
    private int flightTimeAirline;
    
    @OneToMany(mappedBy = "flight")
    private Collection<FlightInstance> flightInstanceCollection;
    
    @JoinColumn(name = "airline", referencedColumnName = "AirlineID")
    @ManyToOne
    private Airline airline;
    
    @JoinColumn(name = "fromAirport", referencedColumnName = "airportID")
    @ManyToOne
    private Airport fromAirport;
    
    @JoinColumn(name = "tooAirport", referencedColumnName = "airportID")
    @ManyToOne
    private Airport tooAirport;

    public Flight()
    {
    }

    public Flight(String flightNumber, int seats, int flightTimeAirline, Collection<FlightInstance> flightInstanceCollection, Airline airline, Airport fromAirport, Airport tooAirport)
    {
        this.flightNumber = flightNumber;
        this.seats = seats;
        this.flightTimeAirline = flightTimeAirline;
        this.flightInstanceCollection = flightInstanceCollection;
        this.airline = airline;
        this.fromAirport = fromAirport;
        this.tooAirport = tooAirport;
    }

    public int getFlightID()
    {
        return flightID;
    }

    public String getFlightNumber()
    {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public int getSeats()
    {
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public int getFlightTimeAirline()
    {
        return flightTimeAirline;
    }

    public void setFlightTimeAirline(int flightTimeAirline)
    {
        this.flightTimeAirline = flightTimeAirline;
    }

    public Collection<FlightInstance> getFlightInstanceCollection()
    {
        return flightInstanceCollection;
    }

    public void setFlightInstanceCollection(Collection<FlightInstance> flightInstanceCollection)
    {
        this.flightInstanceCollection = flightInstanceCollection;
    }

    public Airline getAirline()
    {
        return airline;
    }

    public void setAirline(Airline airline)
    {
        this.airline = airline;
    }

    public Airport getfromAirport()
    {
        return fromAirport;
    }

    public void setfromAirport(Airport fromAirport)
    {
        this.fromAirport = fromAirport;
    }

    public Airport gettooAirport()
    {
        return tooAirport;
    }

    public void settooAirport(Airport tooAirport)
    {
        this.tooAirport = tooAirport;
    }

    @Override
    public String toString()
    {
        return "Flight1{" + "flightNumber=" + flightNumber + ", seats=" + seats + ", flightTimeAirline=" + flightTimeAirline + ", flightInstanceCollection=" + flightInstanceCollection + ", airline=" + airline + ", fromAirport=" + fromAirport + ", tooAirport=" + tooAirport + '}';
    }
    
    
}
