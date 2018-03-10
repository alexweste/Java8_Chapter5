//Eta programma soderjit oshibku svyazannuyu s rabotoy operatora break
class BreakErr {
    public static void main(String[] args){
        one: for(int i=0; i<3; i++) {
            System.out.print("Prohod " + i + ": ");
        }
        /*for(int j=0; j<100; j++) {
            if(j == 10) break one; // OSHIBKA!
            System.out.print(j + " ");
        }*/
    }

}
