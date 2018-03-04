// Programma proveryaet chislo - yavlyaetsa li ono prostym chislom ili net
public class FindPrime {
    public static void main(String[] args){
        int num;
        boolean isPrime;

        num = 9;
        if(num < 2) isPrime = false;
        else isPrime = true;

        for(int i = 2; i <= num/i; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Prostoe chislo");
        else System.out.println("Ne prostoe chislo");
    }
}
