package org.fundacionjala.highlow;

import java.util.Arrays;

/**
 * Class that searc high and low number.
 */
final class HighAndLow {

    /**
     * Private constructor.
     */
    private HighAndLow() {
    }

    /**
     * Method to add get the high and low number.
     *
     * @param numbers a String that contain the numbers.
     * @return the high and low numbers as a string.
     */
    static String getHighLow(final String numbers) {
        String[] array = numbers.split(" ");
        return String.format("%d %d",
                Arrays.stream(array).mapToInt(Integer::parseInt).max().getAsInt(),
                Arrays.stream(array).mapToInt(Integer::parseInt).min().getAsInt());
    }
}
