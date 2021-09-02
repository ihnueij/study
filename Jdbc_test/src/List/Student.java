package List;

import java.util.ArrayList;

public class Student {
    public String studentName;
    ArrayList<Book> bookList;

    public Student(String studentName) {
        this.studentName = studentName;

        bookList = new ArrayList<Book>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookList.add(book);
    }
    public void showInfo(){
        System.out.println(studentName+"학생이 읽은 책은 : ");
        for (Book book : bookList) {
            System.out.println(book.getTitle()+" ");
        }
        System.out.println("입니다");
    }
}
