public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";

        try{
            int a = Integer.parseInt(nNum);
            System.out.println(a);
        }catch(NumberFormatException e){//숫자 포멧이 아니면 예외발생
            System.out.println("int인지 확인");
            System.out.println(e.getMessage());// 메시지 출력
        }catch(Exception e){
            System.out.println("제대로 확인");//다른 예외 처리
        }finally{
            System.out.println("무조건 실행");//예외 발생 하거나 안하거나 반드시 실행
        }
    }
}
