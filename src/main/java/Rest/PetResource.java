/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import Entities.Pet;
import Entities.PetDTO;
import Facade.Facade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Morten
 */
@Path("Pet")
public class PetResource {

    @Context
    private UriInfo context;
    Facade pf = new Facade();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    /**
     * Creates a new instance of PetResource
     */
    public PetResource() {
    }

    /**
     * Retrieves representation of an instance of Rest.PetResource
     * @return an instance of java.lang.String
     */
    @GET    
    @Path("/GetAll")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
       List<PetDTO> lp = pf.getAllPets();
       return gson.toJson(lp);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
       List<PetDTO> lp = pf.getAllPets();
       return "{\"petCount\":"+ lp.size()+"}";
    }

}
