package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
            fos.write(65);
            fos.write(66);
            fos.write(67);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end");
    }
}
