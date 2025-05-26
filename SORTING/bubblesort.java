package SORTING;

public class bubblesort {

public static void main(String[] args) {
    
    int arr[] = {9,5,2,6,2,1,3,10,7,4};

    bubblesort(arr);

    for(int i : arr){

        System.out.print(i+" ");
    }
}

    public static void bubblesort(int arr[]){

        for(int i=0 ; i<arr.length-1 ; i++){

            for(int j=0 ; j<arr.length-i-1 ; j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }



       

}
    
}
