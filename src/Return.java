//programmademonstriruet rabotu operatora return
class Return {
    public static void main(String[] args){
        boolean t = true;
        System.out.println("Do vozvrata.");
        if(t) return; // zdes proishodit vozvrat v vyzyvayuschiy kod, v dannom sluchae vypolnenie
                      // programmy zavershaetsya
        System.out.println("Etot operator vypolnyatsa ne budet");
    }
}
