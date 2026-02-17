package Week1EvaluationQuestion_SalaryCalculator;

public class Developer extends Employee{


    int overTimeHours;

    public Developer(double baseSalary, int overTimeHours, int attendedDays, int rating) {
        super(baseSalary,attendedDays,rating);
    }



    double getNetSalary() {
        double  gross = baseSalary + (overTimeHours * 500); // calculating the gross
        double attendanceDeduction = getAttendanceInduction(); // to get the tax cut
        int ratingPercent = (rating>1) ?(rating-1)*5: 0;
        double performanceBasedBonus = gross * ((double) ratingPercent / 100); // to calculate the performanceBasedBonus
        double PFDeduction = gross * PF; // to calculate PF
        double taxable = getTax(gross,performanceBasedBonus);

        print(gross,performanceBasedBonus,taxable,PFDeduction,attendanceDeduction);
        return gross + performanceBasedBonus - taxable - PFDeduction - attendanceDeduction;
    }
}
