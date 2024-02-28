public class Operator2_2 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println("i = +i; = " + i); // 10

        //'-'연산자는 원래 있던 값의 부호를 바꿈(값을 -로 고정하는것이 아님에 유의!)
        i = -10;
        i = -i;
        System.out.println("i = -i; = " + i); // -10
    }
}
