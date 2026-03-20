class firstTask{
    public static void printDigits(int n){
        if(n < 10){
            System.out.println(n);
            return;
        }
        else{
            printDigits(n / 10);
            System.out.println(n % 10);
        }
    }
    public static void main(String[] args){
        printDigits(5481);
    }
}