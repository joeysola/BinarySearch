/*
 * Name: Joey Solak
 * Date:
 * Class: CIT-130
 * Purpose Of The File:
 */
package binarysearch;

/**
 *
 * @author Joey Solak
 */
public class BSDemo {
    
    public static void main(String[] args){
        
    
    int[] a = {-2, 0, 2, 4, 6, 8, 10, 12, 14, 16};
    int finalIndex = 9;
    
    System.out.println("Array contains");
    
    for (int i = 0; i < a.length; i++){
        System.out.print(a[i] + " ");
    }
    System.out.print("\n\n");
    
    int result;
    for (int key = -3; key < 5; key++){
        result = BinarySearch.search(a, 0, finalIndex, key);
        if (result >= 0){
            System.out.println(key + " is at index " + result);
        } else {
            System.out.println(key + " is not in the array.");
        }
    }
    
    for (int i = 0; i < a.length; i++){
        System.out.print(a[i] + " ");
    }
    
}
}
