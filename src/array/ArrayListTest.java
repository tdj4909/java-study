package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("태백산맥","조정래"));

        for (int i = 0;i<library.size();i++){
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("===향상된 for문 사용===");
        for (Book book : library){
            book.showBookInfo();
        }
    }
}
