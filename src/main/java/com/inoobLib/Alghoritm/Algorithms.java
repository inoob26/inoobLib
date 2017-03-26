package com.inoobLib.Alghoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.sqrt;

/**
 * Created by inoob on 07/03/2017.
 */
public class Algorithms {
    /**
     * constructor.
     */
    public Algorithms() { }

    /**
     * This method find lagre element of array.
     *
     * @param array array of numbers.
     * @return large lement of array.
     */
    public final int findLargestElement(final int[] array) {
        int large = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > large) {
                large = array[i];
            }
        }

        return large;
    }

    /**
     * Method looking duplicates in the array.
     * if array have duplicate return true.
     * else return false.
     *
     * @param array of Integer values.
     * @return boolean true or false.
     */
    public final boolean containsDuplicatesInteger(final Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i].equals(array[j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Method looking duplicates in the array.
     * if array have duplicate return true.
     * else return false.
     *
     * @param array of int values.
     * @return true if it have another case return false.
     */
    public final boolean containsDuplicates(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j] ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Нахождение наибольшего общего делитиля по алгоритму Евклида
    //O(log(B))

    /**
     * Method looking GCD for a and b.
     *
     * @param a first number.
     * @param b second number.
     * @return gcd value.
     */
    public final int gcdEvclide( int a,  int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }


    //O(N)

    /**
     * Raise number to power.
     *
     * @param number number.
     * @param power power.
     * @return result value.
     */
    public final float raiseToPower(final float number, final int power) {
        float result =  1;
        for (int i = 1; i < power; i++) {
            result *=  number;
        }
        return result;
    }

    //Нахождение простых множителей O(n)

    /**
     * Looking simple multipliers.
     *  speed O(n).
     * @param number number.
     * @return list of multipliers.
     */
    public final List<Integer> findFactors(int number) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                list.add(i);

                number = number / i;
            }
        }

        if (number > 1) {
            list.add(number);
        }

        return list;
    }

    //Нахождение простых множителей O(sqrt(n))

    /**
     * Looking simple multipliers.
     *  speed O(sqrt(n)).
     * @param number number.
     * @return list of multipliers.
     */
    public final List<Integer> findFactorsSqrtN(int number) {
        List<Integer> list = new ArrayList<Integer>();

        while (number % 2 == 0) {
            list.add(2);
            number = number / 2;
        }
        int maxFactor = (int) sqrt(number);
        final int three = 3;
        for (int i = three; i <= maxFactor; i += 2) {
            while (number % 2 == 0){
                list.add(i);

                number = number / i;

                maxFactor = (int) sqrt(number);
            }
        }

        if (number > 1) {
            list.add(number);
        }

        return list;
    }

    /**
     * Getting string array and change sequence of item.
     *
     * @param array of characters.
     */
    public void randomizeArray(String[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length - 1; i++) {
            int j = rnd.nextInt(array.length);
            array[i] = array[j];
            System.out.print(array[i]);
        }

    }

    /**
     * Recursive factorial.
     *
     * @param x number.
     * @return factorial of number.
     */
    public int factorialRecursive(int x) {
        if(x == 1 ) return x;
        return x * factorial(x - 1);
    }

    /**
     * Simple computing factorial.
     *
     * @param x number.
     * @return factorial.
     */
    public int factorial(final int x) {
        if(x == 1 ) {
            return x;
        } else {
            int factorial = 1;
            for (int i = 1; i <=x ; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    /**
     * reverse string.
     *
     * @param arr string.
     */
    public void reverse(String arr) {
        final char[] str = arr.toCharArray();

        for (int i = arr.length()-1; i >= 0; i-- ) {
            System.out.print(str[i]);
        }
    }

    //reverse the elements within an array

    /**
     * Reverse elemnts of array.
     *
     * @param array of numbers.
     * @return reverse array.
     */
    public int[] reverseArrayElements(int[] array){
        int N = Integer.valueOf(array.length);
        int temp = Integer.valueOf(0);;
        for (int i = 0; i < N/2; i++) {
            temp = array[i];
            array[i] = array[N-1-i];
            array[N-1-i] = temp;
        }
        return array;
    }

    //binary search

    /**
     * binary search elements.
     *
     * @param key looking number.
     * @param array of numbers.
     * @return looking number or closely element.
     */
    public int binarySearch(final int key,final int[] array) {
        int lower = Integer.valueOf(0);
        int high = Integer.valueOf(array.length - 1);
        int middle;
        int count = Integer.valueOf(0);

        while (lower <= high) {
            middle = lower + (high - lower) / 2;
            count++;
            if(key > middle) {
                lower = middle + 1;
            } else if(key < middle) {
                high = middle - 1;
            } else {
                System.out.println(count);
                return middle;
            }
        }
        return -1;
    }

    //selection sort

    /**
     * Selection sort.
     *
     * @param N length of array.
     * @param array of numbers.
     * @return sorted array.
     */
    public final int[] selectionSort(final int N, int[] array) {
        int minimum_index = Integer.valueOf(-1);
        int temp = Integer.valueOf(-1);
        for (int i = 0 ; i < N-1 ; i++) {
            minimum_index = i;
            for (int j = i+1 ; j < N ; j++) {
                if (array[i] > array[j]) {
                    minimum_index = j ;
                }
            }
            temp = array[i] ;
            array[i] = array[minimum_index] ;
            array[minimum_index] = temp ;
        }
        return array ;
    }
}
