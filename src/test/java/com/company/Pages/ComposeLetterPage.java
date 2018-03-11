package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposeLetterPage extends BasePage{
	@FindBy(xpath = "//textarea[@name='to']")
	private WebElement inputReceiver;

	@FindBy(name = "subject")
	private WebElement inputSubject;

	@FindBy(id = "text")
	private WebElement inputBody;

	@FindBy(name = "send")
	private WebElement btnSend;


	public void enterReceiver(String email) {
	    inputReceiver.sendKeys(email);
    }

    public void enterSubject(String subject) {
	    inputSubject.sendKeys(subject);
    }

    public void enterBody(String body) {
	    inputBody.sendKeys(body);
    }

    public void sendLetter() {
	    btnSend.click();
    }

    public void composeAndSend(String receiverEmail, String subject, String body) {
	    enterReceiver(receiverEmail);
	    enterSubject(subject);
	    enterBody(body);
	    btnSend.click();
    }
}
