package String;
// changing the case of a string
public class changeCase {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
    }
}
