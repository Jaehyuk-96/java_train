package oct18;

public class OuterExample {
    public static void main(String[] args) {
        Outer o = new Outer();//객체 생성
        Outer.Inner li = o.new Inner();//Outer클래스의 내부 클래스 Inner의 객체 li를 Outer객체 o를 사용하여 생성
        System.out.println(li.iv);//Inner의 인스턴스 변수 iv에 접근하여 값을 출력
    }
}
