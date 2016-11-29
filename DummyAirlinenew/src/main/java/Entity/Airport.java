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
public class Airport implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airportID")
    private int airportID;   
    
    @Column(name = "IATACode")
    private String IATACode;
    
    @Column(name = "timeZone")
    private String timeZone;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "city")
    private String city;
    
    @OneToMany(mappedBy = "fromAirport")
    private Collection<Flight> flightCollection;
    
    @OneToMany(mappedBy = "tooAirport")
    private Collection<Flight> flightCollection1;

    public Airport()
    {
    }

    public Airport(String IATACode, String timeZone, String name, String country, String city, Collection<Flight> flightCollection, Collection<Flight> flightCollection1)
    {
        this.IATACode = IATACode;
        this.timeZone = timeZone;
        this.name = name;
        this.country = country;
        this.city = city;
        this.flightCollection = flightCollection;
        this.flightCollection1 = flightCollection1;
    }

    public int getairportID()
    {
        return airportID;
    }

    public String getIATACode()
    {
        return IATACode;
    }

    public void setIATACode(String IATACode)
    {
        this.IATACode = IATACode;
    }

    public String getTimeZone()
    {
        return timeZone;
    }

    public void setTimeZone(String timeZone)
    {
        this.timeZone = timeZone;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public Collection<Flight> getFlightCollection()
    {
        return flightCollection;
    }

    public void setFlightCollection(Collection<Flight> flightCollection)
    {
        this.flightCollection = flightCollection;
    }

    public Collection<Flight> getFlightCollection1()
    {
        return flightCollection1;
    }

    public void setFlightCollection1(Collection<Flight> flightCollection1)
    {
        this.flightCollection1 = flightCollection1;
    }

    @Override
    public String toString()
    {
        return "Airport1{" + "IATACode=" + IATACode + ", timeZone=" + timeZone + ", name=" + name + ", country=" + country + ", city=" + city + ", flightCollection=" + flightCollection + ", flightCollection1=" + flightCollection1 + '}';
    }
    
    
    
}
