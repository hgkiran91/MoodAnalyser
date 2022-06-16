package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyzer() throws MoodAnalyzerException {
        try {
            if (this.message.toLowerCase().contains("sad")) {
                return "sad";
            } else
                return "happy";
        }
        catch (NullPointerException e) {
            return "happy";
        }
    }
}
