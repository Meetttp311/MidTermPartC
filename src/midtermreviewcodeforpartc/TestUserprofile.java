/* Done. */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author meet
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display list of possible genres
        System.out.println("Select your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Fantasy");
        System.out.println("5. Sci-fi");

        // Read user input for name and genre choice
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite genre number: ");
        int genreChoice = scanner.nextInt();

        // Create a user profile with the provided name and genre
        UserProfile userProfile = new UserProfile(name, genreChoice);

        // Display a message that the user profile was created
        System.out.println("User profile created successfully:");
        System.out.println(userProfile);
    }
}

class UserProfile {
    private String name;
    private String favoriteGenre;

    public UserProfile(String name, int genreChoice) {
        this.name = name;
        this.favoriteGenre = getGenreName(genreChoice);
    }

    private String getGenreName(int genreChoice) {
        switch (genreChoice) {
            case 1:
                return "Action";
            case 2:
                return "Comedy";
            case 3:
                return "Drama";
            case 4:
                return "Fantasy";
            case 5:
                return "Sci-fi";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nFavorite Genre: " + favoriteGenre;
    }
}
