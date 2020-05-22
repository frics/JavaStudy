import java.util.Scanner;

//chap4_10
public class DicApp {

    private void search(){
        Scanner scanner = new Scanner(System.in);
        String kor;
        String eng;
        while(true){
            System.out.print("한글 단어?");
            kor = scanner.next();
            if(kor.equals("그만"))
                break;
            eng = Dictionary.kor2Eng(kor);
            if(eng == null)
                System.out.println(kor+"은(는) 저의 사전에 없습니다.");
            else
                System.out.println(kor+"은(는) "+eng);

        }
    }
    public static void main(String[] args){
        DicApp dic = new DicApp();
        System.out.println("한영 단어 검색 프로그램입니다.");
        dic.search();
    }

}
class Dictionary{
    private  static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private  static String[] eng = {"love", "baby", "money", "future", "hope"};
    static String kor2Eng(String word){
        for(int i=0; i<kor.length; i++){
            if(word.equals(kor[i]))
                return eng[i];
        }
        return null;
    }
}