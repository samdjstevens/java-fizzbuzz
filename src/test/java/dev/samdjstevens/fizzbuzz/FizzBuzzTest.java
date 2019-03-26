package dev.samdjstevens.fizzbuzz;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testGame() {
        FizzBuzz game = new FizzBuzz();
        assertEquals(this.getCorrectOutputUpTo30(), game.run(30));
    }

    /**
     * Get the correct output of the game when running for 30 turns.
     */
    private String getCorrectOutputUpTo30() {
        return "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz";
    }
}