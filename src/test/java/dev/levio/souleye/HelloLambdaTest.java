package dev.souleye.levio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloLambdaTest {

    @Test
    public void shouldReturnHelloMessage(){
        var sut = new HelloLambda();
        assertEquals("hello world!", sut.handleRequest());
    }
}
