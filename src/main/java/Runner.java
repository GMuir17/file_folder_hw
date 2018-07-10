import db.DBFolder;
import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] arg) {

        // Setup
        Owner owner = new Owner("Bruce Wayne", "definitely_not_batman_99");
        DBHelper.save(owner);

        Folder folder1 = new Folder("Work", owner);
        DBHelper.save(folder1);

        Folder folder2 = new Folder("Homework", owner);
        DBHelper.save(folder2);

        File file1 = new File("pirate", ".java", 100, folder1);
        DBHelper.save(file1);

        File file2 = new File("pizza_shop", ".rb", 50, folder1);
        DBHelper.save(file2);

        File file3 = new File("caraoke", ".txt", 1200, folder2);
        DBHelper.save(file3);

        File file4 = new File("toBeDeleted", ".jpeg", 10000, folder2);
        DBHelper.save(file4);

        //CRUD tests
        file3.setName("karaoke");
        DBHelper.update(file3);

        DBHelper.delete(file4);

        //OneToMany test
        List<File> folder1Files = DBFolder.getFilesInFolder(folder1);
        List<File> folder2Files = DBFolder.getFilesInFolder(folder2);

    }

}
