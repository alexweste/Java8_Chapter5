// programma opredeleniya prinadlejnosti mesyatsa k vremeni goda
class Switch {
    public static void main(String[] args){
        int month = Integer.valueOf(args[0]);
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "zime";
                break;
            case 3:
            case 4:
            case 5 :
                season = "vesne";
                break;
            case 6:
            case 7:
            case 8:
                season = "letu";
                break;
            case 9:
            case 10:
            case 11:
                season = "oseni";
                break;
            default:
                season = "vymyshlennym mesyatsam";
                        }
        System.out.println("Mesyats nomer " + month + " otnositsya k " + season + ".");
    }
}
