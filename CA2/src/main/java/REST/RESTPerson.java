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

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Emil
 */
@Path("person")
public class RESTPerson {


    public RESTPerson(UriInfo context) {
        this.context = context;
    }


    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestPerson
     */
    public RESTPerson() {
        //facadePerson = new FacadePerson(Persistence.createEntityManagerFactory("ca2pu"));
    }
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ca2pu");
    FacadePerson fp = new FacadePerson(emf);
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

        List<JsonObject> Persons = new ArrayList<>();
        List<Person> list = fp.getPersons();
        for (Person person: list )
        {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("firstName", person.getFirstName());
            jsonObject.addProperty("lastName", person.getLastName());
            jsonObject.addProperty("email", person.getEmail());
            jsonObject.addProperty("address", new Gson().toJson(person.getAddresses()));
            jsonObject.addProperty("phone", new Gson().toJson(person.getPhones()));
            Persons.add(jsonObject);
        }
//
//        List<Person> Persons;
//        Persons = fp.getPersons();
//        System.out.println(" fuck you>" + Persons.size());
//        JsonObject Person = new JsonObject();
//        String str
//                    = "{\"Person\": [";
//        for (int i = 0; i < Persons.size(); i++) {
//            
//                   //str += JSONConverter.getJSONFromPerson(Persons.get(i));
//                   
//            
//        }
//        str +=  "]}";
//        String jsonreponse = new Gson().toJson(Person);

        return new Gson().toJson(Persons);
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
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{id}")
//    public String putPerson(@PathParam("id") int id, String content) {
//        JsonObject person = new JsonObject();
//        Person jo = JSONConverter.getPersonFromJson(content);
//        int temp = id;
//        person.addProperty("id", temp);
//        persons.put(temp, jo);
//        person.addProperty("Person", JSONConverter.getJSONFromPerson(persons.get(temp - 1)));
//        String jsonreponse = new Gson().toJson(person);
//        return jsonreponse;
//    }
//
//    @DELETE
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{id}")
//    public String deletePerson(@PathParam("id") int id) {
//        JsonObject person = new JsonObject();
//        int temp = id;
//        person.addProperty("Person", JSONConverter.getJSONFromPerson(persons.get(temp)));
//        persons.remove(id);
//        String jsonreponse = new Gson().toJson(person);
//        return jsonreponse;
//    }
//
//    /**
//     * Retrieves representation of an instance of rest1.ca2.RESTPerson
//     *
//     * @return an instance of java.lang.String
//     */
//    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    public String getXml() {
//        TODO return proper representation object
//        throw new UnsupportedOperationException();
//    }
//
//    /**
//     * PUT method for updating or creating an instance of RESTPerson
//     *
//     * @param content representation for the resource
//     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_XML)
//    public void putXml(String content) {
//    }
    }
