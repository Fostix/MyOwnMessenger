package MyOwnTry.Core.ModelUsers.User;

import MyOwnTry.Core.ModelUsers.BaseUserOrGroup;

public abstract class BaseUser extends BaseUserOrGroup {
    private String name;

    public BaseUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this.id.equals(o)) {
//            System.out.println("equals!!!!");
//            return true; }
//        if (o == null || getClass() != o.getClass()) return false;
//
//        BaseUser baseUser = (BaseUser) o;
//
//        if (!Objects.equals(id, baseUser.id)) return false;
//        return Objects.equals(name, baseUser.name);
//    }

    @Override
    public String toString() {
        return String.format("id: %s\nname: %s", getId(), this.name);
    }
}
