package oct15;

public class SutdaDeck1 {
    //덱의 카드 수를 상수로 정의
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];//sutdacar 객체 배열을 선언하고, 덱의 크기인 card_num으로 초기화

    SutdaDeck1(){//메서드 생성
        for(int i=0; i<cards.length; i++){
            int num = i % 10+1;//1부터 10까지의 숫자를 반복
            //광 여부를 판별. i가 1-보다 작고, num이 1,3,8일때 광으로 설정
            boolean isKwang = (i<10)&&(num==1||num==3||num==8);

            cards[i] = new SutdaCard(num,isKwang);//sutdacard 객체를 생성하고 배열에 저장
        }
    }

    void shuffle() {//카드를 섞는 메서드 생성
        for(int i =0; i<cards.length;i++){
            int j = (int)(Math.random()*cards.length);//math.random()을 사용하여 배열크기를 곱하여 인덱스 j를 생성

            //cards[i]와 cards[j]의 값을 서로 바꿈
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard pick(int index) {
        //지정된 인덱스에 있는 카드를 선택하여 반환함.
        if(index <0 || index >= CARD_NUM)//index의 유효성 검사
            return null;
        return cards[index];
    }

    SutdaCard pick(){
        //무작위로 카드를 선택하여 반환
        int index = (int)(Math.random()*cards.length);
        return pick(index); // pick(int index)를 호출한다.
    }

}


