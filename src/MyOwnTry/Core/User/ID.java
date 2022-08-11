package MyOwnTry.Core.User;

import java.util.Objects;
import java.util.Random;

public class ID {
    private Integer id;

    public ID() {
        Random r = new Random();
        this.id = r.nextInt(10); // Integer.MAX_VALUE
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) { // Переполнение id
        if (this.id.equals(o)) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID id1 = (ID) o;
        return id == id1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("%s", this.id);
    }
}
