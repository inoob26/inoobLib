package com.inoobLib.Random;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * {@code IntegerRandom} generate unique pseudo random list of Integer values.
 *
 * @author inoob
 * @since 0.1
 */
public class IntegerRandom {
    /**
     * this list keep used values.
     */
    private Set<Integer> list = new HashSet<Integer>();
    /**
     * random.
     */
    private Random random = new Random();

    /**
     * Generate Unique values.
     *
     * @param max value of range values 0..max .
     * @param count of values.
     * @return random.
     */
    public final Set<Integer> generateRandom(final int max, final int count) {
        int temp = 0;
        for (int i = 0; i < count; i++) {
            temp = this.random.nextInt(max);
            if(!this.list.contains(temp)) {
                this.list.add(temp);
            }else {
                i--;
            }
        }

        return this.list;
    }

}
