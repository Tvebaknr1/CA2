/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import Entity.Company;
import Facade.FacadeCompany;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
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
@Path("company")
public class RESTCompany {
    private static Map<Integer, Company> companies = new HashMap() {
        {
        }
    };
    
    FacadeCompany fc;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RESTCompany
     */
    public RESTCompany() {
        fc = new FacadeCompany(Persistence.createEntityManagerFactory("CA2PU"));
        List<Company> a = fc.getCompanys();
        if(!a.isEmpty())
        for (int i = 0; i < a.size(); i++) {
            companies.put(i, a.get(i));
        }
    }

    /**
     * Retrieves representation of an instance of rest1.ca2.RESTCompany
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{contactinfo}")
    public String getCompany(@PathParam("contactinfo") int contactinfo, @DefaultValue("None") @QueryParam("job") String job) {
        JsonObject Company = new JsonObject();
        int key = contactinfo;
        Company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(key)));
        String jsonreponse = new Gson().toJson(Company);
        return jsonreponse;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Complete")
    public String getCompany() {
        JsonObject Company = new JsonObject();
        for (int i = 0; i < companies.size(); i++) {
            Company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(i)));
        }
        String jsonreponse = new Gson().toJson(Company);
        return jsonreponse;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Complete/id")
    public String getCompanyid() {
        JsonObject Company = new JsonObject();
        for (int i = 0; i < companies.size(); i++) {
            Company.addProperty("Company", JSONConverter.getJSONFromint(companies.get(i).getId()));
        }
        String jsonreponse = new Gson().toJson(Company);
        return jsonreponse;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{contactinfo/id}")
    public String getCompanyid(@PathParam("contactinfo") int contactinfo, @DefaultValue("None") @QueryParam("job") String job) {
        JsonObject Company = new JsonObject();
        int key = contactinfo;
        Company.addProperty("Company", JSONConverter.getJSONFromint(companies.get(key).getId()));
        String jsonreponse = new Gson().toJson(Company);
        return jsonreponse;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String postPerson(String content) {
        JsonObject company = new JsonObject();
        Company jo = JSONConverter.getCompanyFromJson(content);
        int temp = company.size();
        company.addProperty("id", temp);
        companies.put(temp, jo);
        company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(temp - 1)));
        String jsonreponse = new Gson().toJson(company);
        return jsonreponse;
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String putPerson(@PathParam("id") int id, String content) {
        JsonObject company = new JsonObject();
        Company jo = JSONConverter.getCompanyFromJson(content);
        int temp = id;
        company.addProperty("id", temp);
        companies.put(temp, jo);
        company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(temp - 1)));
        String jsonreponse = new Gson().toJson(company);
        return jsonreponse;
    }
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String deletePerson(@PathParam("id") int id) {
        JsonObject company = new JsonObject();
        int temp = id;
        company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(temp)));
        companies.remove(id);
        String jsonreponse = new Gson().toJson(company);
        return jsonreponse;
    }


    /**
     * PUT method for updating or creating an instance of RESTCompany
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
