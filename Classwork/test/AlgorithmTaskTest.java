package test;

import Chapter15.AlgorithmTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AlgorithmTaskTest {
//    @ParameterizedTest
//    @CsvSource({
//            "obi is a boy, a",
//            "life is tuff, is"
//
//    })
//    void shortestWordTest(String input, String expected) {
//        Assertions.assertEquals(expected, AlgorithmTask.getShortestWord(input));
//    }
//
//    @ParameterizedTest
//    @MethodSource()
//
//    void squaresTest(int numbers, int  expected) {
//        int [] squares = Sh
//        Assertions.assertEquals();
//    }

    @Test
    void testFindShortestWordOfSentence() {
        String shortestWord = AlgorithmTask.getShortestWord(".. Hippopotamus");
        Assertions.assertEquals("Hippopotamus", shortestWord);
    }
}
