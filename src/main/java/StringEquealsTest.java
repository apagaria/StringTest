public class StringEquealsTest {
    public static void main(String args[]) {
        String a = "Arpit";
        String b = "Arpit";
        String c = new String("String");
        System.out.println("(a == b) : "+(a==b));
        System.out.println("(b == c) : "+(b==c));
        System.out.println("(c == a) : "+(c==a));
    }
}
