class Floatsum {
    public static void main(String[] args) {
        // Ensure that two arguments are passed
        if (args.length < 2) {
            System.out.println("Please enter two decimal numbers.");
            return;
        }

        // Parse the input arguments as floating-point numbers
        float num = Float.parseFloat(args[0]);
        float num1 = Float.parseFloat(args[1]);

        // Round the numbers to 3 decimal places
        float roundedNum = Math.round(num * 1000) / 1000.0f;
        float roundedNum1 = Math.round(num1 * 1000) / 1000.0f;

        // Check if the rounded numbers are equal
        if (roundedNum == roundedNum1) {
            System.out.println("The numbers are equal up to 3 decimal places.");
        } else {
            System.out.println("The numbers are not equal up to 3 decimal places.");
        }
    }
}
