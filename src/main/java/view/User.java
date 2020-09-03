package view;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class User {
    private int gameCount;
    private String[] names;

    public User(String[] names, int gameCount) {
        this.names = names;
        this.gameCount = gameCount;
    }

    public String[] getNames() {
        return names;
    }
}
