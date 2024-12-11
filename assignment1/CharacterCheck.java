class CharacterCheck {
    public static void main(String[] args) {
        
        char inputChar = args[0].charAt(0);

    
        if (Character.isLetter(inputChar)) {
            System.out.println("The character is an alphabet.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }
    }
}
