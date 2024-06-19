// this program is used to help the user to perform basic operations(+,-,*,/) 


public class BasicCalculator {
   public static void main(String[] args) {

    if(args.length != 3) {
        
       System.out.println("Usage: java BasicCalculator <number1> <operation> <number2> ");
       return;
}
    //parse the input arguments 

    double num1 = Double.parseDouble(args[0]);
    String operation = args[1];
    double num2 = Double.parseDouble(args[2]);

    // declare variable to store result

    double result = 0;
   
    //perform the operation

    if (operation.equals("+")) {

      result = num1 + num2;
 }
   else if(operation.equals("-")) {
  
      result = num1 - num2;
   }
    else if(operation.equals("*")) {
       result = num1 * num2;
  }
    else if(operation.equals("/")) {
     if (num2 != 0) {

      result = num1 / num2;

 } else {

     System.out.println("Error: Division by zero is not allowed. ");
    
    return;
}
 else {
  
   System.out.println("Error: Invalid operation. ");
   
   return;
}

   System.out.println("The result is: " + result);.

  }
}