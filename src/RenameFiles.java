import java.io.File;
public class RenameFiles {
    public void Rename(File sourceFolder,File destinationFolder, String tvShowName, String releaseYear, String season, String extension){
        if (sourceFolder.isDirectory() && destinationFolder.isDirectory()){
            System.out.println("Renomeando arquivos! Aguarde...");

            File[] fileList = sourceFolder.listFiles();
            for(int i = 0; i < fileList.length; i++){
                fileList[i].renameTo(new File(destinationFolder.getPath() + "\\" +  tvShowName + " (" + releaseYear + ") - s" + season + "e" + (i+1) + extension));
            }
        }else{
            System.out.println("Folder not found!");
        }
    }
}
