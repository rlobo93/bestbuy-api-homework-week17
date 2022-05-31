package com.bestbuy.studentinfo;

import com.bestbuy.model.StudentPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class PutTest extends TestBase {

    //Homework




    @Test
    public void putid(){
        StudentPojo studentPojo = new StudentPojo();

        Response response =given()
                .body(studentPojo)
                .when()
                .patch("/id");
        response.then().statusCode(200);
        response.prettyPrint();
    }



}
