import javax.swing.*;
import java.io.File;

public class Constructor {
    public static void main(String[] args) {
        RenameFiles renameFiles = new RenameFiles();

        File sourceFolder = new File(JOptionPane.showInputDialog("Pasta de origem: "));
        File destinationFolder = new File(JOptionPane.showInputDialog("Pasta de destino: "));
        String tvShowName = JOptionPane.showInputDialog("Nome: ");
        String releaseYear = JOptionPane.showInputDialog("Ano: ");
        String season = JOptionPane.showInputDialog("Temporada: ");
        String extension = JOptionPane.showInputDialog("Tipo: ");

        renameFiles.Rename(sourceFolder, destinationFolder, tvShowName, releaseYear, season, extension);
    }
}
