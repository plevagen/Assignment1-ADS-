public class sixthTask {
    public static int exponent(int a, int n){
        if(n == 0) {
            return 1;
        }
        else{
            return a * exponent(a, n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(exponent(2, 0));
    }
}
