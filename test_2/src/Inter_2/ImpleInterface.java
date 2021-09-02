package Inter_2;

public class ImpleInterface implements InterExample{

    @Override
    public void makeThis() {
        System.out.println("makeThis Call");
    }

    @Override
    public void makeThisWithParam(String nameVlaue, int ageValue) {
        System.out.println("makeThisWithParam Call with"+nameVlaue+"  | "+ageValue);
    }

    public static void main(String[] args) {
        ImpleInterface inter = new ImpleInterface();
        inter.makeThis();
        inter.makeThisWithParam("Name",20);
    }
}
