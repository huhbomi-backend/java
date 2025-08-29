package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person {
    private String name;
    private String idNumber;     // 고유 식별자
    private String address;
    private String phoneNumber;

    public Person(String name, String idNumber, String address, String phoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }
    public String getIdNumber() { return idNumber; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setName(String name) { this.name = name; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    // 동등성: 고유 식별자만 사용 (권장)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                 // 동일 객체 빠른 리턴
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(idNumber, person.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("길동", "123-456", "김포", "010-1234-5623");
        Person p2 = new Person("길자", "234-436", "부산", "010-5434-5148");
        Person p3 = new Person("길순", "145-416", "서울", "010-1274-5118");
        Person p4 = new Person("길미", "246-136", "일산", "010-1644-3678");
        Person p5 = new Person("길용", "198-454", "수원", "010-1364-5658");

        Person[] persons = {p1, p2, p3, p4, p5};

        // 1) List
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(persons));

        System.out.println("========== List에 담기 ==========");
        System.out.println(personList);

        // 2) Set (중복 제거 기준: idNumber)
        Set<Person> personSet = new HashSet<>(Arrays.asList(persons));

        System.out.println("========== Set에 담기 ==========");
        System.out.println(personSet);

        // 3) Map (key: idNumber, value: Person)
        Map<String, Person> personMap = new HashMap<>();
        personMap.put(p1.getIdNumber(), p1);
        personMap.put(p2.getIdNumber(), p2);
        personMap.put(p3.getIdNumber(), p3);
        personMap.put(p4.getIdNumber(), p4);
        personMap.put(p5.getIdNumber(), p5);

        System.out.println("========== Map에 담기 ==========");
        System.out.println(personMap);
    }
}
