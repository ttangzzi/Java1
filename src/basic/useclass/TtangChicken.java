package basic.useclass;

public class TtangChicken {
    // 인스턴스가 가질 "필드"들이다.
    int no;
    String name;

    // 생성자 : 인스턴스를 만드는 메소드
    // this : 만들어질 인스턴스를 가리킴
    public TtangChicken(int no, String name) {
        // 필드에는 this를 붙여 구분한다.
        this.no = no;
        this.name = name;
    }

    // 인스턴스가 가질 "메소드"이다.
    String title() {
        // no과 name앞에 this를 붙인 것과 같다.
        return "안녕하세요, %d호 %s점입니다.".formatted(no, name);
    }

}
