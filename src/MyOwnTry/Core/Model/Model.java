package MyOwnTry.Core.Model;

import MyOwnTry.Core.User.Admin;
import MyOwnTry.Core.User.BaseUser;
import MyOwnTry.Core.User.God;
import MyOwnTry.Core.User.PremiumUser;
import MyOwnTry.Storage.StorageUsers.AllUsers;

public class Model {
    private AllUsers<BaseUser> everythingUsers = new AllUsers<>();

    //#region createUsers
    public void createUser(String name) {
        everythingUsers.addUsers(new PremiumUser(name));
    }

    public void createPremiumUser(String name) {
        everythingUsers.addUsers(new PremiumUser(name));
    }

    public void createAdmin(String name) {
        everythingUsers.addUsers(new Admin(name));
    }

    public void createGod(String name) {
        everythingUsers.addUsers(new God(name));
    }
    //#endregion

    public void showAllUsers() {
        System.out.println(everythingUsers); // вывод должен находится во View
    }

    public boolean isDigitString(String foCheck) {
        if (foCheck.isEmpty()) {
            return false;
        }
        for (char c : foCheck.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public int getNumber(String willBeNumber) {
        return Integer.parseInt(willBeNumber);
    }

    public void addUserInGroup(int forCheckId) {

    }

    public void getEverythingUsers(int id) {
        System.out.println(this.everythingUsers.getUser(0).equals(id));
        for (int i = 0; i < this.everythingUsers.size(); i++) {
            this.everythingUsers.getUser(i);
        }
        for (var a : this.everythingUsers) {

        }

        //System.out.println(this.everythingUsers.getUsers().get(0).equals(id));
    }
}
