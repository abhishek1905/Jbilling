package com.appDirect.product.jBilling;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        
    	System.out.println("Here");
    	
    	ProductDaoImpl pd = new ProductDaoImpl();
    	
    	pd.addProduct(9,"XYZ1234",3225);
    	
    	return "Success";
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addProduct(Product product){
    	
    	ProductDaoImpl pd = new ProductDaoImpl();
    	
    	pd.addProduct(3,product.getProductName(),product.getBasePrice());
    	
    	return "OK";
    	
    }
}
