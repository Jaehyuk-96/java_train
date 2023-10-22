package oct22;

public class ShapeExample {
    static double sumArea(Shape[] arr){//Shape 배열을 받아 각 도형의 넓이를 합산하는 메서드
        double sum = 0;//초기화

        //배열의 각 요소를 반복하면서 도형의 넓이를 계산하여 더함
        for(int i=0; i<arr.length; i++)
            sum+= arr[i].calcArea();

        return sum;
    }

    public static void main(String[] args) {//배열을 생성하고 도형 객체 추가하고 값 추가
        Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)};
        System.out.println(" :"+sumArea(arr));//넓이 합산하고 출력
    }
}
