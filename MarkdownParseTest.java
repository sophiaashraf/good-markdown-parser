import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Files;

public class MarkdownParseTest {

    @Test
    public void test1(){
        assertEquals(4,4);
    }

    //should return [google.com]
    @Test
    public void TestSnip1() throws IOException{
        List expected = List.of("google.com");

        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);

        System.out.println("Snippet 1: " + actual);

        assertEquals(expected, actual);
    }

    //should return [a.com], [a.com(())], [example.com]
    @Test
    public void TestSnip2() throws IOException{
        List expected = List.of("a.com", "a.com(())","example.com");

        Path fileName = Path.of("test-file10.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);

        System.out.println("Snippet 2: " + actual);

        assertEquals(expected, actual);
    }

    //should return [twitter.com], [https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule]
    @Test
    public void TestSnip3() throws IOException{
        List expected = List.of("twitter.com","https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");

        Path fileName = Path.of("test-file11.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);

        System.out.println("Snippet 3: " + actual);

        assertEquals(expected, actual);
    }

    // @Test
    // public void Test1() throws IOException{
    //     List expected = List.of("some-thing.html");

    //     MarkdownParse mpObj = new MarkdownParse();
    //     Path fileName = Path.of("/Users/sophia/Documents/GitHub/good-markdown-parser/test-file.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void Test2() throws IOException{
    //     List expected = List.of("https://something.com","some-page.html");

    //     Path fileName = Path.of("test-file2.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void Test3() throws IOException{
    //     List expected = List.of();

    //     Path fileName = Path.of("test-file3.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void Test4() throws IOException{
    //     List expected = List.of();

    //     Path fileName = Path.of("test-file4.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void Test5() throws IOException{
    //     List expected = List.of();

    //     Path fileName = Path.of("test-file5.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void Test6() throws IOException{
    //     List expected = List.of("page.com");

    //     Path fileName = Path.of("test-file6.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void Test7() throws IOException{
    //     List expected = List.of();

    //     Path fileName = Path.of("test-file7.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void Test8() throws IOException{
    //     List expected = List.of("a link on the first line");

    //     Path fileName = Path.of("test-file8.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> actual = MarkdownParse.getLinks(content);

    //     assertEquals(expected, actual);
    // }

    // @Test 
    // public void Test9() throws IOException{
    //     assertEquals(3 + 3, 6);
    // }
}

