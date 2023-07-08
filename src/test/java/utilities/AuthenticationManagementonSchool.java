package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class AuthenticationManagementonSchool {


    public static void main(String[] args) {
        System.out.println("generateToken() = " + generateToken());
    }

    public static String generateToken() {
        String body = "{\"password\": \"87654321\",\"username\": \"ViceDeanTeam05\"}";
        Response response = given().
                body(body).
                contentType(ContentType.JSON).
                post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }


}
