package First;

public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안현수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());

        Student student1 = new Student();
        student1.studentName = "안승연";
        System.out.println(student1.getStudentName());

        System.out.println(studentAhn);
        System.out.println(student1);

    }
}
