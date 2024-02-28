public class Operator6_1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 6;
        char c1 = 'A', c2 = 'B';

        System.out.print("n1 >= n2 = ");
        System.out.println(n1 >= n2); // true
        System.out.print("n1 <= n2 = ");
        System.out.println(n1 <= n2); // false

        System.out.print("n1 == n2 = ");
        System.out.println(n1 == n2); // false
        System.out.print("n1 != n2 = ");
        System.out.println(n1 != n2); // true

        System.out.print("c1 < c2 = ");
        System.out.println(c1 < c2); // A(65) < B(66) true
        System.out.print("c1 > c2 = ");
        System.out.println(c1 > c2); // A(65) > B(66) false
    }
}
