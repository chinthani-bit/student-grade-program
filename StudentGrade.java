
 import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Finnish score: ");
        double FinnishScore = scanner.nextDouble();

        System.out.print("Enter Operating Systems score: ");
        double OperatingSystemsScore = scanner.nextDouble();

        System.out.print("Enter Basic Programming score: ");
        double BasicProgrammingScore = scanner.nextDouble();
        double average = (FinnishScore + OperatingSystemsScore + BasicProgrammingScore) / 3;


         System.out.println("Student: " + studentName);
         System.out.println("Average Score: " + average);
        
         // Check whether the student passed
        if (average >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        if (average >= 90) {
            System.out.println("Grade: 5");
        } else if (average >= 80) {
            System.out.println("Grade: 4");
        } else if (average >= 70) {
            System.out.println("Grade: 3");
        } else if (average >= 60) {
            System.out.println("Grade: 2");
        } else if (average >= 50) {
            System.out.println("Grade: 1");
        } else {
            System.out.println("Grade: 0");
        }
     }   
    
}
    
    
