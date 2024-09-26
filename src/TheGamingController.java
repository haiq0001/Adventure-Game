// Adventure
public class TheGamingController {
    private Player player;
    private TheGameMap map;
    private TheGameInterface ui;

    public TheGamingController() {
        map = new TheGameMap();
        player = new Player(map.getCurrentRoom());
        ui = new TheGameInterface();
    }

    public void play() {
        ui.printWelcomeMessage();

        while (true) {
            String input = ui.getUserInput();
            switch (input) {
                case "north":
                case "n":
                    move(player.getCurrentRoom().getNorth(), "north");
                    break;

                case "south":
                case "s":
                    move(player.getCurrentRoom().getSouth(), "south");
                    break;

                case "east":
                case "e":
                    move(player.getCurrentRoom().getEast(), "east");
                    break;

                case "west":
                case "w":
                    move(player.getCurrentRoom().getWest(), "west");
                    break;

                case "look":
                    ui.printRoomDescription(player.getCurrentRoom());
                    break;

                case "help":
                    ui.printHelp();
                    break;

                case "exit":
                    ui.printExitMessage();
                    return;

                default:
                    ui.printInvalidCommand();
                    break;
            }
        }
    }

    private void move(Room nextRoom, String direction) {
        if (nextRoom != null) {
            player.moveTo(nextRoom);
            ui.printRoomDescription(player.getCurrentRoom());
        } else {
            ui.printWrongWayError();
        }
    }
}
