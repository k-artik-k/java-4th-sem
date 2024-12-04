class Max3 {
    public static void main(String[] args) {
        
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

          
            int max = num1;

            if (num2 > max) {
                max = num2;
            }

            if (num3 > max) {
                max = num3;
            }

          
            System.out.println("The maximum of the three numbers is: " + max);
    } 
}

