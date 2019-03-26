package dev.samdjstevens.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class AdvancedFizzBuzzTest {

    @Test
    public void testGame() {
        // Create a rule set instructing:
        // - Fizz for multiples of 3
        // - Buzz for multiples of 5
        // - FizzBuzz for multiples of 3 and 5
        // - Foo for multiples of 2 and 7
        HashMap<String, Set<Integer>> rules = new HashMap();
        rules.put("Fizz", new HashSet<>(Arrays.asList(3)));
        rules.put("Buzz", new HashSet<>(Arrays.asList(5)));
        rules.put("FizzBuzz", new HashSet<>(Arrays.asList(3, 5)));
        rules.put("Foo", new HashSet<>(Arrays.asList(2, 7)));

        AdvancedFizzBuzz game = new AdvancedFizzBuzz(rules);
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, Foo, FizzBuzz", game.run(15));
    }
}
