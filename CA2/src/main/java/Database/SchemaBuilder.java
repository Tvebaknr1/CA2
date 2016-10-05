/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author LouiseB
 */
public class SchemaBuilder
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HashMap<String, Object> puProperties = new HashMap<>();
        //puProperties.put("javax.persistence.sql-load-script-source", "Data/CityInfoData.sql");
        Persistence.generateSchema("ca2pu", puProperties);

    }
    
}
