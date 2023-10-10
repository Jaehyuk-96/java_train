import java.util.Scanner;

public class wordShuffleCorrect {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); //현재 단어를 char배열로 변환
            for (int j = 0; j < question.length; j++) {
                int idx = (int) (Math.random() * question.length);// 현재 문자열 내에서 무작위로 알파베선택

                char tmp = question[i]; //i번째 문자와
                question[i] = question[idx];// 무작위 선택한 idx번째 문자를 교환
                question[idx] = tmp;
            }
            System.out.printf("Q%d. %s의 정답을 입력하세요.>",
                    i + 1, new String(question));//섞인 단어로 문제를 출력
            String answer = scanner.nextLine();//사용자로부터 답을받음

            if (words[i].equals(answer.trim())) // trim() 메서드를 사용하여 입력한 답의 좌우 공백을 제거하고, 정답과 비교
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf(" 틀렸습니다.%n%n");

        }

    }
}