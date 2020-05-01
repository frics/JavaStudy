package example;

public class Book {
    String title;
    String author;

    public Book(){
        title="엥"; author ="엥엥";
    }
    public Book(String t){ //생성자
         title = t; author ="unknown";
    }
    public  Book(String t, String a){
        title =t; author = a;
    }
    public static void main(String[] args){
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book chun = new Book("춘향전");
        System.out.println(littlePrince.title+" "+littlePrince.author);
        System.out.println(chun.title+" "+chun.author);
    }
}
