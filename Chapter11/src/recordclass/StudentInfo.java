package recordclass;

public record StudentInfo(int id, String name) {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if( obj instanceof StudentInfo){
            StudentInfo studentInfo = (StudentInfo) obj;
            return id == studentInfo.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return " [id=" + id + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo(100, "최치원");
        StudentInfo studentInfo2 = new StudentInfo(100, "김유신");

        System.out.println(studentInfo.equals(studentInfo2));
        System.out.println(studentInfo);
    }
}

