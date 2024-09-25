import java.util.HashMap;
import java.util.Map;


public class CustomerRegistry extends LibraryCollection<Customer>{
    public CustomerRegistry(HashMap<String, Customer> items){
        super(items);
    }
    public Map<String,Customer> findByName(String name){
        return super.getItem(name);
    }

    public Customer findByUserId(String userId){
        return super.getItem(userId);
    }

    public Customer findByKey(String key){
        return super.getItem(key);
    }
}
