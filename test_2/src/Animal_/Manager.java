package Animal_;

public class Manager extends Employee {
    private String position;

    public Manager(String empNo, String name, String part, String position) {
        super(empNo, name, part);
        this.position = position;
    }
    public String addStr(){
        String result = "";
        result += "직책 : "+position+ "\n";
        return result;
    }
}
