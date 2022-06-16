package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyzer() throws MoodAnalyzerException {
        try {
            if(this.message.length()==0){
                throw new MoodAnalyzerException("Invalid mood", MoodAnalyzerException.ExceptionType.EMPTY);
            }
            if (this.message.toLowerCase().contains("sad")) {
                return "sad";
            }
            else {
                return "happy";
            }
        }
        catch (NullPointerException e) {
            return "happy";
        }
    }
}
