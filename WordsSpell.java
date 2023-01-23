public class WordsSpell {
    
   static  String spell[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void word_spell(int n){
        if(n==0){
            return;
        }
        int last=n%10;
        int rem=n/10;
        word_spell(rem);
        System.out.println(spell[last]+" ");
    }
    public static void main(String[] args) {
        int n=124;
        word_spell(n);
    }
}
