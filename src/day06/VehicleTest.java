package day06;
// 부모 클래스
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " " + model + "의 시동을 겁니다.");
    }

    public void stop() {
        System.out.println(brand + " " + model + "의 시동을 끕니다.");
    }

    public void displayInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("연식: " + year);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);  // 부모 생성자 호출
        this.numberOfDoors = numberOfDoors;
    }

    // Car만의 고유 메소드
    public void openTrunk() {
        System.out.println("트렁크를 엽니다.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // 부모 메소드 호출
        System.out.println("문 개수: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }

    public void wheelie() {
        System.out.println("휠리를 합니다!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("오토바이 타입: " + type);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("현대", "소나타", 2023, 4);
        Motorcycle bike = new Motorcycle("할리데이비슨", "스포츠스터", 2022, "크루저");

        System.out.println("=== 자동차 정보 ===");
        car.displayInfo();
        car.start();
        car.openTrunk();
        car.stop();

        System.out.println("\n=== 오토바이 정보 ===");
        bike.displayInfo();
        bike.start();
        bike.wheelie();
        bike.stop();
    }
}