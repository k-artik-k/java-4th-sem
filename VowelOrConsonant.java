public class VowelOrConsonant {
    public static void main(String[] args) {
       
        if (args.length != 1) {
            System.out.println("Usage: java VowelOrConsonant <character>");
            return;
        }

        char ch = args[0].charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            
            char upperCh = (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch;

            
            if (upperCh == 'A' || upperCh == 'E' || upperCh == 'I' || upperCh == 'O' || upperCh == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a valid alphabet character.");
        }
    }
}
