package org.acme.resource;

import io.quarkus.scheduler.Scheduled;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.client.StatisticClient;
import org.acme.sheduler.StatisticSheduler;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/car")
public class StatisticController {

    @RestClient
    StatisticClient statisticClient;

    @GET
    @Path("/statistic")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){

        return Response.ok(statisticClient.get()).build();
    }
}
