package listings;
import java.lang.Math;
import java.util.Arrays;

public class Listings {
    public static String binary(int N) {
        if (N == 0) return "0";
        int lgn = (int) (Math.log(N) / Math.log(2));
        char[] bits = new char[lgn + 1];
        do {
            bits[lgn--] = (char) (N % 2 + '0');
            N /= 2;
        } while(N > 0);

        return String.valueOf(bits);
    }

    public static int euclid(int a, int b) {
        int r;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static boolean[] erathostenes(int N) {
        boolean[] is_prime = new boolean[N + 1];
        Arrays.fill(is_prime, true);
        is_prime[0] = is_prime[1] = false;

        for (int i = 2; i <= N; i++) {
            if (is_prime[i] && i * i <= N) {
                for (int j = i * i; j <= N; j += i) {
                    is_prime[j] = false;
                }
            }
        }

        return is_prime;
    }

    public static int f1(int N) {
        return (N*N + N) / 2;
    }

    public static int f2(int N) {
        int s = 0;
        for(int i = 0; i <= N; i++) 
            s += i;
        return s;
    }
    
    public static int f3(int N) {
        int s = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                s++;
            }
        }
        return s;
    }

}
