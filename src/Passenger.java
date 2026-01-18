public class Passenger extends BaseEntity {

    private int age;

    public Passenger(String name, int age) {
        super(name); // ← ИСПОЛЬЗОВАНИЕ super
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Passenger: " + name + ", Age: " + age);
    }
}
