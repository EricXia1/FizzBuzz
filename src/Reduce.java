public class Reduce {
    public static void main(String[] args) {
        doReduce(100);
    }
    private static void doReduce(int n){
        int count = 0;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
                count++;
            }
            else {
                n--;
                count++;
            }
        }
        System.out.println(count);
    }
}
