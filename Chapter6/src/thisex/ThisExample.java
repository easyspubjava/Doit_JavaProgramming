package thisex;

class BirthDay{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

    public void printThis(){
        System.out.println(this);
    }
}
public class ThisExample {
    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();
        birthDay.setYear(2020);
        birthDay.printThis();
    }
}
