//this program is to help kids learn divisibility tests of numbers ranging from 0-9

public class DivisibilityTest {
    
    public static void main(String[] args) {
         int number = 955; 

       checkDivisibility(number);
}
   
    public static void checkDivisibility(int number) {
        if(number == 0) {
        
         System.out.println("The number " + number + "is divisible by all numbers in the range 1-9. ");
         return; // exit the method early since all further checks are redundant for zero
       }

        if(number % 1 == 0) {

         System.out.println("The number " + number + "is divisible by 1 because any number is divisible by 1. ");
       
       }

       if(number % 2 == 0) {
         System.out.println("The number " + number + "is divisible by 2 because it is even. ");
       }

       if(number % 3 == 0) {
        int sumOfDigits = 0;
        for(char digit : String.valueOf(number).toCharArray()) {
              sumOfDigits += Character.getNumericValue(digit);
       }
        
        System.out.println("The number is divisible by 3 because the sum of its digits(" + sumOfDigits + ") is divisible by 3. ");

     }

        if( number % 4 == 0) {
        int lastTwoDigits = Integer.parseInt(String.valueOf(number).substring(Math.max(0, String.valueOf(number).length() - 2)));

     System.out.println("The number " + number + " is divisible by 4 because the last two digits("+ lastTwoDigits + ") are divisible by 4. ");

   }

       if(number % 5 == 0) {

       char lastDigit = String.valueOf(number).charAt(String.valueOf(number).length() - 1);
       if(lastDigit == '0' || lastDigit == '5') {

      System.out.println("The number " + number +" is divisible by 5 because it ends with a " + lastDigit + ".");

  }
}

     if(number % 6 == 0) {
        if(n % 2 == 0 && n % 3 ==0) {

         System.out.println("The number" + number +" is divisible by 6 because it is divisible by both 2 and 3. ");
   }
}

     if(number % 7 == 0) {
      
      System.out.println("The number " + number +" is divisible by 7 because it follows the divisibility test for 7. ");

   }

    if(number % 8 == 0) {
        int lastThreeDigits =Integer.parseInt(String.valueOf(number).substring(Math.max(0, String.valueOf(number).length() - 3)));
    
    System.out.println("The number " + number + " is divisible by 8 because the last three digits ("+ lastThreeDigits + ") are divisible by 8. ");

   }
 
    if(number % 9 == 0) {
   
       int sumOfDigits = 0;

        for(char digit : String.valueOf(number).toCharArray()) {
              sumOfDigits += Character.getNumericValue(digit);
      }

      if(sumOfDigits % 9 == 0) {

        System.out.println("The number is divisible by 9 because the sum of its digits(" +sumofDigits + ") is divisible by 9. ");

    }
}
}
} 

 }



        

       