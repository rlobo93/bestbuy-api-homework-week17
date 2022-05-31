package com.bestbuy.studentinfo;


import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class PatchTest extends TestBase {

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
    public void updateStudentWithPatch(){

    }
}
