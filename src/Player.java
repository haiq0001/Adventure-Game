public class Player {
    private Room currentRoom;

    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void moveTo(Room nextRoom) {
        if (nextRoom != null) {
            currentRoom = nextRoom;
        }
    }
}
