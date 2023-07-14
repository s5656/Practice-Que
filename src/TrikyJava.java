public class TrikyJava {
    public static void main(String[] args) {

        A object = null;
        System.out.println(object.a); //10
        System.out.println(object.b); // null pointer exception
    }
}
class A {
    static int a = 10;
    int b= 20;
}
