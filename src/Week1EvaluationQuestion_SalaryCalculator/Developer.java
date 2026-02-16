package Week1EvaluationQuestion_SalaryCalculator;

public class Developer extends Employee{


    int overTimeHours;

    public Developer(double baseSalary, int overTimeHours, int attendedDays, int rating) {
        super(baseSalary,attendedDays,rating);
        this.overTimeHours = overTimeHours;
    }



    double getNetSalary() {
        double  gross = baseSalary + (overTimeHours * 500); // calculating the gross
        double attendanceDeduction = getAttendanceInduction(); // to get the tax cut
        double performanceBasedBonus = gross * ((double) rating / 100); // to calculate the performanceBasedBonus
        double PFDeduction = gross * PF; // to calculate PF
        double taxable = getTax(gross,performanceBasedBonus);
        return gross + performanceBasedBonus - taxable - PFDeduction - attendanceDeduction;
    }
}
