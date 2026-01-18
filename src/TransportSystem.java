import java.util.Arrays;

public class TransportSystem {

    private Transport[] transports = new Transport[10];
    private int count = 0;

    public void addTransport(Transport transport) {
        transports[count++] = transport;
    }

    // 🔍 SEARCH
    public Transport searchByType(String type) {
        for (int i = 0; i < count; i++) {
            if (transports[i].getName().equalsIgnoreCase(type)) {
                return transports[i];
            }
        }
        return null;
    }

    // 🔎 FILTER
    public void filterByCapacity(int minCapacity) {
        System.out.println("Filtered (capacity >= " + minCapacity + "):");
        for (int i = 0; i < count; i++) {
            if (transports[i].getCapacity() >= minCapacity) {
                System.out.println(transports[i]);
            }
        }
    }

    // 🔃 SORT
    public void sortByCapacity() {
        Arrays.sort(transports, 0, count,
                (a, b) -> Integer.compare(a.getCapacity(), b.getCapacity()));
    }

    // 📤 POLYMORPHISM
    public void showAll() {
        for (int i = 0; i < count; i++) {
            transports[i].print(); // runtime polymorphism
        }
    }
}
