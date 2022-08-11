package MyOwnTry.Core.Group;

import MyOwnTry.Core.User.BaseUser;

import java.util.ArrayList;
import java.util.List;

public class Group<B extends BaseUser> {
    private String chatName;
    private List<B> users;

    public Group(String chatName) {
        this.chatName = chatName;
        this.users = new ArrayList<>();
    }

    public void add(B b) { // Why i can't parameterize base hero?
        users.add(b);
    }

    public B getByName(String name) {
        return null;
    }

    public B getById(int id) {
        return null;
    }

    public int getCount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.chatName, this.users);
    }
}
