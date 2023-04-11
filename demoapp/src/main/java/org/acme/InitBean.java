package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.transaction.Transactional;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class InitBean {
    
    @Transactional
    public void start(@Observes StartupEvent event){
        Car e30_1 = new Car();
        e30_1.brand = "bmw";
        e30_1.model = "e30";
        e30_1.motor = "316i";
        Car e30_2 = new Car();
        e30_2.brand = "bmw";
        e30_2.model = "e30";
        e30_2.motor = "318i";
        Car e30_3 = new Car();
        e30_3.brand = "bmw";
        e30_3.model = "e30";
        e30_3.motor = "320i";
        Car e30_4 = new Car();
        e30_4.brand = "bmw";
        e30_4.model = "e30";
        e30_4.motor = "325i";
       
        Car e32_1 = new Car();
        e32_1.brand = "bmw";
        e32_1.model = "e32";
        e32_1.motor = "730i";
        Car e32_2 = new Car();
        e32_2.brand = "bmw";
        e32_2.model = "e32";
        e32_2.motor = "735i";
        Car e32_3 = new Car();
        e32_3.brand = "bmw";
        e32_3.model = "e32";
        e32_3.motor = "740i"; 
        Car e32_4 = new Car();
        e32_4.brand = "bmw";
        e32_4.model = "e32";
        e32_4.motor = "750i";
        
    
        Car e34_1 = new Car();
        e34_1.brand = "bmw";
        e34_1.model = "e34";
        e34_1.motor = "518i"; 
        Car e34_2 = new Car();
        e34_2.brand = "bmw";
        e34_2.model = "e34";
        e34_2.motor = "520i"; 
        Car e34_3 = new Car();
        e34_3.brand = "bmw";
        e34_3.model = "e34";
        e34_3.motor = "525i"; 
        Car e34_4 = new Car();
        e34_4.brand = "bmw";
        e34_4.model = "e34";
        e34_4.motor = "530i"; 

        Car.persist(e30_1);
        Car.persist(e30_2);
        Car.persist(e30_3);
        Car.persist(e30_4);

        Car.persist(e32_1);
        Car.persist(e32_2);
        Car.persist(e32_3);
        Car.persist(e32_4);

        Car.persist(e34_1);
        Car.persist(e34_2);
        Car.persist(e34_3);
        Car.persist(e34_4);
    }
}
