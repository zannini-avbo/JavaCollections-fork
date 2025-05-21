
import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       // test Hello World
       System.out.println("Java Collection Samples!");

       ListaOrdinata<String> lo = new ListaOrdinata<>();
       Tree<String> tree = new Tree<>();

       File file = new File("data/province.txt");
       try (Scanner scan = new Scanner(file)) {
              while (scan.hasNextLine()) {
                  String line = scan.nextLine();
                  lo.add(line);
                  tree.add(line);
              }
       }
       System.out.println(lo);
       System.out.println(tree);

    }
}
