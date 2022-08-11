package MyOwnTry.Core.Model;

import MyOwnTry.Core.User.Admin;
import MyOwnTry.Core.User.BaseUser;
import MyOwnTry.Core.User.God;
import MyOwnTry.Core.User.PremiumUser;
import MyOwnTry.Storage.TempStorage.AllUsers;
import MyOwnTry.Storage.TempStorage.BaseAll;

public class Model {
    private BaseAll<BaseUser> everythingUsers = new AllUsers<>();

    //#region createUsers
    public void createUser(String name) {
        everythingUsers.add(new PremiumUser(name));
    }

    public void createPremiumUser(String name) {
        everythingUsers.add(new PremiumUser(name));
    }

    public void createAdmin(String name) {
        everythingUsers.add(new Admin(name));
    }

    public void createGod(String name) {
        everythingUsers.add(new God(name));
    }
    //#endregion

    public String showAllUsers() {
        return everythingUsers.toString();
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

    public boolean equalsId(int id) {
        return everythingUsers.checkId(id); // check then del
    }


}
