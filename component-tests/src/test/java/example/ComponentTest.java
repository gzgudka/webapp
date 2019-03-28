package example;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.core.Is.is;

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
