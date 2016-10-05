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
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

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
    @Path("all")
    public String getPerson() {

        List<JsonObject> Persons = new ArrayList<>();
        List<Person> list = fp.getPersons();
        for (Person person : list) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("firstName", person.getFirstName());
            jsonObject.addProperty("lastName", person.getLastName());
            jsonObject.addProperty("email", person.getEmail());
            jsonObject.addProperty("address", new Gson().toJson(person.getAddresses()));
            Persons.add(jsonObject);
        }
        return new Gson().toJson(Persons);
    }

    @GET
    @Path("firstname/{firstName}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonByFirstname(@PathParam("firstName") String firstName) {
        List<JsonObject> Persons = new ArrayList<>();
        List<Person> list = fp.getPersonByName(firstName);
        for (Person person : list) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("firstName", person.getFirstName());
            jsonObject.addProperty("lastName", person.getLastName());
            jsonObject.addProperty("email", person.getEmail());
            jsonObject.addProperty("address", new Gson().toJson(person.getAddresses()));
            Persons.add(jsonObject);
        }
        return new Gson().toJson(Persons);
    }

    @GET
    @Path("zip/{zip}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonByZip(@PathParam("zip") int zip) {
        List<JsonObject> Persons = new ArrayList<>();
        List<Person> list = fp.getPersonByZip(zip);
        for (Person person : list) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("firstName", person.getFirstName());
            jsonObject.addProperty("lastName", person.getLastName());
            jsonObject.addProperty("email", person.getEmail());
            jsonObject.addProperty("address", new Gson().toJson(person.getAddresses()));
            Persons.add(jsonObject);
        }
        return new Gson().toJson(Persons);
    }

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
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String putPerson(@PathParam("id") int id, String content) {
        JsonObject person = new JsonObject();
        Person jo = JSONConverter.getPersonFromJson(content);
        fp.put(jo);
        String jsonreponse = new Gson().toJson(person);
        return jsonreponse;
    }


    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String deletePerson(@PathParam("id") int id) throws RuntimeException
    {
        System.out.println("delete person");

        return new Gson().toJson(fp.removePersonbyid(id));
    }
}
