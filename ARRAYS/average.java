package ARRAYS;

public class average {

    public static void main(String[] args) {
        
        int sum=0;
        int count =0;

        int [] arr ={-23 , -64 , -10 ,-64 ,-89 ,-5};

        for(int i=0 ; i<arr.length ; i++){

            if(arr[i]>0){

                sum = sum +arr[i];
                count++;
            }
        }

        if (count>0){
                double average = (double)sum /count;
                 System.out.println("the average is " + average);
        }
                 
        else{

            System.out.println("no positive numbers");
        }


           
        }
    }
    

