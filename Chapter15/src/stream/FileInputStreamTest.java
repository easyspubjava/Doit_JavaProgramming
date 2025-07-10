package stream;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest {

    public static void main(String[] args) {

        try {
            InputStreamReader fis  = new InputStreamReader(new FileInputStream("reader.txt"));
            int i;
            while( (i = fis.read()) != -1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
