public class MemberCallError {
    int iv = 10;//인스턴스 변수
    static int cv = 20;//static변수

    int iv2 = cv;//인스턴스 변수에 정적변수 cv를초기화
    //static int cv2 = iv;//static변수의 초기화에 인스턴스 변수를 사용할 수 없다.

    static void staticMethod1(){
        System.out.println(cv);//정적 메서드에서는 정적변수 사용가능
        //System.out.println(iv);//static메서드에서는 인스턴스 변수를 사용할 수 없다.
    }

    static void staticMethod2(){
        staticMethod1();//정적 메서드에서는 다른 정적 메서드 호출가능
        //instanceMethod1();//static메서드에서는 인스턴스 메서드를 사용할 수 없다.
    }
}
