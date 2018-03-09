/*Primenenie operatora break v kachestve civilizovannoy
formy operatora goto*/
 class Break {
     public static void main(String[] args){
         boolean t = true;

         first: {
             second: {
                 third: {
                     System.out.println("Predshestvuet operatoru break.");
                     if(t) break second; // vyhod iz bloka second
                     System.out.println("Etot operator ne budet vypolnyatsya");
                 }
                 System.out.println("Etot operator ne budet vypolnyatsya");
             }
             System.out.println("Etot operator sleduet za blokom second.");
         }
     }
}
