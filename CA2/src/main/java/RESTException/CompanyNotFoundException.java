/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTException;

/**
 *
 * @author LouiseB
 */
public class CompanyNotFoundException extends Exception
{

    public CompanyNotFoundException()
    {
    }
    
    public CompanyNotFoundException(String msg)
    {
        super(msg);
    }
    
}
