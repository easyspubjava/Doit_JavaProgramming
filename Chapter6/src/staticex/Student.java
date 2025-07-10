package staticex;

public class Student {
    private static int serialnumber = 1000;
    private int id;
    private String name;
    private int grade;

    public Student() {
        serialnumber++;
        this.id = serialnumber;
    }

    public int getId() {
        return id;
    }

    public static int getSerialnumber(){
        int i = 0;
        //id = 100;
        return serialnumber;
    }
}
