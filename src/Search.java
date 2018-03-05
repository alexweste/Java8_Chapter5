//Poisk v massive s primeneniem cikla for v stile for each
class Search {
    public static void main(String[] args){
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4};
        int val = Integer.valueOf(args[0]);
        boolean found =false;

        /*ispolzovat cikl for v stile for each dlya
        poiska znacheniya peremennoy val v massive nums
         */
        for(int x : nums) {
            if(x == val) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Znachenie naydeno!");
        else System.out.println("Takogo znacheniya net!");
    }
}
