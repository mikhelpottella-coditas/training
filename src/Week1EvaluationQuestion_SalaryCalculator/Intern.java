package Week1EvaluationQuestion_SalaryCalculator;

public class Intern extends Employee{


    public Intern(double baseSalary, int attendedDays, int rating) {
        super(baseSalary,attendedDays,rating);
    }



    double getNetSalary() {
        double gross;
        if(attendedDays<16) gross = baseSalary - (baseSalary*0.2); //  calculating the gross
        else gross = baseSalary;

        double attendanceDeduction = getAttendanceInduction(); // to calculate the attendance induction.
        double performanceBasedBonus = gross * ((double) rating / 100); // to calculate the performanceBasedBonus
        double PFDeduction = gross * PF;  // to calculate PF
        double taxable = getTax(gross,performanceBasedBonus);

        print(gross,performanceBasedBonus,taxable,PFDeduction,attendanceDeduction);

        return gross + (performanceBasedBonus - taxable - PFDeduction - attendanceDeduction);
    }
}



