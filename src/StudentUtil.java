import java.util.ArrayList;
import java.util.List;

public class StudentUtil {

    static List<Double> GPA = new ArrayList<>();
    static int[] idList = {1001, 1002};
    static char[][] grades = {{'A','A','A','B'},{'A','B','B'}};
    static double lower = 3.70;
    static double higher = 3.71;
    static float int_grades;
    static List<Double> out = new ArrayList<>();
    static List<Integer> withinGPA = new ArrayList<>();

    public static List<Double> calculateGPA(char[][] studentsGrades){
            for (int r = 0; r < studentsGrades.length; r++){
                for (int c = 0; c < studentsGrades[r].length; c++){
                    if (studentsGrades[r][c] == 'A'){
                        studentsGrades[r][c] =  '4';
                    } else if (studentsGrades[r][c] == 'B'){
                        studentsGrades[r][c] = '3';
                    } else {
                        studentsGrades[r][c] = '4';
                    }
                }
                int_grades = Integer.parseInt(new String(studentsGrades[r]));
                List<Integer> grade_list = new ArrayList<>();
                for (int i = 0;  i < studentsGrades[r].length; i++){
                    grade_list.add(Integer.parseInt(String.valueOf(studentsGrades[r][i])));
                }
                float sum = 0;
                int len = grade_list.size();
                for (Object o : grade_list) {
                    sum += (int) o;
                }
                double avg = sum / len;
                out.add(avg);
            }
            return out;

    }

    public static List<Integer> getStudentByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades){
        if (lower > higher || lower < 0 || higher <0){
            return null;
        }
        GPA = calculateGPA(studentsGrades);

        for (int i = 0; i < studentsGrades.length; i++){
            if (lower < GPA.get(i) && GPA.get(i) < higher){
                withinGPA.add(studentIdList[i]);

            }
        }
        return withinGPA;
    }

    public static void main(String[] args) {
        //System.out.println(calculateGPA(idList,grades));
        System.out.println(getStudentByGPA(lower,higher,idList,grades));
    }
}







