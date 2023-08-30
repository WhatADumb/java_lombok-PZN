package self.java.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.util.Scanner;

@Slf4j
public class FileHelper {
    @SneakyThrows
    public static String fileLoader(String fileName){
        log.info("Load File: {}", fileName);

        @Cleanup FileReader reader = new FileReader(fileName);
        @Cleanup Scanner scanner = new Scanner(reader);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine()).append("\n");
        }

        return stringBuilder.toString();
    }
}
