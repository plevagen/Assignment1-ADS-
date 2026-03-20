class thirdTask {
    public static boolean primeCheck(int n, int i){
        if(n < 2){
            System.out.println("neither");
            return false;
        }
        if(n == 2){
            System.out.println("prime");
            return true;
        }
        if(n % i == 0){
            System.out.println("composite");
            return false;
        }
        if(i * i > n){
            System.out.println("prime");
            return true;
        }
        return primeCheck(n, i + 1);
    }
    public static void main(String[] args){
        System.out.println(primeCheck(7, 2));
    }
}
