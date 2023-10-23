package oct23;

public class RuntimeExceptionExample {
    static void method(boolean b){
        try {
            System.out.println(1);
            if(b) throw new ArithmeticException();//b가 true면 Arithmeticexception 던짐
            System.out.println(2);//예외가 발생하면 실행되지 않는 문장
        }catch(RuntimeException r){
            System.out.println(3);//RuntimeException 예외를 처리하고 3 출력
            return; //메서드를 빠져나감(finally 블럭을 수행한 후에)
        }catch(Exception e){
            System.out.println(4);//Exception 예외를 처리하고 "4"출력
            return;
        }finally {
            System.out.println(5);// 예외발생여부에 관계없이 항상 실행되는 문장
        }
        System.out.println(6);//3또는 4출력후 실행됨
    }

    public static void main(String[] args) {
        method(true);//true 전달하여 ArithmeticException이 발생하도록 호출
        method(false);//false 전달하여 예외가 발생하지 않도록 호출
    }
}
