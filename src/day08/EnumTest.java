package day08;


// 기본 열거형
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// 값과 메소드를 가진 열거형
enum OrderStatus {
    PENDING("P", "대기중"),
    PROCESSING("R", "처리중"),
    SHIPPED("S", "배송중"),
    DELIVERED("D", "배송완료"),
    CANCELLED("C", "취소");

    private final String code;
    private final String description;

    // 생성자
    OrderStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    // getter 메소드
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    // 정적 메소드
    public static OrderStatus fromCode(String code) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.code.equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}

// 열거형 사용 예제
public class EnumTest {
    public static void main(String[] args) {
        // 열거형 사용
        Day today = Day.MONDAY;

        // switch문에서 사용
        switch(today) {
            case MONDAY:
            case FRIDAY:
                System.out.println("평일입니다.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다.");
                break;
        }

        // OrderStatus 사용
        OrderStatus status = OrderStatus.PENDING;
        System.out.println(status.getDescription());  // 대기중

        // 모든 값 순회
        for (OrderStatus s : OrderStatus.values()) {
            System.out.println(s.name() + ": " + s.getDescription());
        }

        // 코드로 찾기
        OrderStatus found = OrderStatus.fromCode("S");
        System.out.println(found);  // SHIPPED
    }
}