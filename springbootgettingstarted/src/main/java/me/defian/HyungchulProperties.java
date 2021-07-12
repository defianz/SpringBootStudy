package me.defian;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@Validated
@ConfigurationProperties("hyungchul")
public class HyungchulProperties {

    String name;
    int age;
    String fullname;
    String smallname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSmallname() {
        return smallname;
    }

    public void setSmallname(String smallname) {
        this.smallname = smallname;
    }
}
