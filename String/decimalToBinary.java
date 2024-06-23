package String;

public class decimalToBinary {
    public static void main(String[] args) {
        toBinary("10");
    }

    public static void toBinary(String N)
    {
        // Code here
        String s = "";
        int n = Integer.parseInt(N);
        while(n > 0){
            s = (n % 2) + s;
            n = n / 2;
        }
        System.out.print(s);
    }
}
