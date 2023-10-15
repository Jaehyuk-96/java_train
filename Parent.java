package oct15;

public class Parent {
    int x =100;//인스턴스 변수x
    Parent() {//디폴트 생성자
        this(200);//int x생성자를 호출하여 x를 200으로 설정
    }
    Parent(int x){//매개변수를 받는 생성자
        this.x=x;//인스턴스 변수 x를 전달받은 값으로 설정
    }

    int getX(){
        //x 값을 반환하는 메서드
        return x;
    }
}




