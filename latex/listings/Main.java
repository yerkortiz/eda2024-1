import listings.*;
public class Main{
    public static void main(String[] args) {
        System.out.println(Listings.binary(6));
        System.out.println(Listings.binary(2));
        System.out.println(Listings.binary(1));
        System.out.println(Listings.binary(0));
        

        System.out.println(Listings.euclid(8, 4));
        System.out.println(Listings.euclid(9, 4));
     
        boolean[] primes = Listings.erathostenes(25);
        for(int i = 0; i < primes.length; i++) 
            if (primes[i] == true)
                System.out.println(i);


        System.out.println(Listings.f1(5));
        System.out.println(Listings.f2(5));
        System.out.println(Listings.f3(5));
    }
}
