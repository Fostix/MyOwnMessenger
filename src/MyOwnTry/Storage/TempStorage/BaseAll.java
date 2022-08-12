package MyOwnTry.Storage.TempStorage;

import MyOwnTry.Core.BaseList.ModelListIterator;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAll<A> extends ModelListIterator<A> {
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
    public String toString() {
        return String.format("%s", this.all);
    }

    public abstract boolean checkId(int id);
}
