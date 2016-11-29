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
import javax.persistence.OneToMany;

/**
 *
 * @author LouiseB
 */
@Entity
public class Airline implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airlineID")
    private int airlineID;
    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy = "airline")
    private Collection<Flight> flightCollection;

    public Airline()
    {
    }

    public Airline(int airlineID, String name, Collection<Flight> flightCollection)
    {
        this.airlineID = airlineID;
        this.name = name;
        this.flightCollection = flightCollection;
    }

    public int getId()
    {
        return airlineID;
    }
    
    public int getAirlineID()
    {
        return airlineID;
    }

    public void setAirlineID(int airlineID)
    {
        this.airlineID = airlineID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Collection<Flight> getFlightCollection()
    {
        return flightCollection;
    }

    public void setFlightCollection(Collection<Flight> flightCollection)
    {
        this.flightCollection = flightCollection;
    }

    @Override
    public String toString()
    {
        return "Airline1{" + "airlineID=" + airlineID + ", name=" + name + ", flightCollection=" + flightCollection + '}';
    }
    
    

}
