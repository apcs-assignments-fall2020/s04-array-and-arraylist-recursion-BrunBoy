import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        // YOUR CODE HERE
        return isSortedRec (list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (list.size()<=i+1){
            return true;
        }
        if (list.get(i)>list.get(i+1)){
            return false;
        }
        else{
            return isSortedRec(list, i+1);
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        // YOUR CODE HERE
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i, int countX) {
        // YOUR CODE HERE
       if (i==arr.length){
           return (count==countX);
       }
       if (arr[i]==x){
           return hasCountCopiesRec(arr, x, count, i+1, countX+1);
       }
       else{
           return hasCountCopiesRec(arr, x, count, i+1, countX);          
       }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // YOUR CODE HERE
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        // YOUR CODE HERE
        if (lowerBound==upperBound-1){
            return false; 
        }
        if (arr[(lowerBound+upperBound)/2]==num){
            return true;
        }
        if (arr[(lowerBound+upperBound)/2]<num){
            lowerBound=(lowerBound+upperBound)/2;
            return binarySearchRec(arr, num, lowerBound, upperBound);
        }
        else{
            upperBound=(lowerBound+upperBound)/2;
            return binarySearchRec(arr, num, lowerBound, upperBound);
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
