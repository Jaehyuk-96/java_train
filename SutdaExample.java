package oct15;

public class SutdaExample {
    public static void main(String[] args) {
        //SutdaDeck 객체를 생성
        SutdaDeck deck = new SutdaDeck();

        //덱에 있는 카드 출력
        for(int i=0;i<deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");
    }
}
