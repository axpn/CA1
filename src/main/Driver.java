package main;
import Controller.JewelleryStore;
import models.*;
import utils.ScannerInput;

public class Driver {
    private JewelleryStore jewelleryStore;

    private Containment containment;
    private Jewellery jewellery;

    public static void main(String[] args) {
    }

    private int jewelleryStore() {
        System.out.println("""
                 -------- Jewellery Store --------
                 | 1) Manage jewellery store     |
                 | 2) Display case MENU          |
                 | 3) Display tray MENU          |
                 |-------------------------------|
                 | 4) View all stock             |
                 | 5) Search for items           |
                 | 6) Smart add                  |
                 | 7) Smart remove               |
                 | 8) Value stock                |
                 |-------------------------------|
                 | 9) Reset                      |
                 | 10) Save and Load             |
                 |-------------------------------|
                 | 0) Exit                       |
                """);
        return ScannerInput.readNextInt("==>> ");
    }

    private void runJewelleryStore() {
        int option = jewelleryStore();
        while (option != 0) {
            switch (option) {
                case 1 -> manageJewelleryStore();
                case 2 -> runDisplayCaseMENU();
                case 3 -> runDisplayTrayMENU();
                case 4 -> showAllStock();
                case 5 -> searchForItems();
                case 6 -> smartAdd();
                case 7 -> smartRemove();
                case 8 -> valueStock();
                case 9 -> resetStore();
                case 10 -> saveLoad();
                default -> System.out.println("Invalid option entered" + option);
            }
            ScannerInput.readNextLine("\n Press the enter key to continue");
            option = jewelleryStore();
        }
        System.exit(0);
        System.out.println("Exiting...");
    }

    private int manageJewelleryStore() {
        System.out.println("""
                --------Manage Jewellery Store--------
                | 1) Add a new display case          |
                | 2) Delete a display case           |
                | 3) List all display case           |
                | 0) Return to last menu             |
                """);
        return ScannerInput.readNextInt("==>> ");
    }

    private void runStore(){
        int option = manageJewelleryStore();
        while (option != 0) {
            switch (option) {
                case 1 -> addDisplayCase();
                case 2 -> deleteDisplayCase();
                case 3 -> System.out.println(DisplayCase);
                case 0 -> runJewelleryStore();
                default -> System.out.println("Invalid option entered" + option);
            }
            ScannerInput.readNextLine("\n Press the enter key to continue");
            option = manageJewelleryStore();
        }
    }

    private int displayCaseMENU() {
        System.out.println("""
                --------Display Case Menu--------
                | 1) Add a new display tray     |
                | 2) Delete a display tray      |
                | 3) List all display tray      |
                | 0) Return to last menu        |
                """);
        return ScannerInput.readNextInt("==>> ");
    }

    private void runDisplayCaseMENU() {
        int option = displayCaseMENU();
        while (option != 0) {
            switch (option) {
                case 1 -> addDisplayTray();
                case 2 -> deleteDisplayTray();
                case 3 -> System.out.println(DisplayTray);
                case 0 -> runStore();
            }
            ScannerInput.readNextLine("\n Press the enter key to continue");
            option = displayCaseMENU();
        }
    }
}
