public class Operator1_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // 단항 연산자(+1 -2 ...)는 이항 연산자(1+2, 3-2 ...)보다 우선순위가 높음
        System.out.print("-x + 3 = ");
        System.out.println(-x + 3); // -10 + 3 = -7

        System.out.print("x + 3 * y = ");
        System.out.println(x + 3 * y); // 10 + 3 * 20 = 70

        //관계 연산자(>, <, != ...)는 이항연산자보다 우선순위가 낮음
        System.out.print("x + 3 > y - 2 = ");
        System.out.println(x + 3 > y - 2); // false
        System.out.print("x + 3 < y - 2 = ");
        System.out.println(x + 3 < y - 2); // true

        //논리 연산자(&&, || ...)는 관계연산자보다 우선순위가 낮음
        System.out.print("x > 3 && y < 2 = ");
        System.out.println(x > 3 && y < 2);// false

        //대입 연산자(a = 1 ...)는 우선순위가 가장 낮음
        int result = x + y * 3;
        System.out.println("result = " + result);
    }
}
