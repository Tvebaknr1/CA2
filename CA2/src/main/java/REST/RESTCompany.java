/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import Entity.Company;
import Facade.FacadeCompany;
import RESTException.CompanyNotFoundException;
import com.google.gson.Gson;
import java.util.List;
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
    public String getAllCompanies() throws RuntimeException
    {
        System.out.println("get all companies");
        return new Gson().toJson(facadeCompany.getAllCompanies());
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompany(@PathParam("id") int id) throws CompanyNotFoundException
    {
        System.out.println("get company by id");
        
        Company company = facadeCompany.getCompanyById(id);
        System.out.println(company);
        if(company == null)
        {
            throw new CompanyNotFoundException();
        }
        return new Gson().toJson(company);
    }

    @GET
    @Path("cvr/{cvr}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompaniesByCVR(@PathParam("cvr") int cvr) throws CompanyNotFoundException
    {
        System.out.println("get company with cvr");
        List<Company> company = facadeCompany.getCompaniesByCVR(cvr);
        System.out.println(company);
        if(company.isEmpty())
        {
            System.out.println("fejl printes");
           throw new CompanyNotFoundException();
        }
        
            return new Gson().toJson(company);
    }    
    
    @GET
    @Path("marketvalue/{marketvalue}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompaniesByMarketValue(@PathParam("marketvalue") int markV) throws CompanyNotFoundException
    {
        System.out.println("get company with market value");
        List<Company> company = facadeCompany.getCompaniesByMarketValue(markV);
        System.out.println(company);
        if(company.isEmpty())
        {
            System.out.println("fejl printes");
           throw new CompanyNotFoundException();
        }
        
            return new Gson().toJson(company);
    } 
//    
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String deleteCompany(@PathParam("id") int id) throws RuntimeException
    {
        System.out.println("deletePerson");
        
        return new Gson().toJson(facadeCompany.deleteCompany(id));
    }
}



