package snippets;
public class Binary {
    public static String DecBin(int N) {
        // division by zero is undefined for log2 calculation
        if (N == 0) 
            return "0";         
        int size = (int) (Math.log(N) / Math.log(2));
        char[] aux = new char[size + 1];
        while(N != 0) {
            aux[size] = (char) ('0' + (N % 2));
            N /= 2;
            size--;
        }
        return String.valueOf(aux);
    }
}
