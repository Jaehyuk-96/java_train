public class FinallyTtryCatch {
    public static void main(String[] args) {
        try{
            int x = 5;
            int y = 20;//(5-x);
            System.out.println(y);
        }catch (ArithmeticException e) {//run time exception
            System.out.println("==>0으로 나눴나 확인");
        }finally{
            System.out.println("항상실행");
        }
    }
}
