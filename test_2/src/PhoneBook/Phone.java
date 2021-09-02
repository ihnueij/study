package PhoneBook;

public class Phone {
    private String name;
    private String telnum;
    private String address;

    public Phone(String name, String telnum, String address) {
        this.name = name;
        this.telnum = telnum;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getTelnum() {
        return telnum;
    }
    public String getAddress() {
        return address;
    }
    public String toString(){

        return "이름: "+name +"번호: "+telnum+"주소: "+address;
    }
}
