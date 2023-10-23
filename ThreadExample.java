package oct23;

public class ThreadExample {
    public static void main(String[] args) {
        final int VALUE = 10;//상수 value를 10으로 초기화

        Thread t = new Thread(new Runnable(){//새로운 스레드 생성
            public void run(){
                for(int i=0; i< 10; i++){
                    try{
                        Thread.sleep(1*1000);//1초동안 스레드를 일시 정지
                    }catch(InterruptedException e){//스레드가 일시중지되는 동안 발생한 예외 처리

                    }
                    System.out.println(VALUE);//Value 출력
            }
        }
    });

t.start();//새스레드 시작
        System.out.println("main() - 종료.");
}
}
