package interfaceex;

public class CalcTest {
    public static void main(String[] args) {

        Calc calc = new CompleteCalc();
        Calculator calculator = new CompleteCalc();
        CompleteCalc calc1 = new CompleteCalc();

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);

    }
}
