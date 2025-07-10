package interfaceex;

public interface Calc {

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);


    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    static int total(int[] arr){

        int total = 0;
        for(int i : arr){
            total += i;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod(){
        System.out.println("private method");
    }

    private static void myStaticMethod(){
        System.out.println("private static method");
    }
}
