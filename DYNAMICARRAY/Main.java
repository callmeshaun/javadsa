package DYNAMICARRAY;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList <String> arrayList = new ArrayList<String>();

        arrayList.add("s");
        arrayList.add("a");
        arrayList.add("h");

        arrayList.add(2,"a");

        System.out.println(arrayList);
    }
    
}
