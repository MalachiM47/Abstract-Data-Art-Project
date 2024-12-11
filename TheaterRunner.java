import org.code.theater.*;
import java.util.Scanner;


public class TheaterRunner {
  public static void main(String[] args) {

    // Reads the data from the text files into a 1D array of Movie objects
    Movie[] movies = Movie.createMovies("titles.txt", "years.txt");

    // Creates a Releases object
    Releases scene = new Releases(movies);

    Scanner input = new Scanner(System.in);
  /*
   *Calls get movies by year and then passes it through draw result 
   since the result of one is needed for the other
   */
  System.out.println("Search for how many movies on netflix were released during a year before 2020."+ "\n What year would you like to search for?");
  int tempyear = input.nextInt();
  scene.drawResult(tempyear, scene.getMoviesByYear(tempyear));
  input.close();
    
    
    // Plays the scene
    Theater.playScenes(scene);
    
  }
}