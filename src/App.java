public class App {
    public static void main(String[] args) throws Exception {

        // test Hello World
        System.out.println("Hello, World!");

        Lista<String> l = new Lista<>();
        l.add("Bologna");
        l.add("Milan");
        l.addHead("Catanzaro");
        System.out.println(l);

        ListaOrdinata<String> lo = new ListaOrdinata<>();
        lo.add("Bologna");
        lo.add("Milan");
        lo.add("Catanzaro");
        lo.add("Atalanta");
        lo.add("Verona");
        lo.add("Napoli");
        lo.add("Brescia");
        lo.add("Zurigo");
        lo.add("Roma");
        System.out.println(lo);
        

        // test MyIntArray
        /*
        MyIntArray a = new MyIntArray();
        for (int i=0; i<10; i++) a.add(i);
        System.out.println(a);
        */
    }
}
