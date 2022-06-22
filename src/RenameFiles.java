import java.io.File;
public class RenameFiles {
    public void Rename(File sourceFolder,File destinationFolder, String tvShowName, String releaseYear, String sXeX, String extension){
        if (sourceFolder.isDirectory() && destinationFolder.isDirectory()){
            System.out.println("Renomeando arquivos! Aguarde...");

            File[] fileList = sourceFolder.listFiles();
            for(int i = 0; i < fileList.length; i++){
                fileList[i].renameTo(new File(destinationFolder.getPath() + "\\" +  releaseYear + ".mp4"));
            }
        }else{
            System.out.println("Folder not found!");
        }
    }
}
