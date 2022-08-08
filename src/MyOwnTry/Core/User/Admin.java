package MyOwnTry.Core.User;

import java.util.Iterator;

public class Admin extends BaseUser{
    public Admin(String name) {
        super(name);
    }

    @Override
    public Iterator<BaseUser> iterator() {
        return null;
    }
}
