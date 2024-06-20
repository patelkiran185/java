import java.util.*;
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public double getRating() {
        return rating;
    }
    public int getYear() {
        return year;
    }
    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

}
public class Moviee {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        Collections.sort(list);
        System.out.println("Movies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }
}