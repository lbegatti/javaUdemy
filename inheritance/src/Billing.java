import java.util.Arrays;

public class Billing {

    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        if (patientInsurancePlan == null) {
            payments[0] = 0;
            payments[1] = amount - 20;

        } else {
            // your logic
            double coveredCost = amount * patientInsurancePlan.getCoverage();
            double remainder = amount - coveredCost;
            payments[0] = coveredCost;

            if (patientInsurancePlan instanceof PlatinumPlan){
                payments[1] = remainder - 50;
            } else if (patientInsurancePlan instanceof GoldPlan){
                payments[1] = remainder - 40;
            } else if (patientInsurancePlan instanceof SilverPlan){
                payments[1] = remainder - 30;
            } else if (patientInsurancePlan instanceof BronzePlan){
                payments[1] = remainder - 25;
            } else {
                payments[1] = amount - 20;
            }

        }
        return payments;


    }

    public static void main(String[] args) {
        //HealthInsurancePlan insurancePlan = new PlatinumPlan();
        //Patient patient = new Patient();
        //patient.setInsurancePlan(insurancePlan);

        //Staff staff = new Staff();
        //staff.setInsurancePlan(insurancePlan);
        //staff.setSalary(8000);

        User staff = new User();
        InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
        HealthInsurancePlan insurancePlan = new SilverPlan();

        insurancePlan.setOfferedBy(insuranceBrand);
        staff.setInsurancePlan(insurancePlan);


        //double[] payments = Billing.computePaymentAmount(patient,1000.0);

        //System.out.println("Final payment: " + Arrays.toString(payments));
        System.out.println("User premium is: " + insurancePlan.computeMonthlyPremium(8000,40,true));
    }

}