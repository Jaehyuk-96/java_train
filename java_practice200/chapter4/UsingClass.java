import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class UsingClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Class classes = obj1.getClass();//클래스 객체생성
        System.out.println(classes.getName());;//클래스 이름 출력
        System.out.println("------constructor--------");
        Constructor[] constructor = classes.getDeclaredConstructors();//생성자 배열 생성
        for(Constructor con: constructor){
            System.out.println(con.getName());//향상된for문으로 생성자 이름 출력
        }
        System.out.println("--------Method-------");
        Method[] method = classes.getMethods();//메소드 배열 생성
        for(Method me:method){//향상된 for으로 메서드 이름 출력
            System.out.println(me.getName());
        }
    }
}
