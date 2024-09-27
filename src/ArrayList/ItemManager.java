package ArrayList;
import java.util.ArrayList;

public class ItemManager {
        private ArrayList<String> items;

    public ItemManager() {
        items = new ArrayList<>();
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            for (int i = 0; i < items.size(); i++) {
                System.out.println(i + ": " + items.get(i));
            }
        }
    }

    public void insertItem(String item) {
        items.add(item);
        System.out.println("Item added: " + item);
    }

    public void updateItem(int index, String newItem) {
        if (index >= 0 && index < items.size()) {
            items.set(index, newItem);
            System.out.println("Item updated at index " + index + ": " + newItem);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public int findItem(String item) {
        return items.indexOf(item);
    }

    public void deleteItem(int index) {
        if (index >= 0 && index < items.size()) {
            String removedItem = items.remove(index);
            System.out.println("Item deleted: " + removedItem);
        } else {
            System.out.println("Invalid index.");
        }
    }
}