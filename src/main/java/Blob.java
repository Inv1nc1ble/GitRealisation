
public class Blob {

    private String name;
    private byte[] data;
    private Tree parentTree;

    public Blob(String name, Tree parentTree, byte[] data) {
        this.name = name;
        this.parentTree = parentTree;
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }
}
