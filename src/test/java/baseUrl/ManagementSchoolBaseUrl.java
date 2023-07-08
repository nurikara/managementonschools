package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static utilities.AuthenticationManagementonSchool.generateToken;

public class ManagementSchoolBaseUrl {
    public static RequestSpecification spec;

    public static void setUp(){
        spec = new RequestSpecBuilder().
                setBaseUri("https://managementonschools.com/app/").
                setContentType(ContentType.JSON).
                build();
    }

}
