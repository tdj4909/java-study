package First;

public class StudentStatic {
    private static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public StudentStatic(){
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum(){
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum){
        StudentStatic.serialNum = serialNum;
    }

}
