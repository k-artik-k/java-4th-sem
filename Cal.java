public class Cal {
    public static void main(String[]args){
        System.out.println("Enter 2 numbers: ");
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int res = 0;
        char op = args[1].charAt(0);
        boolean validOperation = true;
        switch(op){
            case '+':
                res = num0+num1;
                break;
            case '-':
                res = num0- num1;
                break;
            case '*':
               res = num0*num1;
               break;    
            case '/':  
               res = num0/ num1;
               break; 
            default:
               validOperation=false;   
            }           
            if (validOperation) {
                System.out.println("Result: " + res);
        }
    }
}
