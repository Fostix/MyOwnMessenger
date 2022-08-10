package MyOwnTry.Core.User;

public abstract class BaseUser {
    private ID id;
    private String name;

    public BaseUser(String name) {
        this.id = new ID();
        this.name = name;
    }

    public BaseUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        BaseUser t = (BaseUser) obj;
        return t.id == this.id;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("id: %s\nname: %s", this.id, this.name);
    }
}
