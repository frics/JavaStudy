import java.util.Scanner;

//chap4_8
public class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    private int people; //인원수를 받기 위한 변수
    private String name; //각 Phone 객체에 들어갈 이름을 받을 변수
    private String tel; //각 Phone 객체에 들어갈 전화번호를 받을 변수
    private Phone phone[];

    private void getPeople(){ //
        System.out.print("인원수>>");
        people = scanner.nextInt();
        phone = new Phone[people];
    }
    private void inputNumber(){
        for(int i=0; i<phone.length; i++){
            System.out.print("이름과 번호는 빈 칸없이 입력)>>>");
            name = scanner.next();
            tel = scanner.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
    }
    private void searchNumber(){
        while(true){
            System.out.print("검색할 이름>>");
            name = scanner.next();
            if(name.equals("그만"))
                break;
            int count =0;
            for(int i=0; i<phone.length; i++){
                count++;
                if(name.equals(phone[i].getName())) {
                    System.out.println(name + "의 번호는 " + phone[i].getTel() + "입니다.");
                    break;
                }
                if(count == phone.length)
                    System.out.println(name+"이(가) 없습니다.");
            }
        }
    }
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.getPeople();
        pb.inputNumber();
        pb.searchNumber();
    }
}
class Phone{
    private String name;
    private String tel;

    Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() {
        return name;
    }
    public String getTel(){
        return tel;
    }
}