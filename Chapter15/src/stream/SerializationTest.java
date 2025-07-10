package stream;

import java.io.*;
import java.net.Socket;

class Person implements Serializable {

    String name;
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString()
    {
        return name + "," + job;
    }
}

public class SerializationTest {

    public static void main(String[] args) throws IOException {

        Person kim = new Person("김철수", "대표이사");
        Person lee = new Person("이영수", "고문");

        System.out.println(kim);
        System.out.println(lee);

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(kim);
            oos.writeObject(lee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Socket socket = new Socket("127.0.0.1", 8080);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    }


}
