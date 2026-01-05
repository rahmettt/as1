import java.util.Scanner;

// ---------------- TRANSPORT ----------------
class Transport {
    private String type;
    private int capacity;

    public Transport(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    // getters & setters
    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void print() {
        System.out.println("Transport: " + type + ", Capacity: " + capacity);
    }

    // Assignment 2 requirements
    @Override
    public String toString() {
        return "Transport{" + type + ", capacity=" + capacity + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Transport) {
            Transport t = (Transport) obj;
            return type.equals(t.type) && capacity == t.capacity;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return type.hashCode() + capacity;
    }
}

// ---------------- PASSENGER ----------------
class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Passenger: " + name + ", Age: " + age);
    }
}

// ---------------- TRANSPORT SYSTEM ----------------
class TransportSystem {
    private Transport[] transports;
    private int count;

    public TransportSystem() {
        transports = new Transport[5]; // data pool
        count = 0;
    }

    public void addTransport(Transport transport) {
        transports[count] = transport;
        count++;
    }

    // search
    public Transport searchByType(String type) {
        for (int i = 0; i < count; i++) {
            if (transports[i].getType().equals(type)) {
                return transports[i];
            }
        }
        return null;
    }

    // filter
    public void filterByCapacity(int minCapacity) {
        for (int i = 0; i < count; i++) {
            if (transports[i].getCapacity() >= minCapacity) {
                System.out.println(transports[i]);
            }
        }
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            transports[i].print();
        }
    }
}

// ---------------- MAIN ----------------
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // SAME VARIABLES AS ASSIGNMENT 1
        TransportSystem system = new TransportSystem();

        Transport bus1 = new Transport("Bus", 40);
        Transport bus2 = new Transport("Bus", 30);

        Passenger p1 = new Passenger("Ali", 20);
        Passenger p2 = new Passenger("Amina", 22);

        system.addTransport(bus1);
        system.addTransport(bus2);

        // output
        system.showAll();
        p1.print();
        p2.print();

        // search
        System.out.print("\nEnter transport type to search: ");
        String type = scanner.nextLine();

        Transport found = system.searchByType(type);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Not found");
        }

        // filter
        System.out.print("\nEnter minimum capacity: ");
        int cap = scanner.nextInt();

        system.filterByCapacity(cap);

        // compare
        System.out.println("\nComparison:");
        if (bus1.equals(bus2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are different");
        }

        scanner.close();
    }
}
