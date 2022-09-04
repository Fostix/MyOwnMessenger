package MyOwnTry.Core.ModelUsers;

import MyOwnTry.Core.ModelUsers.User.ID;

public abstract class BaseUserOrGroup {
    private ID id;

    public BaseUserOrGroup() {
        this.id = new ID();
    }

    public ID getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%d", this.id);
    }
}
