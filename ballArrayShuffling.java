public class ballArrayShuffling {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for(int i=0; i<ballArr.length; i++){
            int j =(int)(Math.random() *ballArr.length);//무작위로 j생성
            int tmp = 0;

            tmp =ballArr[i];//i의 요소를 임시변수 tmp에 저장
            ballArr[i] = ballArr[j];//현재 i의 요소와 무작위로 선택한 j의 요소를 교환
            ballArr[j] = tmp; //교환된 요소를 임시 변수 tmp를 사용하여 다시 복원
        }

        //배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사
        System.arraycopy(ballArr, 0 , ball3, 0 ,3);
        for(int i=0;i<ball3.length; i++) {
            System.out.println(ball3[i]);
        }
        System.out.println();
    }
}
