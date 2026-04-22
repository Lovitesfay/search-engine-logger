import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a search term (X to exit): ");
        String outputFile = input.nextLine();
        LocalDateTime dateTime = LocalDateTime.of(2026, 4, 22, 5, 2);
      //  System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd" + " " + "HH:mm:ss" + " " )));
      //  System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd" + " " + "HH:mm:ss" + " " )));
      //  System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd" + " " + "HH:mm:ss" + " " )));
      //  System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd" + " " + "HH:mm:ss" + " " )));

        String outputSource = "src/main/resources/" + outputFile;



        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/logs.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("2026-04-22 12:42:20 launch\n");
            writer.write("2026-04-22 12:42:45 search : How to use ChatGPT\n");
            writer.write("2026-04-22 12:43:51 search : How to forge a camp knife\n");
            writer.write("2026-04-22 12:45:32 exit\n");

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
