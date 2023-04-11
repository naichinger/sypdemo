package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Car extends PanacheEntity {
    public String brand;
    public String model;
    public String motor;
}
