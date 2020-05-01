package example;

import java.util.Scanner;

class ABook{
    String title, author;
    public ABook(String title, String author){
        this.title= title;
        this.author= author;
    }
}
public class BookArray {
    public static void main(String[] args){
        ABook[] book = new ABook[2];
        Scanner s = new Scanner(System.in);

        for(int i=0; i<book.length; i++){
            System.out.print("제목>>");
            String title = s.next();
            System.out.print("저자>>");
            String author = s.next();
            book[i] = new ABook(title, author);
        }
        for(int i=0; i<book.length; i++)
            System.out.println("("+book[i].title+","+book[i].author + ")");
        s.close();
    }
}
