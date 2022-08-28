package MyOwnTry.Storage.TempStorage;

import MyOwnTry.Core.BaseList.ModelListIterator;
import MyOwnTry.Core.ModelUsers.BaseUserOrGroup;
import MyOwnTry.Core.ModelUsers.Group.Group;
import MyOwnTry.Core.ModelUsers.User.BaseUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseAll<A extends BaseUserOrGroup> extends ModelListIterator<A> {
    protected List<A> all;
    //int index;

    public BaseAll() {
        all = new ArrayList<>();
        //index = 0;
    }

    public void add(A b) {
        if (!(all.indexOf(all) != -1)) {
            all.add(b);
        }
    }

    public List<BaseUser> getUsers(int index) {
        return (List<BaseUser>) all.get(index);
    }

    @Override
    public String toString() {
        return String.format("%s", this.all);
    }

    //public abstract boolean checkId(int id);
    public boolean checkId(int forCheck) {
        for (A user : all) {
            if (user.getId().getId() == forCheck) {
                return true;
            }
        }
        return false;
    }
}
