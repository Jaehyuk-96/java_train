package oct16;

public class FinalSutdaCard {
    final int NUM;//카드의 번호를 나타내는 상수
    final boolean IS_KWANG;//광 여부를 나타내는 상수

    FinalSutdaCard(){
        this(1,true);//기본 생성자에서 NUM 1 로, IS_KWANG을 true로 초기화
    }

    public FinalSutdaCard(int NUM, boolean IS_KWANG) {//생성자에서 NUM과 IS_KWANG 멤버변수를 초기화
        this.NUM = NUM;
        this.IS_KWANG = IS_KWANG;
    }

    @Override
    public String toString() {//문자열로 표현하기위한 toString 메서드정의
        return "FinalSutdaCard{" +
                "NUM=" + NUM +
                ", IS_KWANG=" + IS_KWANG +
                '}';
    }
}
