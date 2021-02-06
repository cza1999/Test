package arraylist;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("hong", 212);
        Student two = new Student("gh", 222);
        Student three = new Student("dfv", 232);
        Student four = new Student("df", 242);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+" 年龄："+stu.getAge());
        }
    }
}
