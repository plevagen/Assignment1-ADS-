class fifthTask {
    public static int fibonacchi(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fibonacchi(n-1) + fibonacchi(n-2);
        }
    }
    public static void main(String[] args){
        System.out.println(fibonacchi(17));
    }
}
