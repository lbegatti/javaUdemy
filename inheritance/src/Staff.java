public class Staff extends User {

    protected long staffId;
    int yearsOfExperience;
    protected String description;
    protected double salary;

    // staffId
    public long getStaffId() {
        return staffId;
    }
    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    // yearsOfExperience
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    // description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // salary
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


}
