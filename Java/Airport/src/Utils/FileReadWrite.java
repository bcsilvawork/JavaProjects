package Utils;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite {

    private static Scanner scanner = new Scanner(System.in);

    public static int printAndReadFile(String path){
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return scanner.nextInt();
    }

    public static String[] printAndReadInput(String path, int expectedOutputs){
        int i = 0;
        String line;
        String[] results = new String[expectedOutputs];
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                results[i++] = scanner.next();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return results;
    }
}
