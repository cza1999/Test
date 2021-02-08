package Thread.InnerClassAndLambda;
//有参有返回
import java.util.Arrays;
import java.util.Comparator;

public class lambda2 {
    public static void main(String[] args) {
        Person[] arr={
                new Person("柳岩",38),
                new Person("迪丽热巴",28),
                new Person("古力娜扎",18)
        };
       /* Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
//        Lambdab表达式
        Arrays.sort(arr,( Person o1, Person o2) ->{
            return o1.getAge()-o2.getAge();
        } );
//        Lambdab表达式省略格式
        Arrays.sort(arr,(o1,o2)->o1.getAge()-o2.getAge());

        for (Person p : arr) {
            System.out.println(p);
        }

    }
}
