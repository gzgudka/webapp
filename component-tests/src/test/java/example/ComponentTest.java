package example;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class ComponentTest {

    @Test
    public void shouldSayHelloWorld() {
        when()
            .get("http://localhost:8080/hello")
        .then()
            .statusCode(200)
            .body(is("Hello World"));
    }

}
