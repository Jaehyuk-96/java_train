package chapter.ch3;

import java.util.Scanner;

public class Excercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int num = scanner.nextInt();

        System.out.println(num >0 ? "양수" : num<0 ?"음수": 0);
    }
}
