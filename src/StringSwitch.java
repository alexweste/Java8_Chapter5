/*V programme pokazyvaetsya primer ispolzovaniya simvolnyh strok
 dlya upravleniya operatorom switch
  */
class StringSwitch {
    public static void main(String[] args){
        String str = "chetyre";
        switch(str) {
            case "odin":
                System.out.println("один");
                break;
            case "dva":
                System.out.println("два");
                break;
            case "tri":
                System.out.println("три");
                break;
            default:
                System.out.println("ne sovpalo");
                break;
        }
    }
}
