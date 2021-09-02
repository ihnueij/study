package List;

import java.util.ArrayList;

public class Student2 {
    public int studentId;
    public String studentName;
    ArrayList<Subject> subjectList;

    public Student2(int studentId, String studentName) {
         this.studentId = studentId;
         this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);
        subjectList.add(subject);
    }

    public void showInfo() {
        int total= 0;

        for (Subject subject : subjectList) {
            total=0;

            total += subject.getScore();
            System.out.println(studentName +" 학생의 "+subject.getName()+"과목의 점수는 "+subject.getScore()+"입니다.");
        }
        System.out.println(studentName+"학생의 총점은"+total+"입니다");
    }
}
