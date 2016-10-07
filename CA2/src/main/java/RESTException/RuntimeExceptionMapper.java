/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author LouiseB
 */
@Provider
public class RuntimeExceptionMapper implements ExceptionMapper<RuntimeException>
{
    @Context
    ServletContext context;
    
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    @Override
    public Response toResponse(RuntimeException e)
    {
        boolean isDebug = false;

        ErrorMessage err = new ErrorMessage(e, 500, isDebug);
        err.setMessage("Internal Server Problem. We are sorry for the inconvenience");
        
        return Response.status(500).entity(gson.toJson(err)).type(MediaType.APPLICATION_JSON).build(); 
    }
}
