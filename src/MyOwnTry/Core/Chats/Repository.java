package MyOwnTry.Core.Chats;

import MyOwnTry.Core.User.BaseUser;

public interface Repository<C extends BaseUser> {
    void add(C c);

    C getByName(String name);

    C getById(int id);

    int getCount();
}
