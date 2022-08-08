package MyOwnTry.Storage.StorageUsers;

import MyOwnTry.Core.User.BaseUser;
import MyOwnTry.Core.User.ID;
import MyOwnTry.Core.User.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllUsers extends Users { //<U extends BaseUser> extends BaseUser {
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

//    @Override
//    public int hashCode() {
//        return users.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s", this.users);
//    }

    @Override
    public Iterator<BaseUser> iterator() {
        Iterator<BaseUser> iter = new Iterator<BaseUser>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public BaseUser next() {
                return users.get(index++);
            }
        };
        return iter;
    }
}
