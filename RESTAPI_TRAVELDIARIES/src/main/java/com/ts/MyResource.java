package com.ts;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.TenantDAO;
import com.dao.TravellerDAO;
import com.dto.Tenant;
import com.dto.Traveller;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
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
        return "Got it!";
    }
    @Path("registertraveller")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registertraveller(Traveller traveller) {
		System.out.println("Data Recieved in traveller Register : " + traveller);
		TravellerDAO travellerDAO = new TravellerDAO();
		travellerDAO.register(traveller);
	
	}
    
    @Path("getTravellerByUserPass/{mailId}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Traveller getTravellerByUserPass(@PathParam("mailId") String mailId,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+mailId+" "+password); 
		TravellerDAO travellerDAO = new TravellerDAO();
		Traveller traveller = travellerDAO.getTravellerByUserPass(mailId, password);
		System.out.println("Traeller details in myresource : "+traveller);
		return traveller;
	}
    @Path("getTenantByUserPass/{mailId}/{password}")
   	@GET
   	@Produces(MediaType.APPLICATION_JSON)
   	public Tenant getTenantByUserPass(@PathParam("mailId") String mailId,@PathParam("password") String password) {
   		System.out.println("Recieved path params: "+mailId+" "+password); 
   		TenantDAO tenantDAO = new TenantDAO();
   		Tenant tenant = tenantDAO.getTenantByUserPass(mailId, password);
   		System.out.println("Traeller details in myresource : "+tenant);
   		return tenant;
   	}
    
    @Path("registertenant")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registertenant(Tenant tenant) {
		System.out.println("Data Recieved in tenant Register : " + tenant);
		TenantDAO tenantDAO = new TenantDAO();
		tenantDAO.register(tenant);
	
	}
}
