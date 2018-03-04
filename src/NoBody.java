// Programma s pustym telom cikla, vychislyaet srednee mejdu dvumya celymi chislami
public class NoBody {
    public static void main(String[] args){
        int i = Integer.valueOf(args[0]);
        int j = Integer.valueOf(args[1]);
        // rasschityvaem srednee znachenie
        while(++i < --j); // u cikla otsutstvuet telo cikla
        System.out.println("Srednee znachenie ravno: " + i);

    }
}
