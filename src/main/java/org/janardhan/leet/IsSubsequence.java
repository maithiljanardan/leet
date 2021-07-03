package org.janardhan.leet;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() <= 0)
            return false;
        int sIndex = 0;
        int tIndex = 0;
        while (tIndex < t.length()) {

            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++;
                if (sIndex == s.length()) return true;
            }
            tIndex++;
        }
        return false;
    }
}
