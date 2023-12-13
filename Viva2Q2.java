package viva2;
import java.util.Scanner;
public class Viva2Q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        // Get input from user about the size of array 1
        System.out.print("Enter size of Array 1 : ");
        int size1 = sc.nextInt();
        
        double[] arr1 = new double[size1];      // Declare array 1
   
        System.out.println("Enter " + size1 + " elements : ");      // Get input from user to create array 1
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.print("Enter size of Array 2 : ");       // Get input from user about the size of array 2
        int size2 = sc.nextInt();
        
        double[] arr2 = new double[size2];      // Declare array 2
        
        System.out.println("Enter " + size2 + " elements : ");      // Get input from user to create array 2
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextDouble();
        }

        System.out.println("");
        
        System.out.print("Array 1 : { ");       // Print out array 1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");      
        
        System.out.print("Array 2 : { ");       // Print out array 2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
        System.out.println();
        
        double[] combineArr = joinArrays(arr1, arr2);       // joinArrays() method to combine the two arrays       
        double[] ascendingArr = ascending(combineArr);      // ascending() method to sort the array in ascending order
        double median = findMedian(ascendingArr);       // findMedian() method to find the median        
        
        System.out.printf("Median of Arrays : %.3f", median);       // Print out the median with 3 decimal places
        System.out.println();
        
    }
    
    public static double[] joinArrays(double[] arr1, double[] arr2) {       // joinArrays() method to combine the two arrays

        int size1 = arr1.length;
        int size2 = arr2.length;   
        double[] combineArr = new double[size1 + size2];        // create combined array with the new size
         
        for (int i = 0; i < size1; i++) {       // add array 1 elements 
            combineArr[i] = arr1[i];
        }
      
        for (int j = 0; j < size2; j++) {       // add array 2 elements
            combineArr[size1 + j] = arr2[j];
        }
        return combineArr;
    }
    
    public static double[] ascending(double[] ascendingArr) {       // ascending() method to sort the array in ascending order
       
        for (int pass = 0; pass < ascendingArr.length - 1; pass++) {        // Sort the array in ascending order using Bubble Sort
            for (int i = 0; i < ascendingArr.length - 1 - pass; i++) {
                if (ascendingArr[i] > ascendingArr[i + 1]) {
                    double hold = ascendingArr[i];
                    ascendingArr[i] = ascendingArr[i + 1];
                    ascendingArr[i + 1] = hold;
                }
            }
        }
        return ascendingArr;
    }
   
    public static double findMedian(double[] median) {      // findMedian() method to find the median

        int middle = median.length / 2;       
        if (median.length % 2 == 0) {       // When the size of array is even, sum up the middle two value and then divide by 2
            return (median[middle - 1] + median[middle]) / 2;
        } 
        else {                              // When size of array is odd, middle element is the median
            return median[middle];
        }
    }
}

