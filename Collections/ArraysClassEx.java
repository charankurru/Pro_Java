package java_progs.Collections;

import java.util.*;

public class ArraysClassEx {

    public static void Display(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Array of type INTEGER class.
        Integer numbers[] = new Integer[] { 5, 6, 1, 2, 3, 4 };
        // Character chararray[] = new Character[] { 'a', 'b', 'c', 'd', 'e', 'f' };

        // Converting integer array to list
        List<Integer> l1 = Arrays.asList(numbers);
        System.out.println(l1);

        // Sorting the array using Arays.sort method
        Arrays.sort(numbers);
        Display(numbers);

        // ____________________________________________________
        // B.S with char array | Arrays.binarySearch(char[], char key)
        // B.S with string array | Arrays.binarySearch(String[], string key)
        // B.S with Float array | Arrays.binarySearch(float[], float key)
        // B.S with Double array | Arrays.binarySearch(float[], float key)

        // Applying binary Search method over array
        int key = 6;
        System.out.println("Key's index is found at " + Arrays.binarySearch(numbers, key));

        // Applying binary Search method over an range(fromIdx, toIdx)
        int key2 = 4;
        System.out.println("Key's index is found at " + Arrays.binarySearch(numbers, 1, 3, key2));

        // Comparing two arrays
        Integer arr1[] = new Integer[] { 99, 33, 11, 25 };
        Integer arr2[] = new Integer[] { 88, 44 };
        System.out.println("Integer arrays on comparision" + Arrays.compare(arr1, arr2));

        // CopyOf method to fill the array or trim the array over specified lenght
        Integer arr3[] = Arrays.copyOf(arr1, 2);
        System.out.print("After copying elements from arr1 to arr3 ");
        Display(arr3);

        // CopyOfRange used to clone array over a specified range
        // Arrays.copyOfRange(array,fromIdx, toIdx);

        // Equals ==> checks whether two 1-d arrays are equal or not and return boolean
        // value
        boolean eq = Arrays.equals(arr1, arr2);
        System.out.println(eq);

        // DeepEquals ==> Checks both 1d-array and 2d-array whether they are equal or
        // not
        System.out.println(Arrays.deepEquals(arr1, arr2));

        // fill used to fill array with specified values
        Arrays.fill(arr1, 9999);
        System.out.print("array 1 after filling with 9999 is ");
        Display(arr1);

        // Fillrange is used to fill array with specified values over a range
        Arrays.fill(arr1, 2, 4, 55);
        Display(arr1);

        // HashCode used to return hashcode of the object
        System.out.println("Hashcode of the arr1 is " + Arrays.hashCode(arr1));

        // Sorting the array
        Arrays.sort(arr1);
        System.out.println("Array 1 after sorted is ");
        Display(arr1);

        // toString This method returns a string representation of the contents of the
        // specified array.
        System.out.println("String representation of array 1 is " + Arrays.toString(arr1));

    }

}
