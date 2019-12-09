/*
 * Binary Search to search an array of size 100 to find element T
 *
 * Author: Seth Schaller
 */
package binarysearch;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class BinarySearch {
    public static int binarySearch(int[] arr, int t) {
        //Variables; middle = middle of array, highest = last index of array
        //lowest = first index of array
        //Each variable changes after middle index is compared to t
        int middle, lowest = 0, highest = arr.length - 1;
        while (lowest <= highest){
            middle = (lowest + highest) / 2;
            if(arr[middle] > t) //Middle element greater then t
                highest = middle - 1;
            else if(arr[middle] < t)//Middle element less then t
                lowest = middle + 1;
            else
                return middle;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Binary Search");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        //Creates and fills array of size 100 with random integers
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(201);//Random integers 0-200
        Arrays.sort(arr);
        
        System.out.println("Enter a positive integer you would like to "
                + "search for: ");
        int t = input.nextInt();
        
        //Used for debugging
        //for(int j = 0; j < arr.length; j++)
        //    System.out.println(arr[j]);
        
        //Binary Search, returns -1 if element is not in array
        int index = binarySearch(arr, t);
        if(index == -1)
            System.out.println("Element not in array");
        else
            System.out.println("Found " + t + " at [" + index + "]");
    }
}
