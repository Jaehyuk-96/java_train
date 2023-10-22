package oct22;

import java.awt.*;

public abstract class Shape {
    Point p;//도형의 위치를 나타내는 point 객체

    Shape(){
        this(new Point(0,0));//point(0,0)으로 초기화
    }

    Shape(Point p){
        this.p = p;//매개변수로 받은 위치로 초기화
    }

    abstract double calcArea();//도형의 넓이 계산하는 메서드

    Point getPosition() {//도형의 현재 위치를 반환하는 메서드
        return p;
    }

    void setPosition(Point p){//도형의 위치를 설정하는 메서드
        this.p =p;
    }

}


