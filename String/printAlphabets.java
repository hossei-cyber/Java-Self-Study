package String;
// printing alphabets
public class printAlphabets {
    public static void main(String[] args) {
        alphabets('a', 'z');
    }
    public static void alphabets(char c1, char c2){
        String s = "a b c d e f g h i j k l m n o p q r s t u v w x y z";


        int startIndex = (c1 - 'a') * 2;
        int endIndex = (c2 - 'a') * 2 + 1;
        if (endIndex >= s.length()) {
            endIndex = s.length() - 1;
        }
        // Print the substring with spaces
        System.out.print(s.substring(startIndex, endIndex + 1));
    }
}

