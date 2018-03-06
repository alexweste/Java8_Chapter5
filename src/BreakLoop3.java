// Primenenie operatora break  vo vlojennyh ciklah
public class BreakLoop3 {
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            System.out.print("Prohod " + i +": ");
            for(int j=0; j<100; j++){
                if(j == 20) break; // vyhod iz cikla, kogda j budet ravnym 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Cikly zaversheny.");
    }
}
