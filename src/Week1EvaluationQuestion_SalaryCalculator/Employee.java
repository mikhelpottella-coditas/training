package Week1EvaluationQuestion_SalaryCalculator;

public abstract class Employee {
    double baseSalary;
    int attendedDays;
    int rating;
    final float PF = 0.12f;

    public Employee(double baseSalary, int attendedDays, int rating) {
        this.baseSalary = baseSalary;
        this.attendedDays = attendedDays;
        this.rating = rating;
    }

    double getTax(double gross, double performanceBasedBonus) { // to calculate the tax
        double total = gross + performanceBasedBonus;
        double taxable=0;
        if (total > 150000) taxable = (total * 0.20);
        else if (total < 150000 && total > 100001) taxable = (total * 0.15);
        else if (total < 100000 && total > 50001) taxable = (total * 0.10);
        else if (total <= 50000) taxable = (total * 0.05);
        return taxable;
    }

    void print(double gross,double performanceBasedBonus,double taxable,double PFDeduction,double attendanceDeduction){ // to print the salary breakDown
        System.out.printf("%-30s : %12.2f%n", "Gross Amount", gross);
        System.out.printf("%-30s : %12.2f%n", "Performance Based Bonus", performanceBasedBonus);
        System.out.printf("%-30s : %12.2f%n", "Tax Deduction", taxable);
        System.out.printf("%-30s : %12.2f%n", "PF Deduction", PFDeduction);
        System.out.printf("%-30s : %12.2f%n", "Attendance Deduction", attendanceDeduction);
        System.out.println("*".repeat(60));
    }

    double getAttendanceInduction(){ // to calculate the attendance induction.
        double dailySalary = (double) baseSalary / 22;
        int absentDays = 22 - attendedDays;
        return dailySalary * absentDays;
    }
    abstract double getNetSalary(); // must be implemented by all the subclasses
}
