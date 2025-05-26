package LINEARSEARCH;

public class Main {

    public static void main(String[] args) {
        int [] arr ={75,35,2,485,24,89,42};

        int index = linearSearch(arr ,24);

        if(index !=-1){
            System.out.println("ele found at index :" +index);
        }

        else{
            System.out.println("Ele not found");
        }
    }

    private static int linearSearch(int [] arr , int value ){
        for(int i=0 ;i<arr.length ; i++){

            if(arr[i]==value){
                return i;
            }
        }

        return -1;
    }
    
}
