package oct22;

import java.awt.*;

public class Rect extends Shape{
    double width;
    double height;

    Rect(double width, double height) {//직사각형의 너비와 높이를 받는 생성자
        this(new Point(0,0), width, height);
    }

    Rect(Point p, double width, double height){//위치와 직사각형의 너비, 높이를 받는 생성자
        super(p);//Shape 클래스의 생성자를 호출하여 위치 초기화
        this.width = width;//직사각형의 너비 초기화
        this.height = height;//직사각형의 높이 초기화
    }

    boolean isSquare(){//직사각형이 정사각형인지 여부를 확인하는 메서드
        return width*height !=0 && width==height;
    }

    double calcArea(){//직사각형의 넓이를 계산하는 메서드
        return width * height;
    }
}
