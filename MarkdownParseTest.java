import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }

    @Test
    public void testGetLinks0() throws IOException {
        Path filePath = Path.of("./test-file.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks1() throws IOException {
        Path filePath = Path.of("./test-file1.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("http://msdn.microsoft.com/en-us/library/aa752574(VS.85).aspx", "some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path filePath = Path.of("./test-file2.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path filePath = Path.of("./test-file3.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("http://msdn.microsoft.com/en-us/library/aa752574(VS.85).aspx", "some-thing.html", "some-thing2.html");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path filePath = Path.of("./test-file4.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }
}