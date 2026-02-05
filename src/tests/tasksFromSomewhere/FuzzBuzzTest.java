package tests.tasksFromSomewhere;

import org.junit.Test;
import tasksFromSomewhere.FizzBuzzTest;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class FuzzBuzzTest {
    @Test
    public void checkIfReturnBuzz() {
        byte[] result = FizzBuzzTest.hello(10);
        assertEquals("BUZZ", new String(result, StandardCharsets.UTF_8));
    }

    @Test
    public void checkIsReturnFizz() {
        byte[] result = FizzBuzzTest.hello(36);
        assertEquals("FIZZ", new String(result, StandardCharsets.UTF_8));
    }

    @Test
    public void checkIfReturnFizzBuzz() {
        byte[] result = FizzBuzzTest.hello(15);
        assertEquals("FIZZBUZZ", new String(result, StandardCharsets.UTF_8));
    }

    @Test
    public void checkIfThrowException() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzTest.hello(97));
    }

}
