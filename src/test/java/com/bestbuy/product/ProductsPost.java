package com.bestbuy.product;

import com.bestbuy.model.ProductsPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductsPost   {

    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }

    @Test
    public void createProduct() {
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("Energizer - MAX Batteries AA (4-Pack)");
        productsPojo.setType("HardGood");
        productsPojo.setPrice(4.99);
        productsPojo.setUpc("039800011329");
        productsPojo.setShipping(0);
        productsPojo.setDescription("4-pack AA alkaline batteries; battery tester included");
        productsPojo.setManufacturer("Energizer");
        productsPojo.setModel("E91BP-4");
        productsPojo.setUrl("http://www.bestbuy.com/site/energizer-max-batteries-aa-4-pack/150115.p?id=1051384046217&skuId=150115&cmp=RMXCC");
        productsPojo.setImage("http://img.bbystatic.com/BestBuy_US/images/products/1501/150115_sa.jpg");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productsPojo)
                .when()
                .post("/products");
        response.prettyPrint();
        response.then().statusCode(201);

    }





}
