package MyOwnTry.Core.User;

import java.util.Iterator;

public class User extends BaseUser{
    public User(String name) {
        super(name);
    }

    @Override
    public Iterator<BaseUser> iterator() {
        return null;
    }
}
