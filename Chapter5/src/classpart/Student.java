package classpart;

public class Student {
    int studentID;
    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void showStudentInfo(){
        System.out.println("classpart.Student ID: " + studentID + "\n classpart.Student Name: " + studentName + "\n");
    }
}
