package staticex;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        System.out.println(studentLee.getId());

        Student studentHong = new Student();
        System.out.println(studentHong.getId());

        System.out.println(Student.getSerialnumber());
    }
}
