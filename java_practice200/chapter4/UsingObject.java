

public class UsingObject {
    public static void main(String[] args) {
        // Object 클래스의 인스턴스를 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 객체의 해시 코드 출력 (10진수 및 16진수 형식)
        System.out.println(obj1.hashCode()); // 10진수
        System.out.println(Integer.toHexString(obj1.hashCode())); // 16진수

        // 두 객체를 비교
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        // 객체를 출력 (기본 toString() 메서드 사용)
        System.out.println(obj1);
        System.out.println(obj2.toString()); // "Class@hashCode()"

        // 객체의 클래스 이름 출력
        System.out.println(obj1.getClass().getName());

        // 클래스 이름과 16진수 해시 코드를 조합하여 출력
        String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
        System.out.println(str); // 클래스 이름@16진수 해시코드

        // Object 클래스의 다형성을 활용하여 String 객체 생성
        Object objStr = new String("Good");
        System.out.println(objStr.toString());

        // instanceof 연산자를 사용하여 객체의 타입 확인
        System.out.println(objStr instanceof Object);
        System.out.println(objStr instanceof String);

        // 문자열 변수의 클래스 이름 출력
        String hello = "hello";
        System.out.println(hello.getClass()); // 클래스 이름
    }
}