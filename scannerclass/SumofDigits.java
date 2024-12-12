import java.util.Scanner;
class SumofDigits{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int digit,sum=0;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
        scanner.close();
    }
}