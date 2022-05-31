package com.bestbuy.product;

import com.bestbuy.model.ProductsPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductsPatch   {

    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }

    @Test
    public void updateProduct() {
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("Duracell - AA 1.5V CopperTop Batteries (4-Pack)");
        productsPojo.setType("HardGood");
        productsPojo.setPrice(5.49);
        productsPojo.setUpc("041333415017");
        productsPojo.setShipping(0);
        productsPojo.setDescription("Long-lasting energy; DURALOCK Power Preserve technology; for toys, clocks, radios, games, remotes, PDAs and more");
        productsPojo.setManufacturer("Duracell");
        productsPojo.setModel("MN1500B4Z");
        productsPojo.setUrl("http://www.bestbuy.com/site/duracell-aa-1-5v-coppertop-batteries-4-pack/48530.p?id=1099385268988&skuId=48530&cmp=RMXCC");
        productsPojo.setImage("http://img.bbystatic.com/BestBuy_US/images/products/4853/48530_sa.jpg");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productsPojo)
                .when()
                .patch("/products/127687");
        response.prettyPrint();
        response.then().statusCode(200);

    }



}
