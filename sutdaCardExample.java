public class sutdaCardExample {
    public static void main(String args[]) {
    SutdaCard card1 = new SutdaCard(3, false);
    SutdaCard card2 = new SutdaCard();
    System.out.println(card1.info()); // 3이 출력된다
    System.out.println(card2.info()); // 1K가 출력된다
}
}
class SutdaCard {
    int num;//숫자를 나타내는 변수
    boolean isKwang;//광 여부를 나타내는 변수
    SutdaCard() {
        this(1, true); //매개변수가 없는 생성자에서 다른생성자를 호출하여 초기화
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num; //숫자 초기화
        this.isKwang = isKwang; //광 여부 초기화
    }
    String info() { // 숫자와 광 여부에 따라 문자열을 생성하여 반환함
        return num + ( isKwang? "K" : "");// 광인 경우 k를 덧붙임
    }
}
