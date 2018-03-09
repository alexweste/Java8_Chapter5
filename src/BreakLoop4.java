//Primenenie operatora break dlya vyhoda iz vlojennyh ciklov
public class BreakLoop4 {
    public static void main(String[] args){
        outer: for(int i=0; i<3; i++){
            System.out.print("Prohod " + i + ": ");
            first: for(int j=0; j<100; j++){
                if(j == 10) break first; // vyhod iz oboih cijlov
                System.out.print(j + " ");
            }
            System.out.println("Eta stroka ne budet vyvoditsya");
        }
        System.out.println("Cikly zaversheny.");
    }
}
