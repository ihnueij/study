package Ex;

public class Box2<T> {
    private T t; //T는 타입 ex) string 같은 같은 문자로 맞춰줘야한다


    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
