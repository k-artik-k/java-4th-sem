import java.util.Scanner;
class Factorial{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        long factorial = 1;
        if(num<0){
            System.out.println("Not valid");
        } else{
            for(int i=1;i<=num;++i){
                factorial *=i;
            }
            System.out.println(factorial);
        }
        scanner.close();
    }
}