public class StringMethods {
    public static void main(String[] args){

        String s1 = "Hellooo";
        System.out.println("String1 is: " +s1);
        System.out.println("Length of string1 is: "+s1.length());
        System.out.println("Character at 0 is: "+s1.charAt(0));
        System.out.println("Index of l is: "+s1.indexOf(s1));
        System.out.println("Hellooo in all upper case:"+s1.toUpperCase());
        System.out.println("Hellooo in all lower case:"+s1.toLowerCase());

        String s2 = "       lekfj rhg wrhg irggihr     ";
        System.out.println("String s2 is: "+s2);
        System.out.println("string2 after trimming: "+s2.trim());

        String s3 = "hellooo";
        System.out.println("s1 equals s3 or not: "+s1.equals(s3));
        System.out.println("s1 equals s3 or not without case: "+s1.equalsIgnoreCase(s3));


        System.out.println("joined strings: "+s1.join())

    }
}
