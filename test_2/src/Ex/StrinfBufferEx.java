package Ex;

public class StrinfBufferEx {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("This");

        sb.append(" is pencil");// 앞이랑 합쳐준다
        System.out.println(sb);

        sb.insert(7, " my");//7번째에 " my"넣기
        System.out.println(sb);

        sb.replace(8, 10, "your");//지정된 좌표에 해당 문자로 교체
        System.out.println(sb);

        sb.delete(8, 13);//지정된 좌표에 해당 문자 삭제
        System.out.println(sb);

        sb.setLength(4);//1부터 해당 숫자까지 문자 들고오기
        System.out.println(sb);



    }
}
