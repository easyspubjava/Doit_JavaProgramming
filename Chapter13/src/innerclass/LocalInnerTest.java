package innerclass;


class Outer{

    int outNum = 100;

    Runnable getRunable(int i){

        int num = 100;

        return new Runnable() {

            @Override
            public void run() {
                System.out.println(i);
                System.out.println(num);

            }
        };
    }


}

public class LocalInnerTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable getRunable = outer.getRunable(500);
        getRunable.run();

    }

}
