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

    @Test
    public void testGetLinks5() throws IOException {
        Path filePath = Path.of("./new-test-file2.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks6() throws IOException {
        Path filePath = Path.of("./new-test-file3.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks7() throws IOException {
        Path filePath = Path.of("./new-test-file4.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path filePath = Path.of("./new-test-file5.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks9() throws IOException {
        Path filePath = Path.of("./new-test-file6.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks10() throws IOException {
        Path filePath = Path.of("./new-test-file7.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks11() throws IOException {
        Path filePath = Path.of("./new-test-file8.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks12() throws IOException {
        Path filePath = Path.of("./new-test-file.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testGetLinks13() throws IOException {
        Path filePath = Path.of("./test-file5.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("something.com");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    @Test
    public void testWeek8File0() throws IOException {
        Path filePath = Path.of("./week8-test-file.md");
        String test_file = Files.readString(filePath);
        List<String> expected = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(expected, MarkdownParse.getLinks(test_file));
    }

    // @Test
    // public void testWeek8File1() throws IOException {
    //     Path filePath = Path.of("./week8-test-file1.md");
    //     String test_file = Files.readString(filePath);
    //     List<String> expected = List.of("a.com", "a.com(())", "example.com");
    //     assertEquals(expected, MarkdownParse.getLinks(test_file));
    // }

    // @Test
    // public void testWeek8File2() throws IOException {
    //     Path filePath = Path.of("./week8-test-file2.md");
    //     String test_file = Files.readString(filePath);
    //     List<String> expected = List.of("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/");
    //     assertEquals(expected, MarkdownParse.getLinks(test_file));
    // }
}
