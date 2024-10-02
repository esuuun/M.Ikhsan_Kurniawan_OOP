import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieCollection extends LibraryCollection<Movie> {

    public MovieCollection(HashMap<String, Movie> items){
        super(items);
    }

    public Map<String,Movie> findByTitle(String title){
        return getAllItems().entrySet().stream().filter(entry -> entry.getValue().title.toLowerCase().contains(title.toLowerCase())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }

    public Map<String,Movie> findByDirector(String director){
        return getAllItems().entrySet().stream().filter(entry -> entry.getValue().director.toLowerCase().contains(director.toLowerCase())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }
    public Map<String,Movie> findByYear(int year){
        return getAllItems().entrySet().stream().filter(entry -> entry.getValue().year.contains(year)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

    }

}
