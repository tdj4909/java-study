package First;

public class StudentTest1 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
//        studentLee.studentName = "이상원";
        studentLee.setStudentName("이상원");

        System.out.println(studentLee.getStudentName());
    }
}
