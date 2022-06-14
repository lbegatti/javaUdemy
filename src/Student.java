import java.math.BigDecimal;

public class Student {
    static int computeCount; // Instance & Static variable -- > "global variable" for each instance of the Student class. so 1 for John and 2 for Pia
    int id; // Instance variable -->  values are unique to object, so Student1 has id = 1000 and Student2 id = 1002
            // these values are assigned and unique, so it is not like the ComputeCount above with "static" that changes at every call of the class Student.
    String name;
    String gender;
    byte age;
    long phone;
    float gpa; // you need the f at the end otherwise it is a double
    double gpa_avg = 3.39;
    double diff = gpa - gpa_avg;
    BigDecimal gpa2 = new BigDecimal("3.38");
    BigDecimal gpa_avg2 = new BigDecimal("3.39");
    char degree;
    boolean international;
    double tuitionFees = 12000.0, internationalFees = 5000.0; // multi-variable Declaration

    // add an empty constructor
    // Student(){} -- no args constructor it is the same as if you do not specify

    // primary constructor
    Student(int id, String name, String gender, int age, long phone, double gpa, char degree,
            boolean international){
        this.id = id; // this. is used as reference
                        // this. cannot be used in static method.
                        // used to access shadowed/hidden variables, instance variables
        this.name = name;
        this.gender = gender;
        this.age = (byte) age;
        this.phone = phone;
        this.gpa = (float) gpa;
        this.degree = degree;
        this.international = international;
    }
    Student(){}  // no args constructor
                 // this is like the default constructor,so it assigns all zero to the variables, the one above is just
                 // constructor overloading which is fine

    Student(int id, String name, String gender, int age, long phone, double gpa, char degree){
        // this() must be the FIRST STATEMENT
        // only one this() per constructor
        // No recursive invocation (no call to the same constructor)
        // no instance variable in the invocation statement
        this(id, name, gender, age, phone, gpa, degree,false); //invocation statement of an
                                                                            // overloaded constr.
    }
    void updateProfile(String name){
        this.name = name;
    }

    void compute() {
        computeCount = computeCount + 1;
        int nextId = id + 1; // local variable, specified within the method
                                // no default value for local variables

        if (international){
            tuitionFees = tuitionFees + internationalFees;
        }
        if (gpa > 3.8) {
            tuitionFees = tuitionFees - 1000;
        }

        System.out.println("\nid: " + this.id);
        System.out.println("nextId: " + nextId);
        System.out.println("name: " + this.name);
        System.out.println("gender: " + this.gender);
        System.out.println("age: " + this.age);
        System.out.println("phone: " + this.phone);
        System.out.println("gpa: " + this.gpa);
        //System.out.println("gpa avg: " + gpa_avg);
        //System.out.println("wrong approx: " + diff);
        //System.out.println("correct approx: " + gpa2.subtract(gpa_avg2) );
        System.out.println("degree: " + this.degree);
        System.out.println("tuitionfees: " + tuitionFees);
        System.out.println("ComputeCount: " + computeCount);

    }

}






































