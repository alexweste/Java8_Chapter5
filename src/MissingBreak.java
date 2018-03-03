// ispolzovanie operatora switch c odnim operatorom break
class MissingBreak {
    public static void main(String args[]){
        for(int i=Integer.valueOf(args[0]); i<17; i++)
            switch(i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i menshe 10");
                    break;
                default:
                    System.out.println("i ravno ili bolshe 10");
            }
    }
}
