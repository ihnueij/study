package List;

public class StudentTest {
    public static void main(String[] args) {
        Student Lee = new Student("Lee");

        Lee.addBook("태백산맥1", "조정래");
        Lee.addBook("태백산맥2", "조정래");

        Student Kim = new Student("kim");

        Kim.addBook("토지1","박경리");
        Kim.addBook("토지2","박경리");
        Kim.addBook("토지3","박경리");

        Student Cho = new Student("Cho");

        Cho.addBook("해리포터1","조앤롤링");
        Cho.addBook("해리포터2","조앤롤링");
        Cho.addBook("해리포터3","조앤롤링");
        Cho.addBook("해리포터4","조앤롤링");

        Lee.showInfo();
        Kim.showInfo();
        Cho.showInfo();

    }
}
