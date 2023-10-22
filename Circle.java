package oct22;

import java.awt.*;

public class Circle extends Shape{
    double r;//원의 반지름

    Circle(double r){
        this(new Point(0,0),r);//반지름을 받는 생성자
    }

    Circle(Point p, double r) {//위치와 반지름을 받는 생성자
        super(p);//Shape 클래스의 생성자를 호출하여 위치 초기화
        this.r = r;//원의 반지름 초기화
    }

    double calcArea() {//원의 넓이를 계산하는 메서드
        return Math.PI *r *r;// 원의 넓이를 공식을 사용하여 반환
    }
}
