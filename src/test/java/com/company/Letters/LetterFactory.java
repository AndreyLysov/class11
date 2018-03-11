package com.company.Letters;

import java.util.ResourceBundle;

public class LetterFactory {
    public static Letter getLetter () {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("letter");
        return new Letter(resourceBundle.getString("subject"),
                resourceBundle.getString("body"));
    }
}
