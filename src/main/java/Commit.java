import java.util.Date;
import java.util.*;

public class Commit {
    final int commitID;

    private String authorName;
    private Date date;
    private String email;

    static List<Commit> commitList = new ArrayList();

    private Commit parentCommit;
    private Tree parentTree;

    public void setParentCommit(Commit parentCommit) {
        this.parentCommit = parentCommit;
    }



    public Commit(String authorName, Date date, String email) {
        this.authorName = authorName;
        this.date = date;
        this.email = email;
        commitID = commitList.size();

        if (!commitList.isEmpty()){
            setParentCommit(commitList.get(commitID - 1));
        }

        commitList.add(this);
    }





}
