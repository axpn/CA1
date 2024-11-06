package main;
import models.Cabinet;
import models.Containment;
import models.Jewellery;
import models.JewelleryStore;
import utils.ScannerInput;

public class Driver {
    private JewelleryStore jewelleryStore;
    private Cabinet cabinet;
    private Containment containment;
    private Jewellery jewellery;

    public static void main(String[] args) {
    }

    private int jewelleryStore() {
        System.out.println("""
                 --------- Jewellery Store ---------
                 | 1) Display case MENU            |
                 | 2) Display tray MENU            |
                 | 3) Display jewellery MENU       |
                 |---------------------------------|
                 | 4) View all stock               |
                 | 5) Search for items             |
                 | 6) Smart add                    |
                 | 7) Smart remove                 |
                 | 8) Value stock                  |
                 |---------------------------------|
                 | 9) Reset                        |
                 | 10) Save and Load               |
                 |---------------------------------|
                 | 0) Exit                         |
                """);
        return ScannerInput.readNextInt("==>> ");
    }

    private void runJewelleryStore() {
        int option = jewelleryStore();
        while (option != 0) {
            switch (option) {
                case 1 -> runDisplayCaseMENU();
                case 2 -> runDisplayTrayMENU();
                case 3 -> runJewelleryMENU();
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

    private int displayCaseMENU() {
        System.out.println("""
                ---------Display case MENU ---------
                | 1) Add a new display case        |
                | 2) Delete a display case         |
                | 3) List all display case         |
                | 4) Return to Jewellery Store     |
                """);
        return ScannerInput.readNextInt("==>> ");
    }

    private void runDisplayCaseMENU(){
        int option = displayCaseMENU();
        while (option != 0) {
            switch (option) {
                case 1 -> addDisplayCase();
                case 2 -> deleteDisplayCase();
                case 3 -> System.out.println();
            }
        }
    }

}
