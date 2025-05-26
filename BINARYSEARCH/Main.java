package BINARYSEARCH;

import java.util.Arrays;

import String.reverse;

public class Main {

    public static void main(String[] args) {
        
        int arr[] = new int[100];
        int target = 42;

        for(int i=0 ; i< arr.length ; i++){

            arr[i]=i;
        }

        //int index = Arrays.binarySearch(arr,target);
        int index = binarySearch(arr,target);

        if(index ==-1){
            System.out.println(target + "not found");
        }

        else{
            System.out.println("ele found at " +index);
        }


    }

      private static int binarySearch(int arr[],int target){

            int low = 0;
            int high = arr.length-1;

            while (low<=high) {

                int middle = low + (high - low)/2;
                int value = arr[middle];

                System.out.println("middle" +value);

                if(value< target){
                    low = middle+1;
                }

               else if(value>target){
                high =middle -1;
               }

               else{
                return middle;
               }
                
            }
            return -1;
        }
    
}
