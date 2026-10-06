
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

         System.out.println("Student: " + studentName);

     }   
    
}
    
    
