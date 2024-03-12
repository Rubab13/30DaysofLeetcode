class Solution {
    public static void main(String[] args) {
        if (isPalindrome(121)) {
            System.out.println("The given string is a palindrome.");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int x) {
        char ch;
        String result = "";
        String string = Integer.toString(x);
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            result = ch + result;
        }
        return (string.equals(result)) ? true : false;
    }
}