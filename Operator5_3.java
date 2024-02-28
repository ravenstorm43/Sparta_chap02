public class Operator5_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.print("x를 y로 나눈 몫 = ");
        System.out.println(x / y); // 1

        System.out.print("x를 y로 나눈 나머지 = ");
        System.out.println(x % y);

        // 나머지는 부호 구분이 없음
        int n = 3;
        int z = -3;
        System.out.println("x % n = " + x % n);
        System.out.println("x % n = " + x % z);
    }
}
