package String;
// checking if a string is a panagram
class Solution
{
    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog";
        if(isPanagram(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isPanagram(String str)
    {
        // Check if given string is panagram
        String str1 = str.toLowerCase();
        int n = str1.length();
        if(n < 26){
            return false;
        }
        boolean visited[] = new boolean[26];
        for(int i = 0; i < n; i++){
            char x = str1.charAt(i);
            if(x >= 'a' && x <='z')
            {
                visited[x-'a'] = true;
            }

            if(x >= 'A' && x <='Z')
            {
                visited[x-'A'] = true;
            }
        }
        for(int i =0; i<26; i++)
        {
            if(visited[i] == false)
                return false;
        }

        return true;
    }
}
