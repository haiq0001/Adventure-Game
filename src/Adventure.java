import java.util.Scanner;
public class Adventure {

    private Room currentRoom;
    public Adventure() {

        // 9 rum med beskrivelse.
        Room room1 = new Room("The Forgotten Courtyard", "Overgrown vines and ancient statues surround the crumbling stone walls.");
        Room room2 = new Room("The Shadowy Crypt", "Cold and damp, with flickering torchlight revealing skeletal remains.");
        Room room3 = new Room("The Enchanted Forest", "Glowing trees and distant whispers fill the eerie, magical forest.");
        Room room4 = new Room("The Mystic Library", "Dusty shelves hold ancient, glowing books in the dimly lit room.");
        Room room5 = new Room("The Sacred Grove", "A peaceful grove with a stone altar, pulsating with magical energy.");
        Room room6 = new Room("The Witch's Kitchen", "Strange potions brew in cauldrons, and jars of mysterious ingredients line the shelves.");
        Room room7 = new Room("The Cursed Tower", "Howling wind and cobwebs fill this towering, crumbling structure.");
        Room room8 = new Room("The Forbidden Chamber", "Heavy doors seal the room, where glowing runes cover the stone walls.");
        Room room9 = new Room("The Dragon’s Lair", "Scorched walls and deep claw marks hint at a lurking dragon nearby.");

        //Fra rum 1 kan man kun tilgå rum 2 og 4
        room1.setEast(room2);
        room1.setSouth(room4);

        //Fra rum 2 kan man kun tilgå rum 1 og 3
        room2.setWest(room1);
        room2.setEast(room3);

        //Fra rum 3 kan man kun tilgå rum 2 og 3
        room3.setWest(room2);
        room3.setSouth(room6);

        //Fra rum 4 kan man kun tilgå rum  og 4
        room4.setNorth(room1);
        room4.setSouth(room7);

        //Fra rum 5 kan man kun tilgå rum 8
        room5.setSouth(room8);

        //Fra rum 6 kan man kun tilgå rum 9 og 3
        room6.setSouth(room9);
        room6.setNorth(room3);

        //Fra rum 7 kan man kun tilgå rum 4 og 8
        room7.setNorth(room4);
        room7.setEast(room8);

        //Fra rum 8 kan man kun tilgå rum 5, 7 og 0
        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);

        //Fra rum 9 kan man kun tilgå rum 6 og 8
        room9.setNorth(room6);
        room9.setWest(room8);

        currentRoom = room1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("⭐⭐⭐  Welcome to the Adventure Game  ⭐⭐⭐");
        System.out.println("Type 'help' to see the instructions");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "north":
                case "n":
                    move(currentRoom.getNorth(), "north");
                    break;

                case "south":
                case "s":
                    move(currentRoom.getSouth(), "south");
                    break;

                case "east":
                case "e":
                    move(currentRoom.getEast(), "east");
                    break;

                case "west":
                case "w":
                    move(currentRoom.getWest(), "west");
                    break;

                case "look":
                    System.out.println("You location is: " + currentRoom.getName());
                    System.out.println(currentRoom.getDescription());
                    break;

                case "help":
                    printHelp();
                    break;

                case "exit":
                    System.out.println("Thanks for playing!");
                    return;

                default:
                    System.out.println("❌ERROR❌");
                    break;
            }
        }
    }

    private void move(Room nextRoom, String direction) {
        if (nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("Your location is: " + currentRoom.getName());
            System.out.println(currentRoom.getDescription());
        } else {
            System.out.println("⛔ERROR WRONG WAY⛔");
        }
    }

    private void printHelp() {
        System.out.println("The instructions:");
        System.out.println("North/N: Move north");
        System.out.println("South/S: Move south");
        System.out.println("East/E: Move east");
        System.out.println("West/W: Move west");
        System.out.println("Look: Look around");
        System.out.println("Exit: Exit the game");
    }

    public static void main(String[] args) {
        Adventure adventure = new Adventure();
        adventure.play();
    }
}
