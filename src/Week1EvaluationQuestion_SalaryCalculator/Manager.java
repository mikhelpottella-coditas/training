package Week1EvaluationQuestion_SalaryCalculator;

public class Manager extends Employee{


    int teamSize;

    public Manager(double baseSalary, int teamSize, int attendedDays, int rating) {
        super(baseSalary,attendedDays,rating);
        this.teamSize = teamSize;
    }



    double getNetSalary() {
        double  gross = baseSalary + (teamSize * 1000); // calculating the gross
        double attendanceDeduction = getAttendanceInduction();// to calculate the attendance induction.
        double performanceBasedBonus = gross * ((double) rating / 100); // to calculate the performanceBasedBonus
        double PFDeduction = gross * PF;// to calculate PF
        double taxable = getTax(gross,performanceBasedBonus);
        { // to print the salary breakDown
            System.out.printf("%-30s : %12.2f%n", "Gross Amount", gross);
            System.out.printf("%-30s : %12.2f%n", "Performance Based Bonus", performanceBasedBonus);
            System.out.printf("%-30s : %12.2f%n", "Tax Deduction", taxable);
            System.out.printf("%-30s : %12.2f%n", "PF Deduction", PFDeduction);
            System.out.printf("%-30s : %12.2f%n", "Attendance Deduction", attendanceDeduction);
            System.out.println("*".repeat(60));
        }
        return gross + performanceBasedBonus - taxable - PFDeduction - attendanceDeduction;
    }
}
