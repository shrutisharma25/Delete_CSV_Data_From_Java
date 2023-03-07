import java.io.*;

public class Jpo {
    public static void main(String[] args) {
        String filePath = "output.csv";

        try {
            PrintWriter writer = new PrintWriter(filePath);
            writer.print(""); // Overwrite the file with an empty string
            writer.close();

            System.out.println("CSV file deleted successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while deleting the CSV file.");
            e.printStackTrace();
        }
    }
}
