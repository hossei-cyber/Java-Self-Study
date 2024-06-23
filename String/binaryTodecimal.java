package String;

public class binaryTodecimal {
    public static void main(String[] args) {
        toDecimal("1010");
    }

    public static void toDecimal(String N)
    {
        // Code here
        int n = Integer.parseInt(N, 2);
        System.out.print(n);
    }

    public int binary_to_decimal(String str) {
        // Code here
        int m = 0;
        int k = 1;
        for(int i = str.length() -1; i >= 0; i--){
            m += (str.charAt(i) - '0') * k;
            k = k *2;
        }
        return m;
    }
}
