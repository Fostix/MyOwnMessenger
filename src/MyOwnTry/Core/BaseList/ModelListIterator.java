package MyOwnTry.Core.BaseList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ModelListIterator<A> implements Iterable {//<A>
    private List<A> list;
    private Count counter;

    public ModelListIterator() {
        this.list = new ArrayList<>();
    }

    public void add(A a) {

        this.list.add(a);
    }

    @Override
    public Iterator iterator() {
        Iterator<A> iterator = new Iterator<A>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public A next() {
                return list.get(index++);
            }
        };
        return iterator;
    }
}
