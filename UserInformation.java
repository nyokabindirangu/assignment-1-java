//this program is used to get users surname and current age and also calculate the number of characters in their surname, and also determine if their age is even or odd 

import java.util.Scanner;

public class UserInformation{
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.print("Please enter your surname: ");
   String surname = scanner.nextLine();

   System.out.print("Please enter your current age: ");
   int age = scanner.nextInt();

   int surnameLength = surname.length();

   String ageEvenOdd = (age % 2 == 0) ? "even" : "odd";
   
   System.out.println("the number of characters in your surname is: " + surnameLength);
   System.out.println("Your current age is an " + ageEvenOdd +" number.");

}
}