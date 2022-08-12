package MyOwnTry.Storage.TempStorage;

import MyOwnTry.Core.User.BaseUser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseAll<A> implements Iterable<A> {
    protected List<A> all;
    int index;

    public BaseAll() {
        all = new ArrayList<>();
        index = 0;
    }

    public void add(A b) {
        if (!(all.indexOf(all) != -1)) {
            all.add(b);
        }
    }

    @Override
    public Iterator<A> iterator() {
        Iterator<A> iter = new Iterator<A>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < all.size();
            }

            @Override
            public A next() {
                return all.get(index++);
            }
        };
        return iter;
    }

    @Override
    public String toString() {
        return String.format("%s", this.all);
    }

    public abstract boolean checkId(int id);
}
