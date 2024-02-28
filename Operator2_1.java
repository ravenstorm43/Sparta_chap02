public class Operator2_1 {
    public static void main(String[] args) {
        int k = 0, j = 3;

        // 후위 형
        k = j++;
        System.out.println("k = j++;, k = " + k); // k = 3
        System.out.println("k = j++;, j = " + j); // j = 4
        /* k = j++의 계산 과정
        k = j;
        j++;(j = j + 1)
         */

        //값 초기화
        k = 0;
        j = 3;

        // 전위 형
        k = ++j;
        System.out.println("k = ++j;, k = " + k); // k = 4
        System.out.println("k = ++j;, j = " + j); // j = 4
        /* k = ++j의 계산과정
        ++j;(j = j + 1)
        k = j;
         */
    }
}
