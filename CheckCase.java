class CheckCase {
    public static void main(String[] args) {

        char inputChar = args[0].charAt(0);

        if (Character.isLetter(inputChar)) {
            if (Character.isUpperCase(inputChar)) {
                System.out.println("The character is an uppercase alphabet.");
            } else {
                System.out.println("The character is a lowercase alphabet.");
            }
        } else {
            System.out.println("The character is not an alphabet.");
        }
    }
}
