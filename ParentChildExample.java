package oct15;

public class ParentChildExample {
    public static void main(String[] args) {
        Child c = new Child();//객체생성
        System.out.println("x="+c.getX());//child 클래스의 getX()메서드를 호출
    }// Child() -> Child(int x) ->  Parent() -> Parent(int x) -> Object()순서로 호출
}
