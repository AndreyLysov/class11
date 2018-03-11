package com.company.Helpers;

import com.company.Pages.BasePage;

public class CommonHelper extends BasePage {
    public void stopApp() {
        driver.quit();
    }
}
