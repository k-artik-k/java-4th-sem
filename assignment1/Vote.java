class Vote{
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age =Integer.parseInt(args[0]);
        if (age>=18 && age <=120){
            System.out.println("Yes, eligible to vote.");
        } else {
            System.out.println("No, not eligible to vote");
        }
    }
}