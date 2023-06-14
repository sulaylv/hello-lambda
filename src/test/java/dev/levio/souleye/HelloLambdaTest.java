package dev.levio.souleye;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloLambdaTest {

    @Test
    public void shouldReturnHelloMessage(){
        var msg = new HelloLambda();
        assertEquals("hello world...", msg.handleRequest());
    }
}
