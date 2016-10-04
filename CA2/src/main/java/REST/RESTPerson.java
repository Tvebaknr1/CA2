/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import Entity.Person;
import Facade.FacadePerson;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Emil
 */
@Path("person")
public class RESTPerson {

    private static Map<Integer, Person> persons = new HashMap() {
        {
        }
    };
    FacadePerson facadePerson;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestPerson
     */
    public RESTPerson() {
        facadePerson = new FacadePerson(Persistence.createEntityManagerFactory("ca2pu"));
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("contactinfo/{contactinfo}")
//    public String getPerson(@PathParam("contactinfo") int contactinfo, @DefaultValue("None") @QueryParam("job") String job) {
//        JsonObject person = new JsonObject();
//        int key = contactinfo;
//        person.addProperty("Person", JSONConverter.getJSONFromPerson(persons.get(key)));
//        String jsonreponse = new Gson().toJson(person);
//        return jsonreponse;
//    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("complete")
    public String getPerson() {

        JsonObject Person = new JsonObject();
        for (int i = 0; i < persons.size(); i++) {
            Person.addProperty("Person", JSONConverter.getJSONFromPerson(persons.get(i)));
        }
        String jsonreponse = new Gson().toJson(Person);
        return jsonreponse;
    }
//
//    @GET
//    @Path("{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getPerson(@PathParam("id") int id) 
//    {
//        System.out.println("getPerson");
//        Person p = facadePerson.getPerson(id);
//        return new Gson().toJson(facadePerson.getPerson(id));
//    }
//

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{contactinfo/id}")
//    public String getPersonid(@PathParam("contactinfo") int contactinfo, @DefaultValue("None") @QueryParam("job") String job) {
//        JsonObject person = new JsonObject();
//        int key = contactinfo;
//        person.addProperty("Person", JSONConverter.getJSONFromint(persons.get(key).getId()));
//        String jsonreponse = new Gson().toJson(person);
//        return jsonreponse;
//    }
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public String postPerson(String content) {
//        JsonObject person = new JsonObject();
//        Person jo = JSONConverter.getPersonFromJson(content);
//        int temp = persons.size();
//        person.addProperty("id", temp);
//        persons.put(temp, jo);
//        person.addProperty("Person", JSONConverter.getJSONFromPerson(persons.get(temp - 1)));
//        String jsonreponse = new Gson().toJson(person);
//        return jsonreponse;
//    }
//
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String putPerson(@PathParam("id") int id, String content) {
        JsonObject person = new JsonObject();
        Person jo = JSONConverter.getPersonFromJson(content);
        int temp = id;
        person.addProperty("id", temp);
        persons.put(temp, jo);
        person.addProperty("Person", JSONConverter.getJSONFromPerson(persons.get(temp - 1)));
        String jsonreponse = new Gson().toJson(person);
        return jsonreponse;
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String deletePerson(@PathParam("id") int id) {
        JsonObject person = new JsonObject();
        int temp = id;
        person.addProperty("Person", JSONConverter.getJSONFromPerson(persons.get(temp)));
        persons.remove(id);
        String jsonreponse = new Gson().toJson(person);
        return jsonreponse;
    }
    }
