import java.io.File;
import java.util.LinkedList;

public class Doner {
    private LinkedList<File> fileList;

    public Doner() {
        this.fileList = new LinkedList<File>();
    }

    public LinkedList<File> Find(Folder folder, String filename) {
        for (File file : folder.getFiles()) {
            if (filename.equals(file.getName()))
                fileList.add(file);
        }

        for (Folder folderIn : folder.getSubFolders()) {
            return Find(folderIn, filename);
        }

        return fileList;
    }
}
