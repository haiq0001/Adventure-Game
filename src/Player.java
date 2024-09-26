import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private ArrayList<Food> foodInventory;
    private ArrayList<Weapon> weapons;

    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
        this.inventory = new ArrayList<>();
        this.foodInventory = new ArrayList<>();
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void takeItem(Item item) {
        inventory.add(item);
    }

    public void dropItem(Item itemToDrop) {
        inventory.remove(itemToDrop);
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public ArrayList<Food> getInventory2() {
        return foodInventory;
    }

    public void takeFood(Food food) {
        foodInventory.add(food);
    }

    public void dropFood(Food food) {
        foodInventory.remove(food);
    }

    public void moveTo(Room nextRoom) {
        if (nextRoom != null) {
            currentRoom = nextRoom;
        }
    }

    public void eatFood(String foodName) {
        Food foodToEat = null;
        for (Food food : foodInventory) {
            if (food.getName().equalsIgnoreCase(foodName)) ;
            foodToEat = food;
            break;
        }

        if (foodToEat != null) {
            foodInventory.remove(foodToEat);
            System.out.println("You ate a " + foodToEat.getName());
        } else {
            System.out.println("Your inventory do not have a " + foodName);
        }
    }

    // viser inventory
    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("You to not have any items");
        } else {
            System.out.println("Your inventory contains: ");
            for (Item item : inventory) {
                System.out.println(item.getName());
            }
        }

        if (foodInventory.isEmpty()) {
            System.out.println("You do not have any food");
        } else {
            System.out.println("Your food inventory contains: ");
            for (Food food : foodInventory) {
                System.out.println(food.getName());
            }
        }
    }
}





