import java.util.Scanner;

public class Chap4_12 {
    private Scanner scanner = new Scanner(System.in);
    Seat[] seat = new Seat[3];
    char[] name = {'S', 'A', 'B'}; //각 좌석의 종류를 char형 배열에 저장

    Chap4_12(){ //S,A,B seat배열 생성자
        seat[0] = new Seat(); //S석
        seat[1] = new Seat(); //A석
        seat[2] = new Seat(); //B석
    }
    private int choose;

    public static void main(String[] args){
        Chap4_12 reserve = new Chap4_12(); //S,A,B좌석을 10개씩 생성
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        reserve.menu(); //menu 메소드로 넘어감
    }
    private void menu(){
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            choose = scanner.nextInt();
            switch (choose){
                case 1: Reservation();break; //예약 메뉴
                case 2: Check(); break; //조회 메뉴
                case 3: Cancel(); break; //예약 취소 메뉴
                case 4: return; //프로그램 종료
                default: System.out.println("잘못 입력하셨습니다."); //보기에 없는 항목 입력시 재입력
            }
        }
    }
    private void Reservation(){
        String reservName;
        int seatNum;
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        choose = scanner.nextInt();

        System.out.print(name[choose-1]+">> ");
        seat[choose-1].Show();
        System.out.print("이름>>");
        reservName = scanner.next();
        while(true){ //잘못된 좌석 번호를 입력 했을때 재입력을 위한 반복문
           System.out.print("번호>>");
            seatNum = scanner.nextInt();
            if(seatNum>10)
                System.out.println("없는 번호입니다. 다시 입력하세요.");
            else
                break;
        }

        seat[choose-1].setSeat(reservName, seatNum);

    }
    private void Check(){
        for(int i =0; i<seat.length; i++) {
            System.out.print(name[i]+">> ");
            seat[i].Show();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    private void Cancel(){
        String cancelName;
        boolean check = true;
        System.out.print("좌석 S:1, A:2, B:3>>");
        choose = scanner.nextInt();
        seat[choose-1].Show();
        while(check) {
            System.out.print("이름>>");
            cancelName = scanner.next();
            check = seat[choose - 1].cancelSeat(cancelName);
            if(check)
                System.out.println("없는 이름입니다. 다시 입력하세요.");
        }
    }
}
class Seat{
    String[] seat = new String[10];

    Seat(){
        for(int i=0; i<seat.length; i++) {
            seat[i] = "---";
        }
    }
    void setSeat(String name, int num){
        if(!seat[num-1].equals("---"))
            System.out.println("이미 예약된 자리입니다.");
        else
            seat[num-1] = name;
    }
    void Show(){
        for(int i=0; i<seat.length; i++)
            System.out.print(seat[i]+" ");
        System.out.println();
    }
    boolean cancelSeat(String name){
        for(int i=0; i<seat.length; i++){
            if(seat[i].equals(name)) {
                seat[i] = "---";
                return false;
            }
        }
        return true;
    }
}