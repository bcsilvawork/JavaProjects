// Sample comment

import Utils.FileReadWrite;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        String pathInitialMenu = "src\\Files\\InitialMenu.txt";
        String pathSignUp = "src\\Files\\SignUp.txt";
        int input;
        input = FileReadWrite.printAndReadFile(pathInitialMenu);
        String[] inputsLoginSignUp = new String[3];
        switch (input) {
            case 1: inputsLoginSignUp = FileReadWrite.printAndReadInput(pathSignUp, 3);
            default:
                throw new IllegalArgumentException("Invalid Input. Please enter a valid input!");
        }
    }
}
