package MyOwnTry.Core.ModelUsers.Group;

import MyOwnTry.Core.BaseList.ModelListIterator;
import MyOwnTry.Core.ModelUsers.User.BaseUser;
import MyOwnTry.Core.ModelUsers.User.God;

import java.util.ArrayList;
import java.util.List;

public class Group<B extends BaseUser> extends ModelListIterator<B> {
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

    public int getCount() {
        return 0;
    }

    public void dell(B b) {
        if(new God("f") != b)
        users.remove(0);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", getId(), this.chatName, this.users);
    }
}
