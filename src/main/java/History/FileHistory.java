package History;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHistory implements History {

    @Override
    public Set<String> getHistory() throws IOException {
        String readFile = ReadFile.readFile("History.txt");
        String[] parsReadFile = readFile.split("\\s");
        return Stream.of(parsReadFile).collect(Collectors.toSet());

    }

    @Override
    public boolean saveHistory(Set<String> history) {
        Iterator<String> setIterator = history.iterator();
        while (setIterator.hasNext()) {
            String temp = setIterator.next();
            String formString = String.format("%1$s\n", temp);
            WriteFile.writeByte(formString.getBytes());
        }
        return true;
    }
}
