// Prostoy primer operatora switch
class SampleSwitch {
    public static void main(String[] args){
        for(int i = Integer.valueOf(args[0]); i<15; i++)
            switch(i) {
                case 0:
                    System.out.println("i ravno nulu.");
                    break;
                case 1:
                    System.out.println("i ravno edinice");
                    break;
                case 2:
                    System.out.println("i ravno dvum");
                    break;
                case 3:
                    System.out.println("i ravno trem");
                    break;
                case 4:
                    System.out.println("i ravno chetyrem");
                    break;
                case 5:
                    System.out.println("i ravno pyati");
                    break;
                case 6:
                    System.out.println("i ravno shesti");
                    break;
                case 7:
                    System.out.println("i ravno semi");
                    break;
                case 8:
                    System.out.println("i ravno vosmi");
                    break;
                case 9:
                    System.out.println("i ravno devyati");
                    break;
                default:
                    System.out.println("i bolshe devyati.");

            }
    }
}
