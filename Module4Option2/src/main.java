/*
    Program NameL Module 4 Critical Thinking Option 2
    Author: Nathan Curtis
    Date: (9/8/2024)
    -----------------------------------------------------
    PseudoCode:

    Add needed imports

    function main
        create a list
        create variables for average, min, and max
        use a for loop to loop 10 times
            ask for a persons grade each loop. Add into list.
        Use a for loop on the list
            Track smallest, largest, a total, and a average based on the total
        Print out average, min and max
*/

import java.util.ArrayList; // A;;pws array lists
import java.util.List; // Allows lists
import java.util.Scanner; // Allow user input
import java.text.DecimalFormat; // Allow decimal point for cash

public class main {
    public static void main(String[] args){ // Ignore error - has no string variable
        List<Float> gradeList = new ArrayList<Float>(); // Create array list
        float tempGrade, min = 0, max = 0, total = 0, average = 0; // define all float variables
        
        System.out.println("Gathering Grade Statistics");
        
        Scanner myInput = new Scanner(System.in); // Turns on scanner
        for (int i = 1; i <= 10; i++) { // Iterate 10 times
            System.out.println("Enter grade: "); // Asks for input
            
            tempGrade = myInput.nextFloat(); // Gets input
            gradeList.add(tempGrade); // Adds input into GradeList array
            
        }
        myInput.close(); // Closes scanner
        
        for (int i = 0; i < gradeList.size(); i++) { // Iterate 10 times
            total += gradeList.get(i); // Calculates the total of all the grades
            average = total / (i+1); // Takes the total and divides from the amount of grades entered
            if (gradeList.get(i) > max) { // Checks if a grade is greater than previous
                max = gradeList.get(i); // Adds grade to max varaibale
            }
            if (gradeList.get(i) < min || i == 0) { // Checks if grade is less than previous entered grades, or if this is the first number added
                min = gradeList.get(i); // Adds to min variable
            }
        }
        DecimalFormat df = new DecimalFormat("0.00"); // Formats 2 decimals for easy reading

        System.out.println("Here is some information about the grades:");
        System.out.println("The lowest value grade was: " + df.format(min)); // Min
        System.out.println("The highest value grade was: " + df.format(max)); // Max
        System.out.println("The average of the grades was: " + df.format(average)); // Average
    }
}
