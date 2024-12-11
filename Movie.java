/*
 * Represents a movie or show
 */
public class Movie {

  private String title;       // The title of a show or movie
  private int year;          // The year a movie or show released

  /*
   * Sets title and year to the specified values
   */
  public Movie(String title, int year) {
    this.title = title;
    this.year = year;
  }

  /*
   * Returns the title of the show or movie
   */
  public String getTitle() {
    return title;
  }


  /*
   * Returns the year the show or movie released
   */
  public int getYear() {
    return year;
  }

  /*
   * Returns a 1D array of Movie objects using the data in the specified text files
   */
  public static Movie[] createMovies(String titlesFile, String yearsFile) {
    String[] titlesData = FileReader.toStringArray(titlesFile);
    int[] yearsData = FileReader.toIntArray(yearsFile);
    Movie[] moviesData = new Movie[titlesData.length];

    for (int index = 0; index < moviesData.length; index++) {
      moviesData[index] = new Movie(titlesData[index], yearsData[index]);
    }

    return moviesData;
  }

  /*
   * Returns a String containing information about the movie or show
   */
  public String toString() {
    return title + " (" + year + ") - ";
  }
  
}
