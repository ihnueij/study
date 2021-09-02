package Ex;

public class BoxExample2 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2<String>();//실제객체 만들때는 타입을 내가 지정해주면된다
        box2.set("Hello");
//		box2.set(new Integer(10)); 스트링만 된다  오류뜬다.
        String greet= box2.get();

        System.out.println(greet);

        Box2<Integer> box22 = new Box2<Integer>();
        box22.set(6);
        int value = box22.get();

        System.out.println(value);
    }
}
