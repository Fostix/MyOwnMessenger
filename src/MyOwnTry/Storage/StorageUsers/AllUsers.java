package MyOwnTry.Storage.StorageUsers;

import MyOwnTry.Core.User.BaseUser;
import MyOwnTry.Core.User.ID;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllUsers<B extends BaseUser> implements Iterable<B>{ //<U extends BaseUser> extends BaseUser {
    private List<B> users;
    int index;

    public AllUsers() {
        users = new ArrayList<>();
        index = 0;
    }

    public void addUser(B b) {
        if (!(users.indexOf(users) != -1)) {
            users.add(b);
        }
    }

    public boolean checkId(int forCheck) {
        boolean flag;
        ID t = new ID();
        for (B user : users) {
            System.out.println(user);
            if (user.getId().getId() == forCheck)
                return true;
        }
        return false;
    }

    @Override
    public Iterator<B> iterator() {
        Iterator<B> iter = new Iterator<B>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public B next() {
                return users.get(index++);
            }
        };
        return iter;
    }

    @Override
    public String toString() {
        return String.format("%s", this.users);
    }
}
