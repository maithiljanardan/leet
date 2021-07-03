package org.janardhan.leet;

public class MakeWordsSame {
    public static void main(String[] args) {
        StringReconciler stringReconciler = new StringReconciler("abc", "ss");
        //System.out.println(stringReconciler.reconcile());
    }

    private static class StringReconciler {
        private String word1;
        private String word2;

        public StringReconciler(String word1, String word2) {
            this.word1 = word1;
            this.word2 = word2;
        }

        public int reconcileWithoutKeepingOrder() {
            int[] charCount = new int[26];
            for (int i = 0; i < word1.length(); i++) {
                charCount[word1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < word2.length(); i++) {
                charCount[word2.charAt(i) - 'a']--;
            }
            int count = 0;
            for (int i = 0; i < 26; ++i) {
                if (charCount[i] != 0) {
                    count += Math.abs(charCount[i]);
                }
            }

            return count;
        }
    }
}
