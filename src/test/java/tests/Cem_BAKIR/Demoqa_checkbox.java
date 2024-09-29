package tests.Cem_BAKIR;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class Demoqa_checkbox {


    // 1- https://www.demoqa.com/ adresine gidin
    // 2- form linkine a tiklayin, ardinda Elementler'e tiklayin
    // 3- check box a tiklayin ardindan home oku'na tiklayin
    // 4- desktop a tiklayin, notes ve commands check box larini seciniz
    // 5- notes ve checkbox larin secili oldugunu test edin
    // 6- Sayfayi kapatin

    @Test
    public void demoqaTesti(){
        // 1- https://www.demoqa.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        DemoqaPage demoqaPage = new DemoqaPage();
        // 2- form linkine a tiklayin, ardinda Elementler'e tiklayin
        demoqaPage.formLinki.click();
        ReusableMethods.bekle(1);
        demoqaPage.elementLinki.click();
        ReusableMethods.bekle(1);
        ReusableMethods.bekle(1);

        // 3- check box a tiklayin ardindan home a tiklayin
        demoqaPage.checkBoxLinki.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        demoqaPage.homeOku.click();
        ReusableMethods.bekle(1);

        // 4- desktop a tiklayin, notes ve commands check box larini seciniz
        demoqaPage.desktopOku.click();
        ReusableMethods.bekle(1);
        demoqaPage.noteCheckBoxu.click();
        ReusableMethods.bekle(1);
        demoqaPage.commandsCheckBoxu.click();

        ReusableMethods.bekle(1);

        Boolean expectedCommandsCheckBox = demoqaPage.commandsCheckBoxu.isSelected();
        Assert.assertEquals(demoqaPage.commandsCheckBoxu.isSelected(), expectedCommandsCheckBox);




        Driver.quitDriver();
    }

}
