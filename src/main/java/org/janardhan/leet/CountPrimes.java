package org.janardhan.leet;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(isPrime(10));
        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
    }

    private static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Uses Sieve of Eratosthenes
     *
     * @param n
     * @return
     */
    public int countPrimesOptimized(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        // Check from 2 to n-1
        for (int j = 2; j < n; j++)
            if (n % j == 0)
                return false;

        return true;
    }

    private static boolean isPrimeOptimized(int n) {
        if (n <= 1)
            return false;
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }
}
