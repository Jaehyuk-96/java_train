package oct23;

import jdk.jfr.Event;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;
public class ChangeEventHandler {


    public static void main(String[] args) {
        Frame f = new Frame();//윈도우 객체생성
        f.addWindowFocusListener(new WindowAdapter(){//윈도우 이벤트 리스너 등록
            public void windowClosing(WindowEvent e){//windowclosing 이벤트 처리
                e.getWindow() .setVisible(false);//window를 보이지 않게 설정
                e.getWindow().dispose();//윈도우를 해제
                System.exit(0);//프로그램 종료
            }
        });

    }
}//익명클래스로 바꾸기


