package oct15;

public class Tv extends Product{
    //Tv 클래스는 Product 클래스를 상속
    Tv() {
        //디폴트 생성자: 아무 초기화 작업을 수행x
    }


    public String toString() {
        //toString() 메서드를 오버라이딩해서"Tv" 문자열 반환
        return "Tv";
    }
}
