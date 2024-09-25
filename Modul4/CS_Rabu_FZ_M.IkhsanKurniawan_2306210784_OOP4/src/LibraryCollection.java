import java.util.HashMap;
import java.util.Map;

public class LibraryCollection<T> {
    private HashMap<String, T> items;

    public LibraryCollection(HashMap<String,T> items) {
      this.items = items;
    }
    public void addItem(String key, T item){
        this.items.put(key,item);
    }
    public T getItem(String key){
       return (this.items.get(key));
    }
    public Map<String,T> getAllItems(){
        return (items);
    }
}
