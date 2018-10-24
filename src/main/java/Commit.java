import java.util.Date;
import java.util.*;

public class Commit {
    private final int commitID;

    private final String authorName;
    private final Date date;
    private String email;

    private static List<Commit> commitList = new ArrayList();

    private Commit parentCommit;
    private Tree parentTree;

    public Commit(String authorName, Date date, String email) {
        this.authorName = authorName;
        this.date = new Date();
        this.email = email;
        commitID = commitList.size();

        if (!commitList.isEmpty()){
            setParentCommit(commitList.get(commitID - 1));
        }
        commitList.add(this);
    }

    private void setParentCommit(Commit parentCommit) {
        this.parentCommit = parentCommit;
    }

    public Tree getParentTree() {
        return parentTree;
    }

    public void addTree(String name) {
        Tree tree = new Tree(name);
        tree.setParentCommit(this);
        this.parentTree = tree;
    }
}
