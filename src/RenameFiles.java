import java.io.File;
public class RenameFiles {
    public static void main(String[] args) {
        //String sourace teste = "C:/Users/conta/Desktop/serie";
        String[] lista;
        File file = new File("C:/Users/conta/Desktop/serie");

        lista = file.list();
        System.out.println(lista[1]);
    }
}
