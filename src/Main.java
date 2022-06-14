public class Main {

    public static void main(String[] args){
        Student student1 = new Student(1000,"John","male",18,113_247_782L,
                3.8,'B');
        student1.compute();

        Student student2 = new Student(1001,"Pia","Female",20,113_335_733L,
                3.9,'A',false);
        student2.compute();

        System.out.println("\nName of student 1: " + student1.name);
        System.out.println("\nName of student 2: " + student2.name);

        student1.updateProfile("Johan");
        System.out.println("\nUpdated name of student 1: " + student1.name);
    }
}
