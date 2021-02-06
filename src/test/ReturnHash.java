package test;
public class ReturnHash {
    public static void main(String[] args) {
        object_Hash p1=new object_Hash();
        int h1=p1.hashCode();
        System.out.println(h1);

        object_Hash p2=new object_Hash();
        int h2=p2.hashCode();
        System.out.println(h2);

        String s = new String("fdss");
        System.out.println(s.hashCode());
    }
}
