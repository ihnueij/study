package Gen;

public class SimpleArrayList {
    private int size;
    private Object[] elementDate = new Object[5];

    public void add(Object value){
        elementDate[size++] = value;
    }
    public Object get(int idx){
        return elementDate[idx];
    }
}
