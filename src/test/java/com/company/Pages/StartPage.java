package com.company.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartPage extends BasePage {
	@FindBy(xpath = "//li/span[@class='sn_menu_title']")
	private WebElement userEmail;

	@FindBy(xpath = "//p[@class='make_message']/a")
	private WebElement btnCreateLetter;

	@FindBy(xpath = "//ul[@class='ho_menu ho_menu-account']/li/span")
	private WebElement btnSettings;

	@FindBy(xpath = "//ul[@class='ho_popup_menu']/li[last()]/a")
	private WebElement btnLogout;

	public void openLetter(String sender) {
	    driver.findElement(By.xpath
                ("//div[@class='row new']/a/span[text()='" + sender +"']")).click();
    }

	public String getEmail() {
	    return userEmail.getText();
    }

    public void createLetter() {
		btnCreateLetter.click();
	}

	public void openSettings() {
		btnSettings.click();
	}

	public void logOut() {
		openSettings();
		wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
		btnLogout.click();
	}
}
