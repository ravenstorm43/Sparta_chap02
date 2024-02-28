public class Operator4_2 {
    public static void main(String[] args) {
        char ch = '2';

        //문자 '2'는 아스키 코드값 50
        //char타입은 int타입보다 메모리가 작기에 메모리가 큰 int로 변환
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0');

        int a = 1_000_000;
        int b = 2_000_000;

        System.out.println(a*b); // int값 * int값 = int값
        // 하지만 1백만*2백만은 int범위 밖임
        long l = (long)a * b;
        //long타입은 int타입보다 메모리가 크기에 b는 long으로 암묵적인 형변환을 함
        System.out.println("l = " + l);
    }
}
