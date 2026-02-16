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

    double getAttendanceInduction(){ // to calculate the attendance induction.
        double dailySalary = (double) baseSalary / 22;
        int absentDays = 22 - attendedDays;
        return dailySalary * absentDays;
    }
    abstract double getNetSalary(); // must be implemented by all the subclasses
}
