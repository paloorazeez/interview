package string;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String palindromicSubStr = findPalindromicSubstring("forgeeksskeegfor".toCharArray());
        System.out.printf(palindromicSubStr);
    }

    private static String findPalindromicSubstring(char[] input) {
        String output = "";
        int left =0,right=input.length-1;
        while (left<=right)
        {
            if(input[left] == input[right])
                output+=input[left];
            else
                output= "";

            left++;
            right--;
        }
        int n = ((output.length() & 1) ==1)?output.length():output.length()-1;

        String temp = output.substring(0,n);
        temp = reverse(temp);
        output+=temp;
        return output;
    }

    public static String reverse(String input) {

        StringBuilder sb = new StringBuilder();
        char[] arr = input.toCharArray();
        int left =0, right = arr.length-1;
        while(left<right)
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return sb.append(arr).toString();
    }
}
