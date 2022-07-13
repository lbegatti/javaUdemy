public class GoldPlan extends HealthInsurancePlan {
    public GoldPlan(){
        setCoverage(0.8);
    }

    @Override
    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return salary * 0.07 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
    }
}