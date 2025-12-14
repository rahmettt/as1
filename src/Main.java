class Passenger {
    private String name;
    private int age;

    // constructor
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Passenger: " + name + ", Age: " + age);
    }
}

// ----------------------------

class Transport {
    private String type;
    private int capacity;

    public Transport(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void print() {
        System.out.println("Transport: " + type + ", Capacity: " + capacity);
    }
}

// ----------------------------

class TransportSystem {
    private String systemName;

    public TransportSystem(String systemName) {
        this.systemName = systemName;
    }

    public void print() {
        System.out.println("System: " + systemName);
    }
}

// ----------------------------

public class Main {
    public static void main(String[] args) {

        // create system
        TransportSystem system =
                new TransportSystem("City Transport System");

        // create transport
        Transport bus1 = new Transport("Bus", 40);
        Transport bus2 = new Transport("Bus", 30);

        // create passengers
        Passenger p1 = new Passenger("Ali", 20);
        Passenger p2 = new Passenger("Amina", 22);

        // output
        system.print();
        bus1.print();
        bus2.print();
        p1.print();
        p2.print();

        // compare objects
        if (bus1.getCapacity() > bus2.getCapacity()) {
            System.out.println("Bus 1 has more capacity");
        } else {
            System.out.println("Bus 2 has more capacity");
        }
    }
}
