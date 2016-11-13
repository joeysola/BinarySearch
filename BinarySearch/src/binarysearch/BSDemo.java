/*
 * Name: Joey Solak
 * Date: 11/12/16
 * Class: CIT-130
 * Purpose Of The File: Test a templated binary search.
 */
package binarysearch;

import java.util.Arrays;

/**
 *
 * @author Joey Solak
 * Used Display 11.8 from Absolute Java book as a reference.
 */
public class BSDemo {
    
    public static void main(String[] args){
    
    //Intialize BinarySearch
    BinarySearch bs = new BinarySearch();
    
    //Set Variables and Arrays
    int key;
    int result;
    Integer[] a = {0, 1, 4, 5};
    String[] b = {"A", "AB", "ABC", "ABCD", "ABCDE", "ABCDEF"};
    
    //Test <Integer>
    System.out.print("Test <Integer> is:");
    System.out.println(Arrays.toString(a));
    
    //Use BinarySearch for <Integer>
    for(key = -2; key < 3; key++){
        result = bs.<Integer>Bsearch(a, 0, 4, key);
        bs.toString(Integer.toString(key), result);
    }
    
    //Test <String>
    System.out.print("\nTest <String> is:");
    System.out.println(Arrays.toString(b));
    
    //Display parts of the <String> Array using the BinarySearch
    result = bs.<String>Bsearch(b, 0, 10, "AB");
    bs.toString("AB", result);
    
    result = bs.<String>Bsearch(b, 0, 10, "ABC");
    bs.toString("ABC", result);
    
    result = bs.<String>Bsearch(b, 0, 10, "A");
    bs.toString("A", result);
    

    

}
}
