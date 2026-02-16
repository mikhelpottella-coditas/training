package Week1EvaluationQuestion_SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("select the employee type \n 1.Developer  2.Manager  3.Intern   Exit:0");
            int input = sc.nextInt();
            if (input == 0) break;
            switch (input) {
                case 1: {
                    System.out.println("Enter the required data in the following Format");
                    System.out.println("baseSalary overTimeHours attendedDays rating");
                    // lets handle input data
                    double baseSalary = sc.nextDouble();
                    int overTime = sc.nextInt();
                    int attendedDays = sc.nextInt();
                    int rating = sc.nextInt();

                    if (rating < 0 || rating > 5 ||attendedDays < 0 || attendedDays > 22 ||overTime < 0 || overTime > 200 ||baseSalary <= 0) {
                        System.out.println("invalid input data");
                        break;
                    }
                    // done with handling inputs

                    Developer developer = new Developer(baseSalary, overTime, attendedDays, rating);
                    System.out.printf("so the salary to be credited is : %f2 \n", developer.getNetSalary());
                    break;
                }
                case 2: {
                    System.out.println("Enter the required data in the following Format");
                    System.out.println("baseSalary teamSize attendedDays rating");

                    // lets handle input data
                    double baseSalary = sc.nextDouble();
                    int teamSize = sc.nextInt();
                    int attendedDays = sc.nextInt();
                    int rating = sc.nextInt();
                    if (rating < 0 || rating > 5 ||attendedDays < 0 || attendedDays > 22 ||teamSize < 0 || teamSize > 200 ||baseSalary <= 0) {
                        System.out.println("invalid input data");
                        break;
                    }
                    // done with handling inputs

                    Manager manager = new Manager(baseSalary, teamSize, attendedDays, rating);
                    System.out.printf("so the salary to be credited is : %f2 \n", manager.getNetSalary());
                    break;
                }
                case 3: {
                    System.out.println("Enter the required data in the following Format");
                    System.out.println("baseSalary attendedDays rating");
                    // lets handle input data
                    double baseSalary = sc.nextDouble();
                    int attendedDays = sc.nextInt();
                    int rating = sc.nextInt();
                    if (rating < 0 || rating > 5 ||attendedDays < 0 || attendedDays > 22 ||baseSalary <= 0) {
                        System.out.println("invalid input data");
                        break;
                    }
                    // done with handling inputs
                    Intern intern = new Intern(baseSalary, attendedDays, rating);
                    System.out.printf("so the salary to be credited is : %f2 \n", intern.getNetSalary());
                    break;
                }
                default:
                    System.out.println("invalid employee type");
            }
        }
    }
}
