/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import Facade.FacadeCompany;
import com.google.gson.Gson;
import javax.persistence.Persistence;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
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
@Path("company")
public class RESTCompany {

    
    @Context
    private UriInfo context;

    FacadeCompany facadeCompany;

    public RESTCompany()
    {
        facadeCompany = new FacadeCompany(Persistence.createEntityManagerFactory("ca2pu"));
    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCompanies()
    {
        System.out.println("get all companies");
        return new Gson().toJson(facadeCompany.getAllCompanies());
    }

    @GET
    @Path("{cvr}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompaniesByCVR(@PathParam("cvr") int cvr) throws RuntimeException//throws NotFoundExceptionMapper
    {
        System.out.println("get persons with cvr");
        if(facadeCompany.getCompaniesByCVR(cvr) == null)
        {
            throw new RuntimeException();
        }
        
            return new Gson().toJson(facadeCompany.getCompaniesByCVR(cvr));
   
        
    }  
    
//    @GET
//    @Path("{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getCompaniesByNumber(@PathParam("id") int number)
//    {
//        System.out.println("get persons with cvr");
//        return new Gson().toJson(facadeCompany.getCompaniesByCVR(number));
//    }
    
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void deleteCompany(@PathParam("id") int id)
    {
        System.out.println("deletePerson");
        new Gson().toJson(facadeCompany.deleteCompany(id));
    }
}

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{contactinfo}")
//    public String getCompany(@PathParam("contactinfo") int contactinfo, @DefaultValue("None") @QueryParam("job") String job) {
//        JsonObject Company = new JsonObject();
//        int key = contactinfo;
//        Company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(key)));
//        String jsonreponse = new Gson().toJson(Company);
//        return jsonreponse;
//    }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("Complete")
//    public String getCompany() {
//        JsonObject Company = new JsonObject();
//        for (int i = 0; i < companies.size(); i++) {
//            Company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(i)));
//        }
//        String jsonreponse = new Gson().toJson(Company);
//        return jsonreponse;
//    }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("Complete/id")
//    public String getCompanyid() {
//        JsonObject Company = new JsonObject();
//        for (int i = 0; i < companies.size(); i++) {
//            Company.addProperty("Company", JSONConverter.getJSONFromint(companies.get(i).getId()));
//        }
//        String jsonreponse = new Gson().toJson(Company);
//        return jsonreponse;
//    }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{contactinfo/id}")
//    public String getCompanyid(@PathParam("contactinfo") int contactinfo, @DefaultValue("None") @QueryParam("job") String job) {
//        JsonObject Company = new JsonObject();
//        int key = contactinfo;
//        Company.addProperty("Company", JSONConverter.getJSONFromint(companies.get(key).getId()));
//        String jsonreponse = new Gson().toJson(Company);
//        return jsonreponse;
//    }
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public String postPerson(String content) {
//        JsonObject company = new JsonObject();
//        Company jo = JSONConverter.getCompanyFromJson(content);
//        int temp = company.size();
//        company.addProperty("id", temp);
//        companies.put(temp, jo);
//        company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(temp - 1)));
//        String jsonreponse = new Gson().toJson(company);
//        return jsonreponse;
//    }
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{id}")
//    public String putPerson(@PathParam("id") int id, String content) {
//        JsonObject company = new JsonObject();
//        Company jo = JSONConverter.getCompanyFromJson(content);
//        int temp = id;
//        company.addProperty("id", temp);
//        companies.put(temp, jo);
//        company.addProperty("Company", JSONConverter.getJSONFromCompany(companies.get(temp - 1)));
//        String jsonreponse = new Gson().toJson(company);
//        return jsonreponse;
//    }

