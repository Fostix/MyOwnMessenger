package MyOwnTry.Core.Model;

import MyOwnTry.Storage.StorageUsers.AllUsers;

public interface View {
    String enterName();
    void createUserMenu();
    String enterNumber();
    void notNumber();
    void itIsNumber();
    void showAllUsers(String info);
}
