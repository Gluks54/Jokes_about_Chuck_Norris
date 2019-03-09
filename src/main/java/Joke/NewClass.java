package Joke;

public class NewClass {
    public static int gcd(int m, int k) {

//        System.out.println("First number:");
//        Scanner scanner = new Scanner(System.in);

//        int k =  scanner.nextInt();
//        scanner.nextLine();

//        System.out.println("Second number:");
//        int m = scanner.nextInt();
//        scanner.nextLine();

        // In order to state a simple, elegant loop invariant,
        // we keep the formal arguments constant and use
        // local variables to do the calculations.
        // loop invariant: GCD(K,M) = GCD(k,m)
        while (k != m) {
            if (k > m)
            { k = k-m; }
            else
            { m = m-k; }
        }
        // At this point, GCD(K,M) = GCD(k,m) = GCD(k,k) = k
        return k;
}}
