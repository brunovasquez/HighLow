package org.fundacionjala.highlow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link HighAndLow}.
 */
public class HighAndLowTest {
    /**
     * Test to validate the the result for get High and low number.
     */
    @Test
    public void testHighLowValuesCase() {
        assertEquals("5 1", HighAndLow.getHighLow("1 2 3 4 5"));
        assertEquals("5 -3", HighAndLow.getHighLow("1 2 -3 4 5"));
        assertEquals("9 -5", HighAndLow.getHighLow("1 9 3 4 -5"));
    }

}
