import java.util.Scanner;
class Armstrong{
    public static void main(String[]args){
        Scanner kar = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= kar.nextInt();

        int sum=0;
        int temp=num;
        int numberofdigs =String.valueOf(num).length();

        while (temp != 0){
            int digit =temp %10;
            sum+= Math.pow(digit,numberofdigs);
            temp/=10;
        }
        if(sum==num){
            System.out.println("Armstrong number...");
        }else{
            System.out.println("Not an Armstrong number...");
        }
        kar.close();
    }
}