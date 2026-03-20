import java.util.Scanner;

public class seventhTask {
    public static void reverse(int n, Scanner sc){
        if(n <= 0){
            return;
        }
        else{
            int cur = sc.nextInt();
            reverse(n-1, sc);
            System.out.println(cur + "");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int count = sc.nextInt();
            reverse(count, sc);
        }
        sc.close();
    }
}
