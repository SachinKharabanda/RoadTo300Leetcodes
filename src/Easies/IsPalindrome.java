package Easies;

public class IsPalindrome {

    public boolean isPalindrome(int x) {

        String s = Integer.toString(x);
        int j = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            j = j - 1;

        }

        return true;

    }

}
