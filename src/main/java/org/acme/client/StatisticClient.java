package org.acme.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("cars/statistic-color")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(configKey = "statistic-service")
public interface StatisticClient {

    @GET
    String get();
}
