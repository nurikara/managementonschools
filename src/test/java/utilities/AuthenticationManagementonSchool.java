package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Password;


import static io.restassured.RestAssured.given;

public class AuthenticationManagementonSchool {





    public static String generateToken(String username,String password) {
        Password body = new Password(username,password);

        Response response = given().
                body(body).
                contentType(ContentType.JSON).
                post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");

    }


}
