import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TransportSystem system = new TransportSystem();

        // === Objects ===
        Transport bus = new Transport("Bus", 40);
        Transport taxi = new Transport("Taxi", 4);
        Transport tram = new Transport("Tram", 60);
        Transport moto = new Transport("moto", 2);

        Passenger p1 = new Passenger("Ali", 20);
        Passenger p2 = new Passenger("Amina", 22);

        system.addTransport(bus);
        system.addTransport(taxi);
        system.addTransport(tram);
        system.addTransport(moto);


        // === Output (Polymorphism) ===
        System.out.println("--- All transports ---");
        system.showAll();

        p1.print();
        p2.print();

        // === Search ===
        System.out.print("\nEnter transport type to search: ");
        String type = scanner.nextLine();
        Transport found = system.searchByType(type);
        System.out.println(found != null ? "Found: " + found : "Not found");

        // === Filter ===
        System.out.print("\nEnter minimum capacity: ");
        int cap = scanner.nextInt();
        system.filterByCapacity(cap);

        // === Sort ===
        system.sortByCapacity();
        System.out.println("\nAfter sorting:");
        system.showAll();

        // === equals & hashCode ===
        System.out.println("\nComparison:");
        System.out.println(bus.equals(new Transport("Bus", 40))
                ? "Objects are equal"
                : "Objects are different");

        scanner.close();
    }
}
