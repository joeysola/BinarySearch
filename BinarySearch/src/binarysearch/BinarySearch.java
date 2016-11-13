/*
 * Name: Joey Solak
 * Date: 11/12/16
 * Class: CIT-130
 * Purpose Of The File: Implement a templated binary search.
 */
package binarysearch;

/**
 *
 * @author Joey Solak
 * Used Display 11.6 from the Absolute Java book as a starting point.
 */
public class BinarySearch {

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> int Bsearch(T[] a, int first, int last, T key){
        
        int result;
        
        if (first > last){
            result = -1;
        }
        else{
            int mid = (first + last)/2;
            
            if (key.compareTo(a[mid]) == 0){
                result = mid;
            }
            else if(key.compareTo(a[mid]) < 0){
                result = Bsearch(a, first, mid - 1, key);
            }
             else if (key.compareTo(a[mid]) > 0){
                result = Bsearch(a, mid + 1, last, key);
            }
             else{
                System.out.println("Error");
                result = -1;
             }     
  
    }
        return result; 
    
 }

    
    public static void toString(String key, int result) {
     
        if(result == -1){
            System.out.println(key + " is not in the array.");
        } else {
            System.out.println(key + " is at index " + result);
        }
            
        
        
    }
    
    
    
}
