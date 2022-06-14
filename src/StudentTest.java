public class StudentTest {
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

        Student[] students = {student1,student2};
        swap(students,0,1); // swap the objects
        System.out.println("\nName of student1: " + students[0].name); // output with swapped objects.
        System.out.println("Name of student2: " + students[1].name);


    }
    // create a generic method
    static void swap(Student[] students, int firstIndex, int secondIndex){
        Student temp = students[firstIndex];
        students[firstIndex] = students[secondIndex];
        students[secondIndex] = temp;
    }
}
