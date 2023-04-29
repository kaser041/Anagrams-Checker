import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

@Test
public class AnagramsTest {

    public void singleWordAnagramsTest () {
        assertTrue(AnagramChecker.checkIfTextsAreAnagram("night","thing"));
    }

    public void multipleWordsAnagramsTest () {
        assertTrue(AnagramChecker.checkIfTextsAreAnagram("night dreads","sadder thing"));
    }

    public void singleWordNotAnagramsTest () {
        assertFalse(AnagramChecker.checkIfTextsAreAnagram("night","test"));
    }

    public void multipleWordsNotAnagramsTest () {
        assertFalse(AnagramChecker.checkIfTextsAreAnagram("night dreads","sadder test"));
    }

    public void emptyStringsTest () {
        assertTrue(AnagramChecker.checkIfTextsAreAnagram("",""));
    }

    public void bothNullTest () {
        assertTrue(AnagramChecker.checkIfTextsAreAnagram(null,null));
    }

    public void subjectNullTest () {
        assertFalse(AnagramChecker.checkIfTextsAreAnagram(null,"test"));
    }

    public void emptyStringSubjectTest () {
        assertFalse(AnagramChecker.checkIfTextsAreAnagram("","test"));
    }
}
