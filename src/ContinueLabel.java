// Primenenie operatora continue s metkoy
class ContinueLabel {
    public static void main(String[] args){
        outer: for(int i=0; i<10; i++){
            for(int j=0; j<10; j++) {

                if(j > i) {
                  System.out.println();
                  continue outer; // preryvaetsya cikl for(j), kompilyator perehodit k nachalu
                                  // cikla for(i)
                }
                System.out.print(" " + (i * j));
            }

        }
        System.out.println();
    }
}
