// STUDENT GRADE CALCULATOR
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        String grade;
        System.out.println("Enter the marks of 5 each subject");
        for (int i = 0; i < 5; i++) {
            int marks = sc.nextInt();
            total = total + marks;
        }
        double avg = (double) total / 5;
        if (avg >= 90)
            grade = "A+";
        else if (avg >= 80)
            grade = "A";
        else if (avg >= 65)
            grade = "B";
        else if (avg >= 50)
            grade = "C";
        else if (avg >= 33)
            grade = "D";
        else
            grade = "F";
        System.out.println("Total marks: " + total);
        System.out.println("Averaage Percentage: " + avg);
        System.out.println("Grade: " + grade);
    }
}


