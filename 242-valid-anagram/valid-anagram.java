class Solution {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)-'a']++;
            array[t.charAt(i)-'a']--;
        }
        for (int count : array) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}