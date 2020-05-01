package example;

public class thisFuncBook {
    String title;
    String author;
    void show(){
        System.out.println(title+" "+author);
    }
    public thisFuncBook(){
        this("","");
        System.out.println("1 생성자 호출됨");
    }
    public thisFuncBook(String title){
        this(title, "unknown");
        System.out.println("2 생성자 호출됨");
    }
    public thisFuncBook(String title, String author){
        this.title = title; this.author = author;
        System.out.println("3 생성자 호출됨");
    }
    public static void main(String[] args){
       thisFuncBook littlePrince = new thisFuncBook("어린왕자", "생텍쥐페리");
        System.out.println("\n");
        thisFuncBook chun = new thisFuncBook("춘향전");
        System.out.println("\n");
        thisFuncBook empty = new thisFuncBook();
        littlePrince.show();
        chun.show();
        empty.show();
    }
}
