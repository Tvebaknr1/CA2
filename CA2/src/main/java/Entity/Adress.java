/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LouiseB
 */
@Entity
public class Adress implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String additionalInfo;

    public Adress()
    {
    }

    public Adress(String street, String additionalInfo)
    {
        this.street = street;
        this.additionalInfo = additionalInfo;
    }

    public int getId()
    {
        return id;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getAdditionalInfo()
    {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo)
    {
        this.additionalInfo = additionalInfo;
    }
    
    
    
}
