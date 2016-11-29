/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author LouiseB
 */
@Entity
public class Passenger implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passengerID")
    private int passengerID;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;
    
    @JoinColumn(name = "reservation", referencedColumnName = "reservationID")
    
    @ManyToOne
    private Reservation reservation;

    public Passenger()
    {
    }

    public Passenger(String firstname, String lastname, Reservation reservation)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.reservation = reservation;
    }

    public int getPassengerID()
    {
        return passengerID;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public Reservation getReservation()
    {
        return reservation;
    }

    public void setReservation(Reservation reservation)
    {
        this.reservation = reservation;
    }

    @Override
    public String toString()
    {
        return "Passenger1{" + "firstname=" + firstname + ", lastname=" + lastname + ", reservation=" + reservation + '}';
    }
    
    
    
}
