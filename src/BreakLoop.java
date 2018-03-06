// primenenie operatora break dlya vyhoda iz cikla
public class BreakLoop {
        public static void main(String[] args){
            for(int i=0; i<100; i++){
                if(i == 10) break; /* vyhod iz cikla, esli znachenie
                                    peremennoy i ravno 10*/
                System.out.println("i: " + i);
            }
            System.out.println("Cikl zavershon. ");
        }
}
