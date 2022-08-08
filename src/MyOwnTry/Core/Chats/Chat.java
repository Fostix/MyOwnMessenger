package MyOwnTry.Core.Chats;

import MyOwnTry.Core.User.BaseUser;

import java.util.ArrayList;
import java.util.List;

public class Chat<C extends BaseUser> implements Repository {
    private String chatName;
    private List<C> users;

    public Chat(String chatName) {
        this.chatName = chatName;
        this.users = new ArrayList<>();
    }

    @Override
    public void add(BaseUser baseUser) {
        users.add((C) baseUser);
    }

    @Override
    public C getByName(String name) {
        return null;
    }

    @Override
    public C getById(int id) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.chatName, this.users);
    }
}
