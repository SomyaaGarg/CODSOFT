package org.example;
    import java.util.Scanner;

    public class GradeCalculator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("===== STUDENT GRADE CALCULATOR =====");

            System.out.print("Enter Number of Subjects: ");
            int subjects = sc.nextInt();

            int totalMarks = 0;

            for (int i = 1; i <= subjects; i++) {

                int marks;

                while (true) {
                    System.out.print("Enter Marks for Subject " + i + " (0-100): ");
                    marks = sc.nextInt();

                    if (marks >= 0 && marks <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid Marks! Please enter between 0 and 100.");
                    }
                }

                totalMarks += marks;
            }

            double percentage = (double) totalMarks / subjects;

            String grade;
            String remark;

            if (percentage >= 90) {
                grade = "A+";
                remark = "Outstanding";
            }
            else if (percentage >= 80) {
                grade = "A";
                remark = "Excellent";
            }
            else if (percentage >= 70) {
                grade = "B";
                remark = "Very Good";
            }
            else if (percentage >= 60) {
                grade = "C";
                remark = "Good";
            }
            else if (percentage >= 50) {
                grade = "D";
                remark = "Average";
            }
            else {
                grade = "F";
                remark = "Fail";
            }

            System.out.println("\n===== RESULT =====");
            System.out.println("Total Marks      : " + totalMarks);
            System.out.println("Percentage       : " + String.format("%.2f", percentage) + "%");
            System.out.println("Grade            : " + grade);
            System.out.println("Performance      : " + remark);

            sc.close();
        }
    }

