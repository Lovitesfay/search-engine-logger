import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/logs.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);


            while (true) {
                System.out.print("Enter a search term (X to exit): ");
                String time = LocalDateTime.now().format(dateTime);
                String searchTerm = input.nextLine();


                if (searchTerm.equalsIgnoreCase("X")) {
                    writer.write(time + " exit\n");
                    break;
                } else {
                    writer.write(time + " " + searchTerm + "\n");
                }
                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
