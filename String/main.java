package String;
// counting words in a string
public class main {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("Number of words in the string are: " + count);
    }
}
