// Map
public class TheGameMap {
    private Room currentRoom;

    public TheGameMap() {
        createRooms();
    }

    private void createRooms() {
        Room room1 = new Room("The Forgotten Courtyard", "Overgrown vines and ancient statues surround the crumbling stone walls.");
        Room room2 = new Room("The Shadowy Crypt", "Cold and damp, with flickering torchlight revealing skeletal remains.");
        Room room3 = new Room("The Enchanted Forest", "Glowing trees and distant whispers fill the eerie, magical forest.");
        Room room4 = new Room("The Mystic Library", "Dusty shelves hold ancient, glowing books in the dimly lit room.");
        Room room5 = new Room("The Sacred Grove", "A peaceful grove with a stone altar, pulsating with magical energy.");
        Room room6 = new Room("The Witch's Kitchen", "Strange potions brew in cauldrons, and jars of mysterious ingredients line the shelves.");
        Room room7 = new Room("The Cursed Tower", "Howling wind and cobwebs fill this towering, crumbling structure.");
        Room room8 = new Room("The Forbidden Chamber", "Heavy doors seal the room, where glowing runes cover the stone walls.");
        Room room9 = new Room("The Dragon’s Lair", "Scorched walls and deep claw marks hint at a lurking dragon nearby.");

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setWest(room1);
        room2.setEast(room3);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);

        room9.setNorth(room6);
        room9.setWest(room8);

        currentRoom = room1;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
