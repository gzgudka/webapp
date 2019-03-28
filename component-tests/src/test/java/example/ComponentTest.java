package example;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static io.restassured.RestAssured.when;
import static org.hamcrest.core.Is.is;

public class ComponentTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = Optional.ofNullable(System.getenv("BASE_URL")).orElse("http://localhost:8080");
    }

    @Test
    public void shouldSayHelloWorld() {
        when()
            .get("/hello")
        .then()
            .log().ifError()
            .statusCode(200)
            .body(is("Hello World"));
    }

}
