package SORTING;

public class insertionsort {

    public static void main(String[] args) {
        
        int [] array ={9,1,6,4,2,8,6};

        insertionsort(array);

        for(int i : array){

            System.out.print(i+" ");
        }
    }

    private static void insertionsort(int[] array) {
        

        for(int i=1 ; i<array.length; i++){

            int temp = array[i];

            int j=i-1;

            while(j >= 0 && array[j]>temp)
            {
                array[j+1] = array[j];
                j--;
              

            }
              array[j+1]=temp;
        }
    }


    
}
