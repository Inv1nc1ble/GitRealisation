import java.util.ArrayList;
import java.util.List;

public class Tree {
    private String name;
    private Commit parentCommit;
    private Tree childTree;
    private List<Blob> listOfBlobs = new ArrayList<>();

    public Tree(String name) {
        this.name = name;
    }

    public Commit getParentCommit() {
        return parentCommit;
    }

    public void setParentCommit(Commit parentCommit) {
        this.parentCommit = parentCommit;
    }

    public void addTree(String name){
        Tree tree = new Tree(name);
        this.childTree = tree;
    }

    public Tree getChildTree() {
        return childTree;
    }

    public void addBlob(String name, byte[] data){
        listOfBlobs.add(new Blob(name, this, data));
    }

}
