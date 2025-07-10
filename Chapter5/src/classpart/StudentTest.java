package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentHong = new Student();
        studentHong.studentName = "홍길동";
        System.out.println(studentHong.getStudentName());

        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        System.out.println(studentLee.getStudentName());

        System.out.println(studentHong);
        System.out.println(studentLee);
    }
}
