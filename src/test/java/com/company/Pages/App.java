package com.company.Pages;

import com.company.Helpers.*;

public class App {
    public LoginHelpers login;
    public StartHelpers start;
    public CommonHelper commonHelper;
    public ComposeLetterHelpers compose;
    public LetterHelpers letter;

    public App() {
        login = new LoginHelpers();
        start = new StartHelpers();
        compose = new ComposeLetterHelpers();
        commonHelper = new CommonHelper();
        letter = new LetterHelpers();
    }
}