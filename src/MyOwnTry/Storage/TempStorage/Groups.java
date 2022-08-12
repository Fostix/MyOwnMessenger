package MyOwnTry.Storage.TempStorage;

import MyOwnTry.Core.Group.Group;

import java.util.Iterator;

public class Groups<G extends Group> extends BaseAll {
    @Override
    public boolean checkId(int id) {
        return false;
    }
}
