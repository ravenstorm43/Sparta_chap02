public class Operator7_1 {
    public static void main(String[] args) {
        boolean result1, result2, result3, result4, result5, result6;

        char ch1 = 'a', ch2 = 'B'; // a=97, A=65, B=66, C=67

        result1 = ch1 > 'A' && ch2 < 'C'; // true && true
        result2 = ch1 == 'A' && ch2 < 'C'; // false && true

        result3 = ch1 > 'A' || ch2 < 'C'; // true || true
        result4 = ch1 < 'A' || ch2 > 'C'; // false || false

        System.out.println("&& 연산자에 의한 결과 result1 = " + result1); // true
        System.out.println("&& 연산자에 의한 결과 result2 = " + result2); // false

        System.out.println("|| 연산자에 의한 결과 result3 = " + result3); // true
        System.out.println("|| 연산자에 의한 결과 result4 = " + result4); // false

        System.out.println("! 연산자에 의한 결과 result4 = " + !result4); // true

        System.out.println();

        int num = 10;
        result5 = num % 2 == 0 && num % 3 == 0;
        System.out.println("num 은 2의 배수 그리고 3의 배수 = " + result5); // false

        result6 = num % 2 == 0 || num % 3 == 0;
        System.out.println("num 은 2의 배수 또는 3의 배수 = " + result6); // true
    }
}
