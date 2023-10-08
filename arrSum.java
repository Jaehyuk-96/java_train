public class arrSum {
    public static void main(String[] args) {
        int[] arr = {20,40,60,80,100};
        int sum=0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum ="+ sum);
    }
}
