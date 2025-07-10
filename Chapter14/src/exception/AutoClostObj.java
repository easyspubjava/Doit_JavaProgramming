package exception;

public class AutoClostObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("auto close obj");
    }
}
