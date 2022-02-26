import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{
        assertEquals(List.of("another link","cod[e","code]")
        , MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    }

    @Test
    public void testGetLinks2() throws IOException{
        assertEquals(List.of("nested link","a nested parenthesized url", "some escaped [ brackets ]")
        , MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
    }
    @Test
    public void testGetLinks3() throws IOException{
        assertEquals(List.of("https://www.twitter.com","this title text is really long and takes up more than one line", "https://cse.ucsd.edu/")
        , MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
    }
}