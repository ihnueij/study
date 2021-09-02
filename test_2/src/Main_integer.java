
public class Main_integer {
    public static void main(String[] args) {
       Studentt st = new Studentt();
       st.name="길동";
       st.no= 1;
       st.ban= 5;
       st.kor=100;
       st.eng=100;
       st.math=100;

        System.out.println("이름:"+st.name);
        System.out.println("평균점수: "+st.getAvg());
        System.out.println("합산점수: "+st.getTotal());
    }
}
class Studentt{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Studentt(){}//기본생성자
    int  getTotal(){
        return kor + eng+math;
    }
    double getAvg(){
        return (int)(getTotal()/3);
    }


}
