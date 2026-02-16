package Week1EvaluationQuestion_SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("select the employee type \n\n 1.Developer  2.Manager  3.Intern   Exit:0");
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
                    System.out.printf("%-30s : %12.2f \n\n", "Net salary",developer.getNetSalary());
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
                    System.out.printf("%-30s : %12.2f \n\n", "Net salary",manager.getNetSalary());
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
                    System.out.printf("%-30s : %12.2f \n\n", "Net salary",intern.getNetSalary());
                    break;
                }
                default:
                    System.out.println("invalid employee type");
            }
        }
    }
}



/*

output:

select the employee type

 1.Developer  2.Manager  3.Intern   Exit:0
1
Enter the required data in the following Format
baseSalary overTimeHours attendedDays rating
50000 22 22 2

Gross Amount                   :     61000.00
Performance Based Bonus        :      1220.00
Tax Deduction                  :      6222.00
PF Deduction                   :      7320.00
Attendance Deduction           :         0.00
************************************************************
Net salary                     :     48678.00

* */