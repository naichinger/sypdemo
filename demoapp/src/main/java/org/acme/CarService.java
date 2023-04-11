package org.acme;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("cars")
public class CarService {
    @Path("all")
    @GET
    public List<Car> findAll() {
        return Car.findAll().list();
    }
}
