package List;

public class StudentTest2 {
    public static void main(String[] args) {
        Student2 park = new Student2(1001,"Park");

        park.addSubject("국어",100);
        park.addSubject("수학",95);

        Student2 Kim = new Student2(1001, "kim");

        Kim.addSubject("국어", 100);
        Kim.addSubject("수학", 75);
        Kim.addSubject("영어", 62);

        park.showInfo();
        System.out.println("================================");
        Kim.showInfo();
    }
}
