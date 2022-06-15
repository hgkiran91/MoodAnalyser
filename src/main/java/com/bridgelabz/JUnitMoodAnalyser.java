package com.bridgelabz;

public class JUnitMoodAnalyser {
    String message;
    public JUnitMoodAnalyser(String message) {
        this.message = message;
    }

    public String moodAnalyser() {
        if (this.message.toLowerCase().contains("sad")) {
            return "sad";
        } else {
            return "happy";
        }
    }
}
