package oct15;

public class Product {
    int price;//가격을 저장하는 인스턴스 변수
    int bonusPoint;//보너스포인트를 저장하는 인스턴스 변수

    Product() {
        //디폴트 생성자 초기화 작업 x
    }

    Product(int price){
        this.price = price;//매개 변수로 받은 가격을 인스턴스 변수에 할당
        bonusPoint = (int)(price/10.0);//가격의 1-%를 보너스 포인트로 설정
    }
}
