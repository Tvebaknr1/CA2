/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class CityInfo implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int zip;
    private String city;

    @OneToMany(mappedBy = "cityInfo")
    List<Address> addresses = new ArrayList();
    
    public CityInfo()
    {
    }

    public CityInfo(int zip, String city)
    {
        this.zip = zip;
        this.city = city;
    }

    public int getId()
    {
        return id;
    }

    public int getZip()
    {
        return zip;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    
}
