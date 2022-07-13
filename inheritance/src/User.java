public class User {

    protected long id;
    private String firstName;
    private String lastName;
    String gender;
    String email;
    private boolean insured;
    private HealthInsurancePlan insurancePlan;
    private int age;
    private boolean smoking;
    // add rest of the variables

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    // add rest of the getters & setters

    // firstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // gender
    public String getGender(){
        return gender;
    }
    public  void setGender(String gender){
        this.gender = gender;
    }

    // email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // insured
    public boolean isInsured() {
        return insured;
    }
    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    // age
    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    // smoking
    public boolean isSmoking(){return smoking;}
    public void setSmoking(boolean smoking){this.smoking = smoking;}

    // HealthInsurancePlan
    public HealthInsurancePlan getInsurancePlan(){
        return insurancePlan;
    }
    public void setInsurancePlan(HealthInsurancePlan insurancePlan){
        this.insurancePlan = insurancePlan;
    }


}
