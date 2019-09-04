import History.FileHistory;
import History.ReadFile;
import History.WriteFile;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertTrue;

public class FileHistoryTest {

    private FileHistory fileHistory;

    @Before
    public void setUp() {
        fileHistory = new FileHistory();
    }

    @Test
    public void testGetHistory() throws IOException {
        Set<String> actualSet = new HashSet<>();
        actualSet.add("fA3419VUSBCpv-KacF1A_g");
        actualSet.add("mDB0bXSeTqCUr6fdS3c-lQ");
        actualSet.add("d1alfGddT1ysae8JCv4mfg");
        actualSet.add("YgthXyg0S6C7iW_uQF1xSQ");
        actualSet.add("XB5QjxYMQoKRaXC_S-jdiQ");
        actualSet.add("qLLJSXmMQp2iNxpI2Ht7DA");
        actualSet.add("CvhhOm7nRUaHAHBGXmzr9w");
        actualSet.add("gs8GGfRfRAiMvmdeP2Mg9A");

        PrintWriter writer = new PrintWriter("History.txt");
        writer.print("");
        writer.close();

        Iterator<String> setIterator = actualSet.iterator();
        while (setIterator.hasNext()) {
            String temp = setIterator.next();
            String formString = String.format("%1$s\n", temp);
            WriteFile.writeByte(formString.getBytes());
        }
        assertTrue(actualSet.containsAll(fileHistory.getHistory()));
    }

    @Test
    public void testSaveHistory() throws FileNotFoundException {
        Set<String> actualSet = new HashSet<>();
        actualSet.add("fA3419VUSBCpv-KacF1A_g");
        actualSet.add("mDB0bXSeTqCUr6fdS3c-lQ");
        actualSet.add("d1alfGddT1ysae8JCv4mfg");
        actualSet.add("YgthXyg0S6C7iW_uQF1xSQ");
        actualSet.add("XB5QjxYMQoKRaXC_S-jdiQ");
        actualSet.add("qLLJSXmMQp2iNxpI2Ht7DA");
        actualSet.add("CvhhOm7nRUaHAHBGXmzr9w");
        actualSet.add("gs8GGfRfRAiMvmdeP2Mg9A");

        PrintWriter writer = new PrintWriter("History.txt");
        writer.print("");
        writer.close();

        assertTrue(fileHistory.saveHistory(actualSet));
    }
}
