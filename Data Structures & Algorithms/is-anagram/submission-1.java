class Solution {
    public boolean isAnagram(String s, String t) {  
        // edge case if both strings lengths arent the same
        if (s.length() != t.length()) {
            return false;
        }
        // new alphabet array of fixed size 26
        int[] alphabet = new int[26];
        // s increment index and t decrement index to ensure 0 means that there is a valid anagram
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        // check zeroes for anagrams
        for (int count : alphabet) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

