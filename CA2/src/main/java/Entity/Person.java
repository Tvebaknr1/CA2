/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author LouiseB
 */
@Entity
public class Person extends InfoEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    int id;

    String firstName;
    String lastName;

    @ManyToMany
    List<Hobby> hobbies = new ArrayList();

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return firstName + lastName + super.getEmail();
    }
    
    public List getMyHobbies() {
        List<String> list = new ArrayList();
        for (Hobby h : hobbies) {
            list.add(h.getName());
        }
        return list;
    }

}
