package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class File {

    private int id;
    private String name;
    private String extension;
    private int size;
    private Folder folder;

}
