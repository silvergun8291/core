package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter     // Getter를 자동으로 생성해 줌
@Setter     // Setter를 자동으로 생성해 줌
@ToString   // ToString을 자동으로 생성해 줌
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("aadfafa");

        System.out.println("name = " + helloLombok);
    }
}
