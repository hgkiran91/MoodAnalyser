package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenContainsSadItShouldReturnSadMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String actualResult = moodAnalyzer.moodAnalyzer();
        String expectedMood = "sad";
        Assertions.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenContainsHappyItShouldReturnHappyMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
        String actualResult = moodAnalyzer.moodAnalyzer();
        String expectedMood = "happy";
        Assertions.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenContainsAnyMoodItShouldReturnAnyMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String actualResult = moodAnalyzer.moodAnalyzer();
        String expectedMood = "happy";
        Assertions.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenNullItShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("null");
        String actualResult;
        try {
            actualResult = moodAnalyzer.moodAnalyzer();
        } catch (MoodAnalyzerException e) {
            String expectedMood = "happy";
            Assertions.assertEquals(expectedMood, e.message);
        }
    }

    @Test
    public void givenMessageWhenEmptyShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
        String actualResult;
        try {
            actualResult = moodAnalyzer.moodAnalyzer();
        } catch (MoodAnalyzerException e) {
            MoodAnalyzerException.ExceptionType expectedMood=MoodAnalyzerException.ExceptionType.EMPTY;
            System.out.println(e);
            Assertions.assertEquals(expectedMood,e.exceptionType);
        }
    }
}
