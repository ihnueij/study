
/*
 * 학급
 * 반이름
 * 학생4명
 * 학생평균return
 */
class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int kor, int eng, int math) {
        super();
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getAvg() {
        return (kor + eng + math) / 3;
    }
    public int getPass() {
        int a = kor + eng + math;
        if(a >=60) {
            System.out.println("합격");
        }else {
            System.out.println("불합격");
        }
        return a;
    }
}

class ClassRoom {
    private String className;
    private Student[] student;

    public ClassRoom(String className, Student student1, Student student2, Student student3, Student student4) {
        this.className = className;

        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
        this.scores = scores;
    }

    private Student student2;
    private Student student3;
    private Student student4;
    private int[] scores;

    public ClassRoom(String className, int[] scores) {
        this.className = className;
        this.scores = scores;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int getAvg() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int avg = sum / scores.length;
        return avg;
    }
}
public class main {
    public static void main(String[] args) {
        /*
         * int[]arr = new int[] {60,70,80,90}; ClassRoom room = new ClassRoom("1반",arr);
         * System.out.println(room.getClassName());
         * System.out.println(Arrays.toString(room.getScores()));
         * System.out.println(room.getAvg());
         */

        Student s = new Student("길동", 40, 40, 40);
      /*System.out.println(s.getAvg());
		Student s1 = new Student("둘리", 100, 90, 50);
		System.out.println(s1.getAvg());
		Student s2 = new Student("도우너", 88, 50, 60);
		Student s3 = new Student("희동", 90, 90, 90);
		System.out.println(s.getName());
		System.out.println(s.getKor());
		System.out.println(s.getEng());
		System.out.println(s.getMath());*/
        System.out.println(s.getPass());


	/*	ClassRoom room = new ClassRoom("2반", s, s1, s2, s3);
		System.out.println(room.getClassName());*/

    }
}
