import java.util.Scanner;

public class arrayQuestionAnswer {
    public static void main(String[] args) {
        String[][] words = {
                {"chair","의자"}, // words[0][0], words[0][1]
                {"computer","컴퓨터"}, // words[1][0], words[1][1]
                {"integer","정수"} // words[2][0], words[2][1]
        };
        int score = 0; // 맞춘 문제의 수를 저장하기 위한 변수
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<words.length;i++) {
            System.out.printf("Q%d. %s  의 뜻은?", i+1, words[i][0]);//문제 출력
            String tmp = scanner.nextLine(); // 사용자에게 정답 받기
            if(tmp.equals(words[i][1])) {// 사용자가 입력한 답과 정답 비교
                System.out.printf(" 정답입니다.%n%n");
                score++;//맞춘 문제수 증가
            } else {
                System.out.printf(" 틀렸습니다.정답은 %s 입니다.%n%n",words[i][1]);
            }
        } // for
        System.out.printf("전체 %d 문제 중 %d 문제 맞추셨습니다.%n",
                words.length, score);// 맞춘 문제수 출력
    }

}

