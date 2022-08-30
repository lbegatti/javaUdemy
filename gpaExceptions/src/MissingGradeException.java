public class MissingGradeException extends Exception {
    private int studentID;

    public int getStudentId() {
        return studentID;
    }

    public MissingGradeException(int studentID) {
        this.studentID = studentID;
    }
}

