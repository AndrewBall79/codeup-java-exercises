package movies;
import javafx.scene.SnapshotParameters;
import org.w3c.dom.ls.LSOutput;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

//public class MoviesApplication {
//    final static String[] categories = {"none", "all", "animated", "drama", "horror", "sci-fi", "musical", "comedy"};
//
//
//    public static void main(String[] args) throws Exception {
//        Input scanner = new Input();
//        Movie[] movieList = MoviesArray.findAll();
//
//        int choice = 1;
//        do {
//            System.out.println();
//            System.out.println("What?");
//            System.out.println("0 exit");
//            System.out.println("1 view all movies");
//            System.out.println("2 view animated movies");
//            System.out.println("3 view drama movies");
//            System.out.println("4 view horror movies");
//            System.out.println("5 view all movies");
//            System.out.println("6 view all movies");
//            System.out.println("7 view all movies");
//            System.out.println("8 view all movies");
//            System.out.println("9 view all movies");
//            System.out.println("1 view all movies");
//
//            choice = scanner.getInt(0, 8, "enter your choice: ");
//
//            if (choice != 0 && choice != 8) {
//                for (Movie movie : movieList) {
//                    switch (choice) {
//                        case 1:
//                            System.out.println(Movie.getName() + Movie.getCategory());
//                            break;
//                        case 2:
//                            System.out.println();
//                        case 3:
//                        case 4:
//                        case 5:
//                        case 6:
//                        case 7:
//                            if (movie.getCategory().equalsIgnoreCase(categories[choice])) {
//                            }
//                            break;
//                default:
//                        break;
//                    }
//                }
//                if (choice == 8) {
//                    movieList = addMovie(movieList, scanner);
//                }
//            }
//        } while (choice != 0);
//        System.out.println("goodbye!");
//    }
//
//    private static Movie[] addMovie(Movie[] movieList, Input scanner) throws  Exception{
//        String name = scanner.getString("Enter the movie name: ");
//        String category = scanner.getString("Enter the category");
//
//        Movie newMovie = new Movie(name, category);
//        Movie[] newList = null;
//        int length = 0;
//
//        if(movieList != null){
//            length = movieList.length;
//            newList = Arrays.copyOf(movieList, length +1 );
//        } else
//            {
//        }


//    }

//}