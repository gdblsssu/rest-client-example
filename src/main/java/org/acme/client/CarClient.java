package org.acme.client;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.CarDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(configKey = "test-service")
public interface CarClient {
    @GET
    List<CarDTO> getCars();
}
