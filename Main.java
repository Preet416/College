package singlylinkedlistdemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice;

        while (true) {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete by Value");
            System.out.println("5. Display List");
            System.out.println("6. Size of List");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    int valPos = sc.nextInt();
                    System.out.print("Enter position (0-based): ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(valPos, pos);
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    list.deleteByValue(sc.nextInt());
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Size: " + list.size());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
