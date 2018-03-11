package com.company.Helpers;

import com.company.Letters.Letter;
import com.company.Letters.LetterFactory;
import com.company.Pages.ComposeLetterPage;
import com.company.Users.User;
import com.company.Users.UserFactory;

public class ComposeLetterHelpers extends ComposeLetterPage {

    static User receiver;
    public static Letter letter;
    static {
        receiver = UserFactory.getValidUser(2);
        letter = LetterFactory.getLetter();
    }

    public void composeAndSendValidLetter() {
        composeAndSend(receiver.getEmail(), letter.getSubject(), letter.getBody());
    }
}
