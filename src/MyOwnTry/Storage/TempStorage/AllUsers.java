package MyOwnTry.Storage.TempStorage;

import MyOwnTry.Core.User.BaseUser;

import java.util.Iterator;

public class AllUsers<B extends BaseUser> extends BaseAll<B>{

    public boolean checkId(int forCheck) {
        for (B user : all) {
            if (user.getId().getId() == forCheck) {
                return true;
            }
        }
        return false;
    }
}
