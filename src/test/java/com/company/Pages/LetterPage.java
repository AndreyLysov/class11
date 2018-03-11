package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePage {
	@FindBy(xpath = "//div[@class='message_header clear']//h3")
	private WebElement txtSubject;

	@FindBy(xpath = "//div[@class='from']//b")
	private WebElement txtSender;

	@FindBy(xpath = "//div[@class='from']//a")
	private WebElement linkSenderEmail;

	@FindBy(xpath = "//div[@class='message_body']/pre")
	private WebElement txtBody;

	public String getSubject() {
	    return txtSubject.getText();
    }

    public String getSenderName() {
	    return txtSender.getText();
    }

    public String getSenderEmail() {
	    return linkSenderEmail.getText();
    }

    public String getEmailText() {
	    return txtBody.getText();
    }
}
