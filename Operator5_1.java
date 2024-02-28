public class Operator5_1 {
    public static void main(String[] args) {
        long result = Math.round(3.645678); //1의자리까지 반올림
        System.out.println("result = " + result);

        // 소숫점 넷째자리에서 반올림
        double pi = 3.141592;
        /*
        pi * 1000 = 3141.592
        Math.round(3141.592) = 3142
        3142 / 1000.0 = 3.142
         */
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi); // 3.142

        // 3.142 구하기
        double pi2 = 3.141592;
        System.out.println("(int)(pi2 * 1000 = " + (int) (pi2 * 1000));
        System.out.println("(int)(pi2 * 1000) / 1000.0 = " + (int) (pi2 * 1000) / 1000.0);
    }

}
