class NumNature {
    public static void main(String[]args){
        int num=Integer.parseInt(args[0]);
        if(num<0){
            System.out.println("The number is Negative");
        } else if (num>0){
            System.out.println("The number is Positive");
        } else {
            System.out.println("The number 0");
        }
    }
}
