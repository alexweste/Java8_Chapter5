// Programma opredelyaet po nomeru mesyatsa vremya goda
class IfElseIf {
    public static void main(String[] args){
        int month = Integer.valueOf(args[0]);
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "zima";
        else if(month == 3 || month == 4 || month == 5)
            season = "vesna";
        else if(month == 6 || month == 7 || month == 8)
            season = "leto";
        else if(month == 9 || month == 10 || month ==11)
            season = "osen";
        else
            season = "takogo mesyatsa ne byvaet";
        System.out.println("Mesyats №  " + month + " otnositsya k sesonu " + season);
        }

    }

