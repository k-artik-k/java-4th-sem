class Weekno {
    public static void main(String[] args) {
        System.out.println("Enter numbers (1-7):");
        int num = Integer.parseInt(args[0]);

        switch(num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter number between 1 and 7.");
        }
    }
}
