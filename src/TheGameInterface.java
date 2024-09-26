// UI
import java.util.Scanner;

public class TheGameInterface {
    private Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        return scanner.nextLine().toLowerCase().trim();
    }

    public void printWelcomeMessage() {
        System.out.println("⭐⭐⭐  Welcome to the Adventure Game  ⭐⭐⭐");
        System.out.println("Type 'help' to see the instructions");
    }

    public void printHelp() {
        System.out.println("The instructions:");
        System.out.println("North/N: Move north");
        System.out.println("South/S: Move south");
        System.out.println("East/E: Move east");
        System.out.println("West/W: Move west");
        System.out.println("Look: Look around");
        System.out.println("Exit: Exit the game");
    }

    public void printRoomDescription(Room room) {
        System.out.println("Your location is: " + room.getName());
        System.out.println(room.getDescription());
    }

    public void printExitMessage() {
        System.out.println("Thanks for playing!");
    }

    public void printInvalidCommand() {
        System.out.println("❌ERROR❌");
    }

    public void printWrongWayError() {
        System.out.println("⛔ERROR WRONG WAY⛔");
    }
}
