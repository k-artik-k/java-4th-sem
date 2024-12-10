public class PowerOfTwoCheck {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]); 
        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
}
