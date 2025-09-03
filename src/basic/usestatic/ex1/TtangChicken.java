package basic.usestatic.ex1;

public class TtangChicken {
    // 정적(클래스) 필드와 메소드들 : 인스턴스마다 따로 갖고 있을 필요 없는 것들에 사용한다.
    // 정적(클래스) 필드
    static String brand = "땅치킨";

    // 정적(클래스) 메소드
    // 정적 메소드에선 인스턴스 프로퍼티(=필드) 사용 불가
    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }

    int no;
    String name;

    public TtangChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // 인스턴스가 가질 "메소드"이다.
    String title() {
        // no과 name앞에 this를 붙인 것과 같다.
        return "안녕하세요, %d호 %s점입니다.".formatted(no, name);
    }
}
