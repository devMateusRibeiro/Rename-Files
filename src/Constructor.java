import javax.swing.*;
import java.io.File;

public class Constructor {
    public static void main(String[] args) {
        RenameFiles renameFiles = new RenameFiles();

        String teste = "a";

        File sourceFolder = new File(JOptionPane.showInputDialog("Pasta de origem: "));
        File destinationFolder = new File(JOptionPane.showInputDialog("Pasta de destino: "));

        renameFiles.Rename(sourceFolder,destinationFolder, teste,teste,teste,teste);
    }
}
