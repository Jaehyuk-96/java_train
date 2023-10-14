package oct14;

public class FindAbsoluteValue {
    public static int abs(int value){//절대값을 반환하는 메소드 생성
        return value >=0 ? value : -value;//value가 0이상이면 value반환 아니면 -value반환
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value +"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value +"의 절대값:"+abs(value));
    }
}
