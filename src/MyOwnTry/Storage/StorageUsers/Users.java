package MyOwnTry.Storage.StorageUsers;

import MyOwnTry.Core.User.BaseUser;

import java.util.ArrayList;
import java.util.List;

public abstract class Users implements Iterable<BaseUser> {
    public List<BaseUser> users;

    int index;

    public void Users() {
        users = new ArrayList<>();
        index = 0;
    }

    public void addUser(BaseUser user) {
        if (!(users.indexOf(users) != -1)) {
            users.add(user);
        }
    }
}
