package getClass3Methods;

public class person {
    private  String name="张三";
    private  int age=18;
    public  int num=4;
    public void eat(){
        System.out.println("吃过了");
    }
    public void eat2(String food){
        System.out.println("吃了"+food);
    }

    public person(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }
    public person() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                '}';
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


}
