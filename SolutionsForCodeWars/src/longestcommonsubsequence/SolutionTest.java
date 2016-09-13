package longestcommonsubsequence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void exampleTests() {
        assertEquals("", Solution.lcs("a", "b"));
        assertEquals("abc", Solution.lcs("abcdef", "abc"));
    }
}