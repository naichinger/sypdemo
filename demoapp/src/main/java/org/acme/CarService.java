package org.acme;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class CarService {
    @GET
    public List<Car> findAll() {
        return Car.findAll().list();
    }
}
