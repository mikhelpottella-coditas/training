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
        return gross + performanceBasedBonus - taxable - PFDeduction - attendanceDeduction;
    }
}
