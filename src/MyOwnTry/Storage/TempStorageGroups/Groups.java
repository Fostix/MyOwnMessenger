package MyOwnTry.Storage.TempStorageGroups;

import MyOwnTry.Core.Group.Group;
import MyOwnTry.Core.User.ID;

import java.util.ArrayList;
import java.util.List;

public class Groups<G extends Group> {
    private List<G> allGroups;
    private ID idGroup;

    public Groups() {
        this.allGroups = new ArrayList<>();
        this.idGroup = new ID();
    }
}
