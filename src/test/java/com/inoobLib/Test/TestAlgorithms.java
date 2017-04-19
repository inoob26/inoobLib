package com.inoobLib.Test;

import com.inoobLib.Algorithm.Algorithms;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * test Algorithms.
 *
 * @author inoob
 */
public class TestAlgorithms {

    private Algorithms algorithms;

    @Test
    public void testFactorialRecursive(){
        assertEquals(120,algorithms.factorialRecursive(5));
    }

    @Test
    public void testFactorial(){
        assertEquals(120,algorithms.factorial(5));
    }

    @Test
    public void testReverseString(){
        algorithms.reverse("Hello World!!!");
    }

    @Test
    public void testFindLargestElement(){
        int[] array = {5,4,144,15,6,2,120};
        assertEquals(144,algorithms.findLargestElement(array));
    }

    @Test
    public void testContainsDuplicates(){
        int[] array = {5,5,4,144,15,6,2,120};
        assertTrue(algorithms.containsDuplicates(array));
    }

    @Test
    public void testRandomizeArray(){
        String[] array = {"a","b","c","d","y","z","p","w","u","g"};
        algorithms.randomizeArray(array);
    }

    @Test
    public void testGCDEvclide(){
        System.out.println(algorithms.gcdEvclide(4851,3003));
    }

    @Test
    public void testPower(){
        System.out.println(algorithms.raiseToPower(5,5));
    }

    @Test
    public void testFindFactors(){
        Set<Integer> list = algorithms.findFactors(1030);
        list.forEach( l -> System.out.println(l.intValue()) );
    }

    @Test
    public void testReverseArrayElements(){
        int[] array = {1,2,3,4,5,6,7};
        int[] result = algorithms.reverseArrayElements(array);
        for (int i : result){
            System.out.print(i + ",");
        }
    }

    @Test
    public void testBinarySearch(){
        int[] array = new int[100000001];
        for (int i = 1; i <= 100000000; i++) {
            array[i] = i;
        }

        assertEquals("BinarySearch return 12",145,algorithms.binarySearch(145,array));
    }

    @Test
    public void testSelectionSort(){
        int[] array = {7,3,4,2,5,1};
        int[] result = algorithms.selectionSort(array.length,array);

        for (int i : result){
            System.out.print(i + ",");
        }
    }

    @Test
    public void testFindSimpleDevision(){
        Set<Integer> list = algorithms.findFactorsSqrtN(126);
        list.forEach(l -> System.out.println(l.intValue()));
    }

    @Test
    public void testPolynomial(){
        System.out.println(algorithms.checkPolynomial("abba"));
    }

    @Before
    public void init(){
        algorithms = new Algorithms();
    }
}
