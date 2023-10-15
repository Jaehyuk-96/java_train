package oct15;

public class SutdaExample1 {
    public static void main(String args[]) {
        SutdaDeck1 deck = new SutdaDeck1();//객체 생성
            System.out.println(deck.pick(0));//특정인덱스 0에있는 카드를 선택하고 출력
            System.out.println(deck.pick());//무작위로 카드를 선택하고 출력
            deck.shuffle();//카드 덱을 섞음
        for(int i=0; i < deck.cards.length;i++)//섞인 카드 덱을 출력
            System.out.print(deck.cards[i]+",");
            System.out.println();
            System.out.println(deck.pick(0));//특정 인덱스0에 있는 카드를 선택하고 출력
    }
}