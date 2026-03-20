public class eightTask {
    public static String isAllDigit(String s){
        if(s.isEmpty()){
            return "Yes";
        }
        if(!Character.isDigit(s.charAt(0))){
            return "No";
        }
        else{
            return isAllDigit(s.substring(1));
        }
    }
    public static void main(String[] args){
        System.out.println(isAllDigit("123e56"));
    }
}
