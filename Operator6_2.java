public class Operator6_2 {
    public static void main(String[] args) {
        String s1 = "사랑";
        String s2 = "사랑";

        System.out.print("s1 == s2 = "); // true
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // true

        String s3 = new String("사랑");
        System.out.print("s1 == s3 = ");
        System.out.println(s1 == s3); // false
        System.out.println("s1.equals(s3) = " + s1.equals(s3)); // true
        // 참조형 변수에서 ==은 두 변수의 주소를 비교하기에 s1 == s3은 false임
        // equals()라는 메소드가 따로 있는 이유도 이것 때문임
    }
}
