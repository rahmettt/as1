public abstract class BaseEntity {
    protected String name;

    public BaseEntity(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }
}
