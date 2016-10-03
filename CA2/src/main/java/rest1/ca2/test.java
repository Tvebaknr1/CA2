/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest1.ca2;

import javax.persistence.Persistence;

/**
 *
 * @author Emil
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        facade fa = new facade(Persistence.createEntityManagerFactory("REST1_CA2_war_1.0PU"));
    }
    
}
