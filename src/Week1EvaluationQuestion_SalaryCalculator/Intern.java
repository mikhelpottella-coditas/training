package Week1EvaluationQuestion_SalaryCalculator;

public class Intern extends Employee{


    public Intern(double baseSalary, int attendedDays, int rating) {
        super(baseSalary,attendedDays,rating);
    }



    double getNetSalary() {
        double gross;
        if(attendedDays<16) gross = baseSalary - (baseSalary*0.2);
        else gross = baseSalary;
        // to calculate the attendance induction.
        double dailySalary = (double) baseSalary / 22;
        int absentDays = 22 - attendedDays;
        double attendanceDeduction = dailySalary * absentDays;
        // to calculate the performanceBasedBonus
        double performanceBasedBonus = gross * ((double) rating / 100);
        System.out.println(performanceBasedBonus+"perform");
        // to calculate PF
        double PFDeduction = gross * PF;
        double taxable = getTax(gross,performanceBasedBonus);
//        System.out.println(gross+" gross");
//        System.out.println(performanceBasedBonus+"performanceBasedBonus");
//        System.out.println(taxable+" tax");
//        System.out.println(PFDeduction+" pf");
//        System.out.println(attendanceDeduction+" attendance");
        return gross + (performanceBasedBonus - taxable - PFDeduction - attendanceDeduction);
    }
}
