package dev.samdjstevens.fizzbuzz;

import java.util.HashMap;
import java.util.Set;

/**
 * An advanced version of the game where a custom set of "words for divisors" rules
 * is given. For example, the creator can say that for a number divisible by both 2 and 7, say "Foo".
 */
public class AdvancedFizzBuzz extends FizzBuzz {

    /**
     * A hash map storing the word -> divisors rules for the game.
     */
    private HashMap<String, Set<Integer>> rules;

    public AdvancedFizzBuzz(HashMap<String, Set<Integer>> rules) {
        this.rules = rules;
    }

    /**
     * Returns the string to be outputted for a given integer.
     *
     * @param number The number we want the output for, e.g. 1, 2, 3, etc.
     * @return The string to output for the number, e.g. "1", "two", "Fizz", etc.
     */
    @Override
    protected String getStringForNumber(int number) {
        // This can be improved greatly by finding the Least Common Multiple of
        // the divisors and only checking against that number

        for (String word : rules.keySet()) {
            Set<Integer> divisors = rules.get(word);
            boolean matches = true;

            for (Integer divisor : divisors) {
                if (number % divisor != 0) {
                    matches = false;
                }
            }

            if (matches) {
                return word;
            }
        }

        // Otherwise, return a string version of the number
        return String.valueOf(number);
    }
}
