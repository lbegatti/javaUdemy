public class BlueCrossBlueShield extends HealthInsurancePlan implements InsuranceBrand {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
        int premium = 0;

        if (insurancePlan instanceof PlatinumPlan) {
            if (age > 55 & !smoking) {
                return premium + 200;
            } else if (age > 55 & smoking) {
                return premium + 300;
            } else if (age < 55 & smoking) {
                return premium + 100;
            } else {
                return premium;
            }
        } else if (insurancePlan instanceof GoldPlan) {
            if (age > 55 & !smoking) {
                return premium + 150;
            } else if (age > 55 & smoking) {
                return premium + 240;
            } else if (age < 55 & smoking) {
                return premium + 90;
            } else {
                return premium;
            }
        } else if (insurancePlan instanceof SilverPlan) {
            if (age > 55 & !smoking) {
                return premium + 100;
            } else if (age > 55 & smoking) {
                return premium + 180;
            } else if (age < 55 & smoking) {
                return premium + 80;
            } else {
                return premium;
            }
        } else if (insurancePlan instanceof BronzePlan) {
            if (age > 55 & !smoking) {
                return premium + 50;
            } else if (age > 55 & smoking) {
                return premium + 120;
            } else if (age < 55 & smoking) {
                return premium + 70;
            } else {
                return premium;
            }
        }

        return premium;
    }

    @Override
    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return 0;
    }
}
