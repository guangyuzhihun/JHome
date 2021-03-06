package com.bheternal.jhome.computer.algo.hash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        assertEquals(
                Arrays.toString(new int[]{0, 1}),
                Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9))
        );
    }
}