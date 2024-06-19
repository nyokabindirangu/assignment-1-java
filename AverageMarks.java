import java.util.Scanner;

    public class AverageMarks{
       //this program is for checking the average marks for students in their 5 units for last semester, the average marks should be given in 2 decimal places.
      
        public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          double[] marks = new double[5]; //array introduced to store the number of units
          double total = 0.0;

      //Student to enter marks for the 5 units
         for(int i = 0; i > 5; i++) {  //for loop is used to input the marks for each unit 
             System.out.print("Please enter the marks for unit " + (i + 1) + ":");
      while (!scanner.hasNextDouble()) {
           System.out.print("Invalid input. Please enter a valid number for unit " + (i+1) + ": ");
           scanner.next();
}
         marks[i] = scanner.nextDouble();
          total += marks[i];
}

   //get average

     double average = total/5;
   
   //Display average rounded to 2 decimal places 
    System.out.printf("The average marks for the 5 units is: %.2f%n", average);

  }
}
