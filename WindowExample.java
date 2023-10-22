package oct22;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowExample {
    public static void main(String[] args) {
        Frame f = new Frame();//Frame 객체를 생성.
        f.addWindowListener(new WindowAdapter() {//WindowAdapter를 사용하여 창 닫기 이벤트를 처리
        public void windowClosing(WindowEvent e){
            e.getWindow().setVisible(false);//창을 화면에서 숨김
            e.getWindow().dispose();//창 객체가 차지한 메모리 자원을 해제
            System.exit(0);//시스템을 종료
        }});
    }
}
