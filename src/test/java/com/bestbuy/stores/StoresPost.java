package com.bestbuy.stores;

import com.bestbuy.model.StoresPojo;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class StoresPost {


    @Test
    public void createUser() {

        HashMap<Object,Object> services = new HashMap<>();
        services.put("01","Computer,Laptop, Gpu Repair");
        services.put("02","Custom Pc Building");

        StoresPojo storesPojo = new StoresPojo();
        storesPojo.setName("Ron");
        storesPojo.setType("Jirs");
        storesPojo.setAddress("101 London Street");
        storesPojo.setAddress2("london Road");
        storesPojo.setCity("London");
        storesPojo.setState("london");
        storesPojo.setZip("66205");
        storesPojo.setHours("Mon: 09:00-19:00; Tue: 09:00-19:00; Wed: 09:00-19:00; Thurs: 09:00-19:00 Fri: 09:00-19:00; Sat: 09:00-16:00; Sun: closed");
        storesPojo.setServices(services);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(storesPojo)
                .when()
                .post("/stores");
        response.prettyPrint();
        response.then().statusCode(201);
    }

}
