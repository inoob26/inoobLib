package com.inoobLib.Algorithm;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Stream;

import static java.lang.Math.sqrt;

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
                    if (array[i] == array[j]) {
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
    public final int gcdEvclide(final int a, final int b) {
        int num1 = a;
        int num2 = b;
        while (b != 0) {
            int remainder = a % b;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }


    //O(N)

    /**
     * Raise number to power.
     * speed O(N).
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

    /**
     * Looking simple multipliers.
     *  speed O(n).
     * @param number number.
     * @return list of multipliers.
     */
    public final Set<Integer> findFactors(final int number) {
        Set<Integer> list = new HashSet<>();

        int num = number;

        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                list.add(i);

                num = num / i;
            }
        }

        if (num > 1) {
            list.add(num);
        }

        return list;
    }

    /**
     * Looking simple multipliers.
     *  speed O(sqrt(n)).
     * @param number number.
     * @return list of multipliers.
     */
    public final Set<Integer> findFactorsSqrtN(final int number) {
        Set<Integer> list = new HashSet<>();
        int num = number;
        int max = (int) sqrt(num);
        if (num % 2 == 0) {
            list.add(2);
        }

        final int three = 3;
        for (int i = three; i <= max; i += 2) {
            while (num % i == 0) {
                list.add(i);
                num = num / i;
                max = (int) sqrt(num);
            }
        }

        if (num > 1) {
            list.add(num);
        }

        return list;
    }

    /**
     * Getting string array and change sequence of item.
     *
     * @param array of characters.
     * @return random array.
     */
    public final String[] randomizeArray(final String[] array) {
        String[] arr = array;
        Random rnd = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            int j = rnd.nextInt(arr.length);
            arr[i] = arr[j];
        }
        return arr;
    }

    /**
     * Recursive factorial.
     *
     * @param x number.
     * @return factorial of number.
     */
    public final int factorialRecursive(final int x) {
        if (x == 1) {
            return x;
        }
        int num = x;
        return num * factorial(num - 1);
    }

    /**
     * Simple computing factorial.
     *
     * @param x number.
     * @return factorial.
     */
    public final int factorial(final int x) {
        if (x == 1) {
            return x;
        } else {
            int factorial = 1;
            for (int i = 1; i <= x; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    /**
     * reverse string.
     *
     * @param arr string.
     * @return reverse char array;
     */
    public final char[] reverse(final String arr) {
        char[] str = arr.toCharArray();
        char[] reverse = new char[arr.length()];

        int j = 0;
        for (int i = arr.length() - 1; i >= 0; i--) {
            reverse[j] = str[i];
        }

        return reverse;
    }

    /**
     * Reverse elements of array.
     *
     * @param array of numbers.
     * @return reverse array.
     */
    public final int[] reverseArrayElements(final int[] array) {
        int[] arr = array;
        int n = Integer.valueOf(array.length);
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return arr;
    }

    /**
     * binary search elements.
     *
     * @param key looking number.
     * @param array of numbers.
     * @return looking number or closely element.
     */
    public final int binarySearch(final int key, final int[] array) {
        int lower = Integer.valueOf(0);
        int high = Integer.valueOf(array.length - 1);
        int middle = Integer.valueOf(0);
        int count = Integer.valueOf(0);

        while (lower <= high) {
            middle = lower + (high - lower) / 2;
            count++;
            if (key > middle) {
                lower = middle + 1;
            } else if (key < middle) {
                high = middle - 1;
            } else {
                System.out.println(count);
                return middle;
            }
        }
        return -1;
    }

    /**
     * Selection sort.
     *
     * @param count length of array.
     * @param array of numbers.
     * @return sorted array.
     */
    public final int[] selectionSort(final int count, final int[] array) {
        int n = count;
        int[] arr = array;
        int minimumIndex;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            minimumIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    minimumIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
        return arr;
    }
}
