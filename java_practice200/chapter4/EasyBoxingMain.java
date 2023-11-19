import java.util.ArrayList;

public class EasyBoxingMain {
    public static void main(String[] args) {
        int intNm1 = 123;
        long longNum1 = 345L;
        double doubleNum = 123.123;// 기본 타입에 값대입
        Integer intWrap1 = intNm1;
        Long longWrap1 = longNum1;
        Double doubleWrap1 = doubleNum;//기본타입에 저장된 값을 랩퍼 클래스 타입의 객체에 저장(박싱) 랩퍼 클래스 객체를 생성하는것과같음
        double dd = doubleWrap1;// 랩퍼클래스를 기본으로 저장
        //기본타입 <--> Wrapper는 캐스팅 없이 사용
        Integer intWrap2 = intNm1;
        intNm1 = intWrap2;
        System.out.println(intNm1);

        ArrayList<Integer> ilists = new ArrayList<>();// list에 저장
        ilists.add(new Integer(3));//3 저장
        ilists.add(5);//new Integer(5)저장
        int a = ilists.get(0); //<Integer> 0번값을 반환
        System.out.println(a);

        int b = Integer.parseInt("123");//숫자타입 문자열 "123"을 123으로 변환
        System.out.println(b);
    }
}
