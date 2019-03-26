package dev.samdjstevens.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    /**
     * Run the FizzBuzz game up to a given number of turns, and return the
     * comma separated string of all outputs.
     *
     * @param totalTurns The number of turns to run the game for.
     * @return The string of all outputs from the turns.
     */
    public String run(int totalTurns) {
        // Create a stream of integers, 0...totalTurns -1, and
        // map to the string output counterpart, before collecting
        // and reducing to a comma separated string.
        return IntStream.range(0, totalTurns)
                .mapToObj(i -> getStringForNumber(i + 1))
                .collect(Collectors.joining(", "));
    }

    /**
     * Returns the string to be outputted for a given integer.
     *
     * @param number The number we want the output for, e.g. 1, 2, 3, etc.
     * @return The string to output for the number, e.g. "1", "two", "Fizz", etc.
     */
    protected String getStringForNumber(int number) {
        // If divisible by both 3 and 5, return FizzBuzz
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        // If divisible by 3, return Fizz
        if (number % 3 == 0) {
            return "Fizz";
        }

        // If divisible by 5, return Buzz
        if (number % 5 == 0) {
            return "Buzz";
        }

        // Otherwise, return a string version of the number
        return String.valueOf(number);
    }
}
