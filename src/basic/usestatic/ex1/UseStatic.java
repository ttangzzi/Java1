package basic.usestatic.ex1;

public class UseStatic {
    public static void main(String[] args) {
        // 정적 필드와 정적 메소드는 인스턴스를 생성하지 않고 사용 가능하다.
        String ttangBrand = TtangChicken.brand;
        String ttangContact = TtangChicken.contact();

        // 일반 인스턴스 메소드는 불가능하다.

        // 인스턴스에선 정적 필드와 메소드 사용 가능, 편의상 기능이지만 권장하지 않는 기능이다.
        TtangChicken store1 = new TtangChicken(3, "괴정");

        String store1Brand = store1.brand;
        System.out.println("store1Brand = " + store1Brand);

        String store1Contact = store1.contact();
        System.out.println("store1Contact = " + store1Contact);

    }
}
