public class While {
    public static void main(String[] args){
        int n = Integer.valueOf(args[0]);
        while(n > 0) {
            if(n < 5){
                System.out.println("chislo menshe 5");
            }
            else
                System.out.println("chislo ravno: " + n);
            n--;
        }
    }
}
