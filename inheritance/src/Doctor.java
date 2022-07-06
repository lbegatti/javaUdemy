public class Doctor extends Staff {

    private long doctorId;
    private String specialization;

    // doctorId
    public long getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    // specialization
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(long id) {
        this.specialization = specialization;
    }


    /*
    public static void main(String[] args) {
        System.out.println("Staff id for the doctor: " + staffId);
        System.out.println("Doctor's experience: " + yearsOfExperience);
        System.out.println("Doctor's Description: " + description);
        System.out.println("Doctor's salary: " + salary);

        //
        System.out.println("Doctor's first Name: " + firstName);


    }
     */
}
