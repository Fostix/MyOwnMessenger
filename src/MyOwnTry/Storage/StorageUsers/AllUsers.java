package MyOwnTry.Storage.StorageUsers;

import MyOwnTry.Core.User.BaseUser;

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

    @Override
    public String toString() {
        return String.format("%s", this.users);
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

    //    private List<BaseUser> users = new ArrayList<>();
//
//
//    public BaseUser getUser(int i) {
//        return users.get(i);
//    }
//
//    public int size() {
//        return users.size();
//    }
//
//    public void addUsers(BaseUser u) {
//        this.users.add(u);
//    }

    //    @Override
//    public boolean equals(Object o) {
//        for (BaseUser a : users) {
//            if (a.equals(o)) { //
//                System.out.println("equals!!!");
//            }
//        }
//
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        AllUsers<?> allUsers = (AllUsers<?>) o;
//
//        return users.equals(allUsers.users);
//    }
}
