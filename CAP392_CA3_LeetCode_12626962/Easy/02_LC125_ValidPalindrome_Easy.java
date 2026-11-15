class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                a += c;
            }
        }

        String b = new StringBuilder(a).reverse().toString();
        return a.equals(b);
    }
}
