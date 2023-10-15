package oct15;

public class SutdaDeck {
    //덱의 카드 수를 상수로 정의
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];//sutdacar 객체 배열을 선언하고, 덱의 크기인 card_num으로 초기화

    SutdaDeck(){//메서드 생성
        for(int i=0; i<cards.length; i++){
            int num = i % 10+1;//1부터 10까지의 숫자를 반복
            //광 여부를 판별. i가 1-보다 작고, num이 1,3,8일때 광으로 설정
            boolean isKwang = (i<10)&&(num==1||num==3||num==8);

            cards[i] = new SutdaCard(num,isKwang);//sutdacard 객체를 생성하고 배열에 저장
        }
    }

}


