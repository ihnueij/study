class Drink{
    private String name;
    private int price;
    public Drink(String name , int price){
        this.name =name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Machine{
    public Drink button(int number){
        Drink d = null;
        switch (number){
            case 1: d = new Drink("콜라",2000); break;
            case 2: d = new Drink("사이다",1800); break;
            case 3: d = new Drink("우유",1500); break;
        }
        return d;
    }
}
public class vm {
    public static void main(String[] args) {
        Machine vm = new Machine();
        Drink d = vm.button(1);
        System.out.println(d.getName());
        Drink d1 = vm.button(2);
        System.out.println(d1.getName());
    }
}
