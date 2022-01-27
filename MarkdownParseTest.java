import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException() {
        MarkdownParse.getLinks("test-file.md");
        assertEquals(List.of("https://something.com", "some-page.html")
        , MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }
}