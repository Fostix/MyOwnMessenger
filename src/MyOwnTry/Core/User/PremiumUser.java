package MyOwnTry.Core.User;

import java.util.Iterator;

public class PremiumUser extends BaseUser{
    public PremiumUser(String name) {
        super(name);
    }

    @Override
    public Iterator<BaseUser> iterator() {
        return null;
    }
}
