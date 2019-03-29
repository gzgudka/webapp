package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@Execution(CONCURRENT)
public class HelloServiceTest {

    @Test
    public void shouldSayHelloWhenGregCallsIt() {
        // given
        String name = "Greg";

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // when
        String msg = new HelloService().sayHello(name);

        // then
        assertThat(msg, is("Hello Greg"));
    }

    @Test
    public void shouldSayHelloWhenMikeCallsIt() {
        // given
        String name = "Mike";

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // when
        String msg = new HelloService().sayHello(name);

        // then
        assertThat(msg, is("Hello Mike"));
    }

    @Test
    public void shouldSayHelloWhenJohnCallsIt() {
        // given
        String name = "John";

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // when
        String msg = new HelloService().sayHello(name);

        // then
        assertThat(msg, is("Hello John"));
    }

    @Test
    public void shouldSayHelloWhenMikeCallsIt2() {
        // given
        String name = "Mike";

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // when
        String msg = new HelloService().sayHello(name);

        // then
        assertThat(msg, is("Hello Mike"));
    }

    @Test
    public void shouldSayHelloWhenJohnCallsIt2() {
        // given
        String name = "John";

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // when
        String msg = new HelloService().sayHello(name);

        // then
        assertThat(msg, is("Hello John"));
    }

}