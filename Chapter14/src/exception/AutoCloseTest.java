package exception;

public class AutoCloseTest {

    public static void main(String[] args) {

        AutoClostObj obj = new AutoClostObj();

        try( obj){
            throw new Exception();
        }catch(Exception e){
            System.out.println("exception caught");

        }
    }
}
