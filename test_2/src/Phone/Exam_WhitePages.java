package Phone;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_WhitePages {
    ArrayList<Exam_WhitePagesItem>whitePageList = new ArrayList<>();

    public Exam_WhitePages(){
        whitePageList.add(new Exam_WhitePagesItem("홍길동","010-111-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길이","010-222-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길삼","010-333-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길사","010-444-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길오","010-555-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길육","010-666-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길칠","010-777-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길팔","010-888-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길구","010-999-1111"));
        whitePageList.add(new Exam_WhitePagesItem("홍길십","010-000-1111"));
    }

    public void showList(){
        System.out.println("\n=== mini White Pages List ===");
        System.out.println("======================총========"+whitePageList.size()+"명");
        for(Exam_WhitePagesItem item : whitePageList){
            System.out.println(item);
        }
        System.out.println("===========================end");
    }
    public boolean addWhitePage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = sc.next();
        System.out.println("전화번호를 입력해주세요");
        String teleNum = sc.next();

        boolean booTeleChk = false;
        for(Exam_WhitePagesItem item : whitePageList){
            if((item.getTeleNum().equals(teleNum))){
                booTeleChk = true;
                System.out.println("입력하신 전화번호 ["+item.getTeleNum()+"]는 이미 존재하는 전화번호입니다");
                System.out.println("해당 정보를 다시 입력해주세요 =>");
                break;
            }
        }
        if(!booTeleChk)whitePageList.add(new Exam_WhitePagesItem(name,teleNum));
        return booTeleChk;
    }
    public boolean removeWhitePage(){
        boolean chk = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 이름을 입력해주세요");
        String name = sc.next();

        ArrayList<Exam_WhitePagesItem> deleteList = new ArrayList<>();

        for(Exam_WhitePagesItem item : whitePageList){
            if(item.getName().equals(name.trim())){
                deleteList.add(item);
            }
        }
        if(deleteList.size() == 1){
            chk = whitePageList.remove(deleteList.get(0));
        }else if(deleteList.size()>1) {
            System.out.println("입력하신이름에 대한 정보가 1개이상 존재합니다.");
            for (int i = 0; i < deleteList.size(); i++) {
                System.out.println((i + 1) + "," + deleteList.get(i));
            }
            try {
                System.out.println("삭제하실 정보를 선택해주세용 =>");
                int num = sc.nextInt() - 1;
                if (num >= 0 && num < deleteList.size()) {
                    chk = whitePageList.remove(deleteList.get(num));
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 값을 입력하셨습니다.");
            }
        }else{
            System.out.println("입력하신 이름에 대한 정보가 존재하지 않습니다.");
        }
        return chk;
    }

    public static void main(String[] args) {
        Exam_WhitePages whitepage = new Exam_WhitePages();
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("=====전화번호부=====");
            System.out.println("1.전체보기");
            System.out.println("2.입력하기");
            System.out.println("3.지우기");
            System.out.println("4.종료");
            System.out.println("==================");

            try {
                System.out.println("메뉴를 선택해주세요");
                int menuNum = sc.nextInt();

                switch (menuNum){
                    case 1:
                        whitepage.showList();
                        System.out.println("메뉴를 보시려면 아무키나 눌러주세요");
                        sc.next();
                        sc.next();
                        break;
                    case 2:
                        while(whitepage.addWhitePage()){};
                        System.out.println("입력하신정보가 정상적으로 저장되었습니다.");
                        break;
                    case 3:
                        if(whitepage.removeWhitePage()){
                            System.out.println("해당정보가 정상적으로 삭제되었습니다");
                        }
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                        break;

                    default:
                        throw new InputMismatchException();
                }
            }catch (InputMismatchException e){
                System.out.println("잘못된 값을 입력하셨습니다. 메뉴를 다시 선택해주세요");
            }
        }
    }


}
