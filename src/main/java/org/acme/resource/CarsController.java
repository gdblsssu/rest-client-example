package org.acme.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.client.CarClient;
import org.acme.client.StatisticClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/car")
public class CarsController {

    @RestClient
    StatisticClient statisticClient;
    @RestClient
    CarClient carClient;

    @GET
    @Path("/statistic")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){

        return Response.ok(statisticClient.get()).build();
    }

    @GET
    @Path("/list_cars")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){

        return Response.ok(carClient.getCars()).build();
    }
}
