import java.io.File;
import java.util.LinkedList;

/**
 * Created by eglaz on 20.05.18.
 */
public class Folder {
    private final File folderFile;

    public Folder(String folderFullName) {
        folderFile = new File(folderFullName);
    }

    public Folder[] getSubFolders() {
        Folder[] folderArray;
        File[] arrayOfFiles = folderFile.listFiles();
        LinkedList<Folder> listOfFolders = new LinkedList<Folder>();
        for (File file : arrayOfFiles) {
            if (file.isDirectory()) {
                Folder folder = new Folder(file.getAbsolutePath());
                listOfFolders.add(folder);
            }
        }
        return listOfFolders.toArray(new Folder[listOfFolders.size()]);
    }

    public LinkedList<File> getFiles() {
        File[] arrayOfFiles = folderFile.listFiles();
        LinkedList<File> listOfFiles = new LinkedList<File>();
        for (File file : arrayOfFiles) {
            if (file.isFile()) {
                listOfFiles.add(file);
            }
        }
        return listOfFiles;
    }
}
