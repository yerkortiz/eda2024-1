import DArray.*;

public class Main {
    public static void main (String[] args) throws Exception {
        DArray<Integer> a = new DArray();              
        System.out.println(a.size());
        a.append(5);
        a.append(7);
        System.out.println(a.size());
        a.append(5);
        a.append(7);
        System.out.println(a.size());
        
        for (int i = 0; i < a.size(); i++) {
            System.out.printf("%d ", a.getAt(i));
        }
    }
}
