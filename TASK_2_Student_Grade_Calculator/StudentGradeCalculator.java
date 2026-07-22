import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("======================================");

        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            int marks;

            while (true) {

                System.out.print("Enter marks for Subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                }

                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / subjects;

        char grade;

        if (averagePercentage >= 90)
            grade = 'A';
        else if (averagePercentage >= 80)
            grade = 'B';
        else if (averagePercentage >= 70)
            grade = 'C';
        else if (averagePercentage >= 60)
            grade = 'D';
        else if (averagePercentage >= 50)
            grade = 'E';
        else
            grade = 'F';

        System.out.println("\n============= RESULT =============");

        System.out.println("Total Marks       : " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade             : " + grade);

        switch (grade) {

            case 'A':
                System.out.println("Excellent Performance!");
                break;

            case 'B':
                System.out.println("Very Good!");
                break;

            case 'C':
                System.out.println("Good Job!");
                break;

            case 'D':
                System.out.println("Needs Improvement.");
                break;

            case 'E':
                System.out.println("Work Hard.");
                break;

            default:
                System.out.println("Better Luck Next Time.");
        }

        sc.close();
    }
}