package chapter.ch3;

public class Excercise3_9 {
    public static void main(String[] args) {
        char ch ='z';
        boolean b = ('a' <= ch&& ch <= 'z') || ('A' <= ch && ch <= 'z')||('0'<= ch && ch<='9');

        System.out.println(b);
    }
}
