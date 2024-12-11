import org.code.theater.*;

/*
 * Creates a visualization for meteorite data
 */
public class Releases extends Scene {

  private Movie[] movies;    // The 1D array of Movie objects

  /*
   * Initializes movies to the specified 1D array of Movie objects
   */
  public Releases(Movie[] movies) {
    this.movies = movies;
  }

  /*
   * Returns the 1D array of Movie objects
   */
  public Movie[] getMovies() {
    return movies;
  }

  /*
   * Returns the number of Movies that released in the parameter year
   */
  public int getMoviesByYear(int year) {
    int count = 0;
    for(int i=0; i<movies.length; i++){
    if (movies[i].getYear()==year){
        count++;
      }
    }


    
    
    return count;
  }

  /*
   * Draws the result in the scene
   */

  public void drawResult(int year, int count) {
    int numMovies = count;
    while (numMovies > 0) {
      int randomX = (int)(Math.random() * getWidth());
      int randomY = (int)(Math.random() * getHeight());
      drawImage("download.png", randomX, randomY, 100);
      pause(0.1);
      numMovies--;
    }

    pause(0.5);
    drawText("There was  " + count + " movies on", 50, 100);
    drawText("netflix that released in " + year, 50, 125);
  }
  
}