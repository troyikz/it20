package ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItemManager itemManager = new ItemManager();
        String command;

        while (true) {
            System.out.println("Enter a command (insert, update, find, delete, display, exit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "insert":
                    System.out.println("Enter item to insert: ");
                    itemManager.insertItem(scanner.nextLine());
                    break;
                case "update":
                    System.out.println("Enter index and new item (e.g., 0 newItem): ");
                    String[] updateInput = scanner.nextLine().split(" ", 2);
                    int updateIndex = Integer.parseInt(updateInput[0]);
                    itemManager.updateItem(updateIndex, updateInput[1]);
                    break;
                case "find":
                    System.out.println("Enter item to find: ");
                    int index = itemManager.findItem(scanner.nextLine());
                    System.out.println(index >= 0 ? "Item found at index: " + index : "Item not found.");
                    break;
                case "delete":
                    System.out.println("Enter index to delete: ");
                    itemManager.deleteItem(Integer.parseInt(scanner.nextLine()));
                    break;
                case "display":
                    itemManager.displayItems();
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
