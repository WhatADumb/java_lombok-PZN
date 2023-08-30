package self.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class FileHelperTest {
    @Test
    void testPom(){
        String files = FileHelper.fileLoader("help.md");
        System.out.println(files);
    }

    @Test
    void testThrow() {
        Assertions.assertThrows(FileNotFoundException.class, () -> {
            FileHelper.fileLoader("sample.txt");
        });
    }
}
