import java.util.Objects;

public class Transport extends BaseEntity {

    private int capacity;

    public Transport(String name, int capacity) {
        super(name); // ← ИСПОЛЬЗОВАНИЕ super
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void print() {
        System.out.println("Transport: " + name + ", Capacity: " + capacity);
    }

    // === Overriding Object methods ===
    @Override
    public String toString() {
        return "Transport{name='" + name + "', capacity=" + capacity + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport that = (Transport) o;
        return capacity == that.capacity && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
