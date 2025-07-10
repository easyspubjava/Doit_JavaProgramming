package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        Class c = Class.forName(className);
        FileInputStream fis = new FileInputStream(fileName);

        return c;
    }

    public static void main(String[] args) {
        ThrowsTest throwsTest = new ThrowsTest();

        try {
            throwsTest.loadClass("test.txt", "aaa.bbb.CCC");

        } catch (FileNotFoundException | ClassNotFoundException e ) {
            System.out.println(e);
        }

        System.out.println("finish");
    }
}
