import java.io.File;
import java.util.List;

public class Tree {

    private String name;
    private Commit parentCommit;
    private Tree parentTree;
    private Tree childTree;
    private List<File> fileList;

    public Tree(String name) {
        this.name = name;
    }

    public void setParentCommit(Commit parentCommit) {
        this.parentCommit = parentCommit;
    }

    public void setParentTree(Tree parentTree) {
        this.parentTree = parentTree;
    }

    public Commit getParentCommit() {
        return parentCommit;
    }

    public Tree getParentTree() {
        return parentTree;
    }

    public Tree getChildTree() {
        return childTree;
    }

    public List<File> getFileList() {
        return fileList;
    }
}
