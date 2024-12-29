package First;

public class StudentTestStatic {
    public static void main(String[] args) {
        StudentStatic studentLee = new StudentStatic();
        studentLee.setStudentName("이지원");
        System.out.println(StudentStatic.getSerialNum());
        System.out.println(studentLee.studentName+" 학번: "+studentLee.studentID);

        StudentStatic studentSon = new StudentStatic();
        studentSon.setStudentName("손수경");
        System.out.println(StudentStatic.getSerialNum());
        System.out.println(studentSon.studentName+" 학번: "+studentSon.studentID);
    }
}
