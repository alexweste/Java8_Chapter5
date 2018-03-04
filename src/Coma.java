// Ispolzovanie zapyatoy v operatore cikla for
public class Coma {
    public static void main(String[] args){
        int a, b, c;

        for(a=10, b=10, c=5; a<b || a>c; a++, b--, c = c + 2) {
            System.out.println("a = " + a);
            System.out.println("c = " + c);
        }
    }
}
