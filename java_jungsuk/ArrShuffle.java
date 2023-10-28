package oct14;

public class ArrShuffle {
    public static int[] shuffle(int[] arr) {//배열을 무작위로 섞는 메서드
        if(arr==null || arr.length==0)// 배열이 null 이거나 길이가 0이면 그 arr을 그대로 반환
            return arr;

        for(int i =0; i<arr.length;i++) {//배열의 각요소를 무작위로 섞음
            int j = (int)(Math.random()*arr.length);//math.random()을 사용하여 0부터 배열 길이 사이의 난수 j를 생성

            int tmp = arr[i];//배열을 tmp를 사용하여 arr[i]랑 arr[j]를 교환
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;//섞인 배열을 반환
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);// 배열을 섞은후 결과를 출력
        System.out.println(java.util.Arrays.toString(result));
    }
}
