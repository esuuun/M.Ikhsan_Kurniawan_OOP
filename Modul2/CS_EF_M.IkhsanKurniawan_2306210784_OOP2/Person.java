
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int id;
    
    public Person(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
}
