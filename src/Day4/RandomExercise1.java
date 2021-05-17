package Day4;

public class RandomExercise1 {
    public static void main(String[] args) {
        System.out.println(returnSum(6));
    }
    public static int returnSum(int n){
        if(n==1){
            return 1;
        }
        return n+returnSum(n-1);
    }
}
