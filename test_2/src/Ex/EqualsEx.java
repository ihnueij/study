package Ex;

class Point3 {
    private int x,y;
    public Point3(int x, int y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object obj) {
        Point3 p=(Point3)obj;
        if(x==p.x && y==p.y) {
            return true;
        }else {
            return false;
        }
    }
}


public class EqualsEx {
    public static void main(String[] args) {
        Point3 a = new Point3(2,3);
        Point3 b = new Point3(2,3);
        Point3 c = new Point3(3,4);

        System.out.println(a==b);//==은 주소가 일치한지 확인하고 equals는 값이 같은지를 비교 한다 . override를 해주면 equals의 역할응 할수 있다
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
    }
}
