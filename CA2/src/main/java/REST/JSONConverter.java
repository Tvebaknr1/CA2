/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import Entity.Company;
import Entity.Person;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.util.List;

/**
 *
 * @author Emil
 */
public class JSONConverter {

    public static Company getCompanyFromJson(String js) {
        Gson gson = new Gson();
        Company result = gson.fromJson(js, Company.class);
        return result;
    }

    public static String getJSONFromCompany(Company c) {
        Gson gson = new Gson();
        String jsonInString = gson.toJson(c);
        return jsonInString;
    }

    public static String getJSONFromCompany(List<Company> Company) {
        JsonArray jarray = new JsonArray();
        for (Company p : Company) {
            jarray.add(JSONConverter.getJSONFromCompany(p));
        }

        return jarray.toString();
    }
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

    public static String getJSONFromPerson(List<Person> Person) {
        JsonArray jarray = new JsonArray();
        for (Person p : Person) {
            jarray.add(JSONConverter.getJSONFromPerson(p));
        }

        return jarray.toString();
    }
    public static String getJSONFromint(int i) {
        Gson gson = new Gson();
        String jsonInString = gson.toJson(i);
        return jsonInString;
    }
}
