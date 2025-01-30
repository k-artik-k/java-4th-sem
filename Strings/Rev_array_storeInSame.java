//import java.util.*;
public class Rev_array_storeInSame {
    public static void main(String[] args){
        String[] arr={"a","b","c","d","e"};
        System.out.println("Original Array");
        for(String item : arr){
            System.out.println(item +" ");
        }
        System.out.println();
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
         
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (String item : arr) 
            System.out.print(item + " ");
    }
}
