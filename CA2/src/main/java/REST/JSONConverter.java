/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.util.List;
import Interface.PersonInterface;

/**
 *
 * @author Emil
 */
public class JSONConverter {

    public static PersonInterface getPersonFromJson(String js) {
        Gson gson = new Gson();
        PersonInterface result = gson.fromJson(js, PersonInterface.class);
        return result;
    }

    public static String getJSONFromPerson(PersonInterface p) {
        Gson gson = new Gson();
        String jsonInString = gson.toJson(p);
        return jsonInString;
    }

    public static String getJSONFromPerson(List<PersonInterface> Persons) {
        JsonArray jarray = new JsonArray();
        for (PersonInterface p : Persons) {
            jarray.add(getJSONFromPerson(p));
        }

        return jarray.toString();
    }
}
