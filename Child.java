package oct15;

public class Child extends Parent{
    int x = 3000;//인스턴스 변수 x

    Child() {//디폴트 생성자
        this(1000); //Child(int x)를 호출 1000으로 설정
    }

    Child(int x) {//매개변수를 받는 생성자
        this.x =x;//인스턴스 변수 x를 전달받은 값으로 설정
    }
}


