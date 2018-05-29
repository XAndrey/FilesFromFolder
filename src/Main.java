import java.io.File;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Временно, для теста github'а
        System.out.println("Тест GitHub-интеграции.");
        //Инициализация входных параметров:
        Folder folder=new Folder("/mnt/WinData/Temp/FolderContentTask");
        String filename ="testfile";
        //Проверка начальных данных:
        //System.out.println("Files in folder: "+folder.getFiles());
        //System.out.println("Folders in folder: "+folder.getSubFolders());

        //Запуск класса-решателя:
        Doner doner=new Doner();
        LinkedList<File> list=doner.Find(folder, filename);
        System.out.println(list);
    }

}
