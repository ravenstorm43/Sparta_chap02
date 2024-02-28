public class Operator3_2 {
    public static void main(String[] args) {
//        int i = 3.14f;
        int i = (int)3.14f;
        System.out.println("i = " + i);
        /*int타입 i는 float타입의 3.14f보다 사용하는 메모리가 작다. 따라서 3.14f를 저장하려면
        값 손실을 감수하고 (int)로 명시적 형변환을 해야 한다.
         */

        byte b = 100; // byte b = (byte)100;
        System.out.println("b = " + b);

        /* byte타입 b는 int타입 100보다 사용하는 메모리가 작다.
        하지만 100은 byte의 범위에 포함된다.
        따라서 암묵적인 형변환을 해도 값 손실이 발생하지 않기에
        컴파일러가 스스로 형변환을 한다.
         */

        int num = 100;
        //byte b2 = num; num은 변수다. 항상 -128 ~ 127사이의 값이 오리란 보장이 없다.
        byte b2 = (byte) num; // byte 타입으로 명시적 형변환
        System.out.println("b2 = " + b2);

        //byte b3 = 1000;
        byte b3 = (byte) 1000; // 1000을 byte타입으로 변환하면 오버플로우가 발생해서 -24로 저장됨
        System.out.println("b3 = " + b3);
    }
}

//결론:
//컴파일러는 암묵적인 형변환의 조건
// 1. 값 손실이 발생하지 않는다고 확신할 때(?)
// 2. 메모리가 큰 변수에 메모리가 작은 값을 저장할 때
