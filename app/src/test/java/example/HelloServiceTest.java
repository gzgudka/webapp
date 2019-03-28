package example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HelloServiceTest {

    @Test
    public void shouldSayHelloWhenGregCallsIt() {
        // given
        String name = "Greg";

        // when
        String msg = new HelloService().sayHello(name);

        // then
        assertThat(msg, is("Hello Greg"));
    }

}