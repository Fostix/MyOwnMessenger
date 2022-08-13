package MyOwnTry.Storage.TempStorage;

import MyOwnTry.Core.Group.Group;

public class Groups<G extends Group> extends BaseAll {
    @Override
    public boolean checkId(int id) { // В базовом классе реализовать
        return false;
    }
}
