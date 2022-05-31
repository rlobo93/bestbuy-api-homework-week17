package com.bestbuy.studentinfo;


import com.bestbuy.model.StudentPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class PostTest extends TestBase {

    @Test
    public void deleteId(){
        Response response = given()
                .pathParams("id", 4)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    @Test
    public void createStudent() {

        List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("Selenium");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("ron");
        studentPojo.setLastName("Jira");
        studentPojo.setEmail("r125@gmail.com");
        studentPojo.setProgramme("Testing");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();


    }
}
