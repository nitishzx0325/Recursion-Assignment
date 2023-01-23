public class RemoveX {
    
    public static String remove(String str){
        if(str.length()==0){
            return str;
        }
        if(str.charAt(0)=='x'){
            return ""+remove(str.substring(1));
        }
        return str.charAt(0)+remove(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(remove("xaxb"));
    }
}
