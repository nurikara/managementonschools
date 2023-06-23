package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class AuthenticationManagementonSchool {


    public static void main(String[] args) {
        System.out.println("generateToken() = " + generateToken());
    }

    public static String generateToken(){
        String body = "{\"password\": \"12345678\",\"username\": \"DEAN\"}";
        Response response = given().contentType(ContentType.JSON).body(body).post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");


    }

}
