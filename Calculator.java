class Calculator {
    public static void main(String[] args) {
      
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <num2> <operator>");
            return;
        }

        try {
           
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            char operation = args[2].charAt(0); 

            
            switch (operation) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers for num1 and num2.");
        }
    }
}
