package com.bestbuy.studentinfo;

import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class DeleteTest extends TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/student";
    }

    @Test
    public void deleteId(){
        Response response = given()
                .pathParams("id", 4)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
