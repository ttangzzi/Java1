package basic.useclass;

public class UseClass {
    public static void main(String[] args) {
        // 본사 소속의 매장을 내는 코드
        TtangChicken store1 = new TtangChicken(3, "갈마");
        // store1.no = 3;
        // store1.name = "갈마";

        TtangChicken store2 = new TtangChicken(3, "둔산");
        // store2.no = 3;
        // store2.name = "둔산";

        TtangChicken store3 = new TtangChicken(2, "괴정");
        
        // 인스턴스 필드들에 접근
        int store1No = store1.no;
        String store2Name = store2.name;
        
        // 인스턴스의 메소드 호출
        String title1 = store1.title();
        System.out.println("title = " + title1);
        
        String title2 = store2.title();
        System.out.println("title2 = " + title2);
        
        String title3 = store3.title();
        System.out.println("title3 = " + title3);
    }
}
