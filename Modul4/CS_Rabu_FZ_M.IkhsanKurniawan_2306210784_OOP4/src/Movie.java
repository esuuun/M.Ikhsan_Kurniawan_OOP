public class Movie {
    public String title;
    public String director;
    public int year;

    public Movie(String title, String director, int year){
        this.title = title;
        this.director = director;
        this.year = year;
    }


    public String toString(){
        System.out.println("Movie title: "+ this.title);
        System.out.println("Director: "+ this.director);
        System.out.println("Year: "+ this.year);
        return null;
    }
}
