package HashSet;

import java.util.Objects;

public class SetPerson {
    private String name;
    private int age;

    public SetPerson() {
    }

    public SetPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "SetPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetPerson setPerson = (SetPerson) o;
        return age == setPerson.age && Objects.equals(name, setPerson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



}
