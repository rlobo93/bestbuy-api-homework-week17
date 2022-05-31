package com.bestbuy.product;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductsDelete extends TestBase {

    @Test
    public void deleteProductId() {
        Response response = given()
                .pathParam("id",48530)
                .when()
                .delete("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }


}
