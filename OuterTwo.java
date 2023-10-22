package oct22;

public class OuterTwo {
    int value = 10;//Outertwo의 멤버변수

    class Inner {
        int value = 20;//Inner의 멤버변수

        void method1() {
            int value = 30;//method1() 메서드 내에서 선언된 로컬 변수

            System.out.println(value);//로컬 변수 값
            System.out.println(this.value);//Inner클래스의 멤버변수
            System.out.println(OuterTwo.this.value);//Outertwo의 멤버변수
        }
    }
}
