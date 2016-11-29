/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class Reservation implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservationID")
    private int reservationID;
    
    @Column(name = "totalPrice")
    private int totalPrice;
    
    @JoinColumn(name = "flightInstance", referencedColumnName = "flightInstanceID")
    
    @ManyToOne
    private FlightInstance flightInstance;
    
    @OneToMany(mappedBy = "reservation")
    private Collection<Passenger> passengerCollection;

    public Reservation()
    {
    }

    public Reservation(int totalPrice, FlightInstance flightInstance, Collection<Passenger> passengerCollection)
    {
        this.totalPrice = totalPrice;
        this.flightInstance = flightInstance;
        this.passengerCollection = passengerCollection;
    }

    public int getReservationID()
    {
        return reservationID;
    }

    public int getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public FlightInstance getFlightInstance()
    {
        return flightInstance;
    }

    public void setFlightInstance(FlightInstance flightInstance)
    {
        this.flightInstance = flightInstance;
    }

    public Collection<Passenger> getPassengerCollection()
    {
        return passengerCollection;
    }

    public void setPassengerCollection(Collection<Passenger> passengerCollection)
    {
        this.passengerCollection = passengerCollection;
    }

    @Override
    public String toString()
    {
        return "Reservation1{" + "totalPrice=" + totalPrice + ", flightInstance=" + flightInstance + ", passengerCollection=" + passengerCollection + '}';
    }
    
    
}
