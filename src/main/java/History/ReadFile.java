package History;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFile {
    public static String readFile(String path) throws IOException {
        byte[] array = Files.readAllBytes(new File(path).toPath());
        return new String(array);
    }
}
