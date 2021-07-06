package org.janardhan.strng;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};

        System.out.println(shortestCompletingWord(licensePlate, words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String answer = "";
        int[] map = new int[26];
        int minLength = Integer.MAX_VALUE;
        for (char ch : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                map[ch - 'a']++;
            }
        }

        for (String word : words) {
            int[] wordMap = new int[26];
            for (char c : word.toCharArray()) {
                wordMap[c - 'a']++;
            }

            boolean validWord = true;
            for (int i = 0; i < 26; i++) {
                if (map[i] != 0 && map[i] > wordMap[i]) {
                    validWord = false;
                    break;
                }
            }

            if (validWord && minLength > word.length()) {
                answer = word;
                minLength = word.length();
            }
        }
        return answer;
    }
}
