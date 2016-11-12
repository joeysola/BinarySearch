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
public class BinarySearch {

    public static <T extends Comparable> int search(T[] a, int first, int last, T key){
        
        int result = 0;
        
        if (first > last){
            result = -1;
        }
        else{
            int mid = (first + last)/2;
            
            if (key.compareTo(a[mid]) == 0){
                result = mid;
            }
            else if(key.compareTo(a[mid]) < 0){
                result = search(a, first, mid - 1, key);
            }
             else if (key.compareTo(a[mid]) > 0){
                result = search(a, mid + 1, last, key);
            
     
        }
                   
  
    }
        return result; 
    
 }
}
