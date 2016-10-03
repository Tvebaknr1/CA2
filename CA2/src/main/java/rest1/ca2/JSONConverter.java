/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest1.ca2;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.util.List;

/**
 *
 * @author Emil
 */
public class JSONConverter {

    public static Person getPersonFromJson(String js) {
        Gson gson = new Gson();
        Person result = gson.fromJson(js, Person.class);
        return result;
    }

    public static String getJSONFromPerson(Person p) {
        Gson gson = new Gson();
        String jsonInString = gson.toJson(p);
        return jsonInString;
    }

    public static String getJSONFromPerson(List<Person> Persons) {
        JsonArray jarray = new JsonArray();
        for (Person p : Persons) {
            jarray.add(getJSONFromPerson(p));
        }

        return jarray.toString();
    }
}
