public class ninthTask {
    public static int countOfCharacters (String s){
        if(s.isEmpty()){
            return 0;
        }
        else{
            return 1 + countOfCharacters(s.substring(1));
        }
    }
    public static void main(String[] args){
        System.out.println(countOfCharacters("operating system"));
    }
}
