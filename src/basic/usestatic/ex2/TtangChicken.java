package basic.usestatic.ex2;

public class TtangChicken {
    static String brand = "땅치킨";
    static int lastNo = 0;

    int no;
    String name;

    public TtangChicken(String name) {
        no = ++lastNo;
        this.name = name;
    }

    String title() {
        return "안녕하세요 %s %d호 %s점입니다.".formatted(brand, no, name);
    }
}
