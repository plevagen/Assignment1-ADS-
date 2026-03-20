class secondTask {
    public static double elementsSum(int[] arr, int n){
        if(n <= 0){
            return 0;
        }
        else{
            return elementsSum(arr, n - 1) + arr[n-1];
        }
    }
    public static double elementsAverage(int[] arr, int n){
        return elementsSum(arr, n) / n;
    }
    public static void main(String[] args){
        int[] arr2 = {3, 2, 4, 1};
        System.out.println(elementsAverage(arr2, 4));
    }
}
