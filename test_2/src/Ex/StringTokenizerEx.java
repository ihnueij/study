package Ex;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String a ="홍길동 장화 홍련 콩쥐 팥쥐";
        StringTokenizer str = new StringTokenizer(a);
        while(str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
        String b ="홍길동/장화/홍련/콩쥐/팥쥐";
        StringTokenizer ff = new StringTokenizer(b,"/");
        while(ff.hasMoreElements()) {
            System.out.print(ff.nextToken()+" ");
        }
    }

}
