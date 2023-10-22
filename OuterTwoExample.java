package oct22;

public class OuterTwoExample {
    public static void main(String[] args) {
        OuterTwo outer = new OuterTwo();//객체를 생성
        OuterTwo.Inner inner = outer.new Inner();//OuterTwo 클래스 내부의 Inner 클래스의 객체를 OuterTwo 객체를 통해 생성
        inner.method1();//inner클래스의 method1() 호출
    }
}
