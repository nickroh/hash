public class main {
    public static void main(String[] args){
        hashmap h = new hashmap();
        h.add("1", 2);
        h.add("2", 3);
        h.add("3", 4);
        h.add("4", 5);
        h.add("5", 6);
        h.add("6", 7);
        h.add("7", 8);
        h.add("11", 9);
        h.add("22", 10);
        h.add("33", 11);
    

        System.out.println(h.get("1"));
        System.out.println(h.get("3"));
        System.out.println(h.get("4"));
        System.out.println(h.get("5"));
        System.out.println(h.get("6"));
        System.out.println(h.get("7"));
        System.out.println(h.get("2"));
        System.out.println(h.get("11"));
        
        System.out.println(h.get("22"));
   
        System.out.println(h.get("33"));
        System.out.println(h.get("44"));
    }
}
