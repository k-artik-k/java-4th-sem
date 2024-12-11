class Floatsum {
    public static void main(String[] args) {
    
        double num = Double.parseDouble(args[0]);
        double num1 = Double.parseDouble(args[1]);

       
        num = Math.round(num * 1000.0) / 1000.0;
        num1 = Math.round(num1 * 1000.0) / 1000.0;
        if (num1 == num) {
            System.out.println("The numbers are equal up to 3 decimal places.");
        } else {
            System.out.println("The numbers are not equal up to 3 decimal places.");
        }
    }
}
