package Ex;

public class WrapperEx {
    public static void main(String[] args) {
        char c1= '4', c2='F';
        if(Character.isDigit(c1)) {//숫자인지 판단
            System.out.println(c1+"는숫자");
        }
        if(Character.isAlphabetic(c1)) {//영문자인지판단
            System.out.println(c1+"는영문자");
        }
        if(Character.isDigit(c2)) {
            System.out.println(c2+"는숫자");
        }
        if(Character.isAlphabetic(c2)) {
            System.out.println(c2+"는영문자");
        }
        System.out.println(Integer.parseInt("-123"));
        System.out.println(Integer.toHexString(28));
        System.out.println(Integer.toBinaryString(28));

        Double d=Double.valueOf(3.14);
        System.out.println(d.toString());
        double d2=Double.parseDouble("3.14");
        System.out.println(d2);
        System.out.println(Double.parseDouble("3.14"));

        boolean b= (4>3);
        System.out.println(Boolean.toString(b));
        System.out.println(Boolean.parseBoolean("false"));
    }
}
