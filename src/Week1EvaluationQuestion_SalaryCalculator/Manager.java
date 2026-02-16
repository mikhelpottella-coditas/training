package Week1EvaluationQuestion_SalaryCalculator;

public class Manager extends Employee{


    int teamSize;

    public Manager(double baseSalary, int teamSize, int attendedDays, int rating) {
        super(baseSalary,attendedDays,rating);
        this.teamSize = teamSize;
    }



    double getNetSalary() {
        double  gross = baseSalary + (teamSize * 1000);
        // to calculate the attendance induction.
        double dailySalary = (double) baseSalary / 22;
        int absentDays = 22 - attendedDays;
        double attendanceDeduction = dailySalary * absentDays;
        // to calculate the performanceBasedBonus
        double performanceBasedBonus = gross * ((double) rating / 100);
        // to calculate PF
        double PFDeduction = gross * PF;
        double taxable = getTax(gross,performanceBasedBonus);
//        System.out.println(gross+" gross");
//        System.out.println(performanceBasedBonus+"performanceBasedBonus");
//        System.out.println(taxable+" tax");
//        System.out.println(PFDeduction+" pf");
//        System.out.println(attendanceDeduction+" attendance");
        return gross + performanceBasedBonus - taxable - PFDeduction - attendanceDeduction;
    }
}
