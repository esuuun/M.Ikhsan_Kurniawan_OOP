import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Movie> movieMap = new HashMap<>();
        HashMap<String, Customer> customerMap = new HashMap<>();
        MovieCollection movieCollection = new MovieCollection(movieMap);
        CustomerRegistry customerRegistry = new CustomerRegistry(customerMap);
        movieCollection.addItem("Y001", new Movie("The Legend of Kazuma Kiryu", "Kazuma Kiryu", 2005));
        movieCollection.addItem("Y002", new Movie("Mad Dog of Shimano", "Goro Majima", 2007));
        movieCollection.addItem("Y003", new Movie("Fall of Nishikiyama", "Akira Nishikiyama", 2005));
        customerRegistry.addItem("C001", new Customer("Kazuma Kiryu", "Dragon of Dojima"));
        customerRegistry.addItem("C002", new Customer("Goro Majima", "Mad Dog of Shimano"));
        System.out.println("Cari movie dengan judul 'Mad Dog':");
        // Buatlah loop untuk mencari movie dengan judul 'Mad Dog' disini
        System.out.println("\nCari movie yang dibuat pada tahun 2005:");
        // Buatlah loop untuk mencari movie yang dibuat pada tahun 2005 disini
        System.out.println("\nCari customer dengan ID 'Dragon of Dojima':");
        // Cari customer dengan ID 'Dragon of Dojima' disini
        System.out.println("\nCari customer dengan Key 'C002':");
        // Cari customer dengan Key 'C002' disini
    }
}