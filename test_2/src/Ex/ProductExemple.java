package Ex;

public class ProductExemple {
    public static void main(String[] args) {
//		Product<TV,String> product1 = new Product(); 이것도 가능
        Product<TV, String> product1 = new Product<TV, String>();
        product1.setKind(new TV());
        product1.setModal("스마트TV");
        TV tv = product1.getKind();//8번줄의 tv객체를 받는다.
        String tvModel = product1.getModal();

        System.out.println(tv);
        System.out.println(tvModel);

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModal("디젤");
        Car car = product2.getKind();//8번줄의 tv객체를 받는다.
        String carModel = product2.getModal();

        System.out.println(car);
        System.out.println(carModel);
    }
}
