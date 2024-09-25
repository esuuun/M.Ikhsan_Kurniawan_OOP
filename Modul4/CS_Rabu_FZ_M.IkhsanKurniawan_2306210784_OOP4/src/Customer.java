public class Customer {
    public String name, customerId;

    public  Customer(String name, String customerId){
        this.name = name;
        this.customerId = customerId;
    }

    public String toString() {
        System.out.println("Customer Name: "+ this.name);
        System.out.println("Customer ID: "+ this.customerId);
        return null;
    }
}
