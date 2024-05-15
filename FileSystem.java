package design_pattern_codes;

import java.util.ArrayList;
import java.util.List;

// Component interface
interface FileSystemComponent {
    int getSize();
}

// Leaf class representing a file
class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}

// Composite class representing a folder
class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}

public class FileSystem {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);

        // Create subfolder and add files to it
        Folder subfolder = new Folder("Subfolder");
        subfolder.addComponent(file1);
        subfolder.addComponent(file2);

        // Create root folder and add subfolder to it
        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(subfolder);

        // Get size of root folder
        int rootSize = rootFolder.getSize();
        System.out.println("Size of root folder: " + rootSize);
    }
}
