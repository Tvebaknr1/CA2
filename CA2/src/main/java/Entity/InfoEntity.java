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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author LouiseB
 */
@Entity
public class InfoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;

    @OneToMany(mappedBy = "infoEntity")
    List<Phone> phones = new ArrayList();

    //List<Address> addresses = new ArrayList();
    @ManyToOne
    private Address address;

    public InfoEntity() {
    }

    public InfoEntity(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getPhones() {
        List<String> list = new ArrayList();
        for (Phone p : phones) {
            list.add(p.getDescription() + p.getNumber());
        }
        return list;
    }

    public String getAddresses() {
        return address.getStreet() + " " + address.getAdditionalInfo();

    }
    
    public Address getAddress()
    {
        return address;
    }

}
