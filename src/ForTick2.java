// Primer, gde peremennaya cikla for zadaetsya v samom cikle
public class ForTick2 {
     public static void main(String[] args){
         int a = 0, b = 0, c =0;

         for(int n = 0; n<10; n++){
             a = a + n;
             b = b + 2 * n;
             c = c + (b - a);
         }
         System.out.println("Summa ravna: " + c);
     }
}
