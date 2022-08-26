package MyOwnTry.Core.Model;

import MyOwnTry.Core.ModelUsers.Group.Group;
import MyOwnTry.Core.ModelUsers.User.Admin;
import MyOwnTry.Core.ModelUsers.User.BaseUser;
import MyOwnTry.Core.ModelUsers.User.God;
import MyOwnTry.Core.ModelUsers.User.PremiumUser;
import MyOwnTry.Storage.TempStorage.AllUsers;
import MyOwnTry.Storage.TempStorage.BaseAll;
import MyOwnTry.Storage.TempStorage.Groups;

public class Model {
    private BaseAll<BaseUser> everythingUsers = new AllUsers<>();
    private BaseAll<Group> everythingGroups = new Groups<>();

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
        return everythingUsers.checkId(id); // check then del???????
    }

    public Group createGroup(String namingGroup) { // Потом нужно будет добавить аргумент и передавать название группы!!
        Group newGroup = new Group<>(namingGroup);
        return newGroup;
    }

    public void appendGroupInStorage(Group newGroup) {
        everythingGroups.add(newGroup);
        System.out.println(everythingGroups);
    }

    public boolean checkHaveSuchUserOrNot(int idUser) {
        return everythingUsers.checkId(idUser);
    }

    public boolean checkHaveSuchGroupOrNot(int idGroup) {
        return everythingGroups.checkId(idGroup);
    }

    public void appendUserInGroup(int idUser, int idGroup) {

    }
}
