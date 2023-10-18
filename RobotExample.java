package oct18;

public class RobotExample {
    public static void action(Robot r){//action 메서드 선언 robot을 인자로 받아서 로봇 타입을 확인하고 해당동작을 수행
        if(r instanceof DanceRobot){
            DanceRobot dr = (DanceRobot)r;//r 을 DanceRobot으로 형변환
            dr.dance();//DanceRobot의 dance 메서드 호출
        }else if(r instanceof SingRobot){
            SingRobot sr = (SingRobot)r;//r을 SingRobot으로 형변환
            sr.sing();//SingRobot의 sing 메서드 호출
        }else if(r instanceof DrawRobot){
            DrawRobot dr = (DrawRobot)r;//r을 DrawRobot으로 형변환
            dr.draw();//DrawRobot의 draw 메서드 호출
        }
    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};//로봇 객체를 배열에 저장

        for(int i =0; i<arr.length; i++)
            action(arr[i]);//for문으로 action 메서드 호출하여 로봇 동작 실행
    }
}
