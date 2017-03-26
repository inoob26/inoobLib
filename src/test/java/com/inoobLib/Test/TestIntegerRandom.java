package com.inoobLib.Test;

import com.inoobLib.Alghoritm.Algorithms;
import com.inoobLib.Random.IntegerRandom;
import org.junit.Test;
import java.util.Iterator;
import java.util.Set;

/**
 * test generate IntegerRandom.
 *
 * @author inoob
 */
public class TestIntegerRandom {

    /**
     * test generate.
     */
    @Test
    public void testGenerate(){
        IntegerRandom random = new IntegerRandom();
        Set<Integer> rnd = random.generateRandom(1000,200);

        Integer[] array = rnd.stream().toArray(Integer[]::new);

        Algorithms algorithms = new Algorithms();
        boolean flag = algorithms.containsDuplicatesInteger(array);

        System.out.println("has duplicates? : " + flag);

        Iterator<Integer> iterator = rnd.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().intValue());
        }
    }
}
