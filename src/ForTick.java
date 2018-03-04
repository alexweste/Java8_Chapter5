// Vychislenie summy n-noy posledovatelnosti (a+bn)/ba
class ForSum {
    public static void main(String[] args)
        throws java.io.IOException{
        int n, a, b, m;
        float c = 0;
        a = Integer.valueOf(args[0]);
        b = Integer.valueOf(args[1]);
        m = Integer.valueOf(args[2]);

        for(n = m; n<20; n++){
            c = c + (a + n * b) / b * a;
        }
        System.out.println("Summa ravna: " + c);

    }
}

