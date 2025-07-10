package array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> bookArrayList = new ArrayList<>();

        bookArrayList.add(new Book("태백산맥1", "조정래"));
        bookArrayList.add(new Book("태백산맥2", "조정래"));
        bookArrayList.add(new Book("태백산맥3", "조정래"));

        for(int i =0; i <bookArrayList.size()-1; i++){
            bookArrayList.get(i).showBookInfo();
        }

        for(Book book: bookArrayList ){
            book.showBookInfo();
        }
    }
}
