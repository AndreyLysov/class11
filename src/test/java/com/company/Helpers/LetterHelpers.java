package com.company.Helpers;

import com.company.Letters.Letter;
import com.company.Pages.LetterPage;

public class LetterHelpers extends LetterPage {
    public Letter getLetter() {
        return new Letter(getSubject(), getEmailText());
    }


}
