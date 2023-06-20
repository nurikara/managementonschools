package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static utilities.AuthenticationManagementonSchool.generateToken;

public class ManagementSchoolBaseUrl {
    public static RequestSpecification spec;


    public static void setUp(){
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken()).
                setBaseUri("https://managementonschools.com/app/").
                build();

    }

}
