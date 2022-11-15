package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdf");
        helloLombok.setAge(20);

        System.out.println("helloLombok = " + helloLombok);
    }
}

//출력결과
//helloLombok = HelloLombok(name=asdf, age=20)
