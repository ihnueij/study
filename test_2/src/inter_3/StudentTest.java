package inter_3;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
//        Student[] st = new Student[3];
//        st[0] = new Student("홍길동",3.39);
    }
}
class Student implements Comparable{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int comparaTO(Object obj) {
        Student other = (Student) obj;
        if(gpa < other.gpa){
            return -1;
        }else if(gpa >other.gpa){
            return 1;
        }else{
            return 0;
        }
    }
}
