import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] arg) {

        Folder folder1 = new Folder("Work");
        DBHelper.save(folder1);

        Folder folder2 = new Folder("Homework");
        DBHelper.save(folder2);

        File file1 = new File("pirate", ".java", 100, folder1);
        DBHelper.save(file1);

        File file2 = new File("pizza_shop", ".rb", 50, folder1);
        DBHelper.save(file2);

        File file3 = new File("caraoke", ".txt", 1200, folder2);
        DBHelper.save(file3);


    }

}
