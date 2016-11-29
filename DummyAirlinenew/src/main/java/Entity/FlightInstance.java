/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author LouiseB
 */
@Entity
public class FlightInstance implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flightInstanceID")
    private int flightInstanceID;
    
    @Column(name = "dateAndTime")
    @Temporal(TemporalType.DATE)
    private Date dateAndTime;
    
    @Column(name = "availableSeats")
    private int available;
    
    @Column(name = "price")
    private int price;
    
    @JoinColumn(name = "flight", referencedColumnName = "flightID")
    
    @ManyToOne
    private Flight flight;
    
    @OneToMany(mappedBy = "flightInstance")
    private Collection<Reservation> reservationCollection;

    public FlightInstance()
    {
    }

    public FlightInstance(Date dateAndTime, int availableSeats, int price, Flight flight, Collection<Reservation> reservationCollection)
    {
        this.dateAndTime = dateAndTime;
        this.available = availableSeats;
        this.price = price;
        this.flight = flight;
        this.reservationCollection = reservationCollection;
    }

    public int getFlightInstanceID()
    {
        return flightInstanceID;
    }

    public Date getDateAndTime()
    {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime)
    {
        this.dateAndTime = dateAndTime;
    }

    public int getavailableSeats()
    {
        return available;
    }

    public void setavailableSeats(int availableSeats)
    {
        this.available = availableSeats;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public Flight getFlight()
    {
        return flight;
    }

    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    public Collection<Reservation> getReservationCollection()
    {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection)
    {
        this.reservationCollection = reservationCollection;
    }

    

}
