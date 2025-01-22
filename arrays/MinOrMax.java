import java.util.*;
public class MinOrMax{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0 ;i<n;i++){
            a[i] = scanner.nextInt();
        }
   
        int max = a[0];
        int min = a[1];

        for(int i = 1;i < a.length;i++){
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];    
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);

        scanner.close();
    }
}