package example;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class HelloServiceTest {

    @Test
    public void shouldSayHelloWhenGregCallsIt() {
        // given
        String name = "Greg";

        // when
        String msg = new HelloService().sayHello(name);

        // then
        assertThat(msg, Is.is("Hello Greg"));
    }

}