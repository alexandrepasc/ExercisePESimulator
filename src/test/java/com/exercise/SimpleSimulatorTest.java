package com.exercise;

import com.exercisepesimulator.common.Elements;
import com.exercisepesimulator.common.ErrorText;
import com.exercisepesimulator.common.PreTest;
import com.exercisepesimulator.common.Translations;
import com.exercisepesimulator.common.Utils;
import com.exercisepesimulator.elements.HomePage;
import com.exercisepesimulator.elements.LoginPage;
import com.exercisepesimulator.elements.SimpleSimulatorPage;
import com.exercisepesimulator.um.UserProfile;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleSimulatorTest extends PreTest {

  UserProfile profile = new UserProfile();
  //Elements element = new Elements(driver);

  @Parameters({ "browser", "gui", "user.name", "user.mail", "user.pwd" })
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional("firefox") String browser, @Optional("no") String gui, String userName,
      String userMail, String userPwd)
    throws Exception {

    PreTest.beforeTest(browser, gui);

    driver.get(Utils.getLoginUrl());

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getLoginUrl(), ErrorText.VALUE.getText());

    profile.setName(userName);
    profile.setMail(userMail);
    profile.setPassword(userPwd);

    Assert.assertTrue(doLogin(profile), ErrorText.WRONG.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void simpleSimulatorUrlTest()
    throws Exception {

    URL url = new URL(Utils.getSimpleSimulatorUrl());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");
    conn.connect();

    Assert.assertEquals(conn.getResponseCode(), 200, ErrorText.WRONG.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void simpleSimulatorFrameUrlTest()
    throws Exception {

    URL url = new URL(Utils.getSimpleSimulatorFrameUrl());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");
    conn.connect();

    Assert.assertEquals(conn.getResponseCode(), 200, ErrorText.WRONG.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void simpleSimulatorRequiredFieldsTest()
    throws Exception {

    Elements element = new Elements(driver);

    driver.get(Utils.getSimpleSimulatorFrameUrl());

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getSimpleSimulatorFrameUrl(), ErrorText.PAGE.getText());

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.butNextStep1), ErrorText.ELEMENT.getText());

    element.click(SimpleSimulatorPage.butNextStep1);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.labelDistrictFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(SimpleSimulatorPage.labelDistrictFeedback),
        Translations.labelDistrictFeedback(element), ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.labelCoutyFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(SimpleSimulatorPage.labelCoutyFeedback),
        Translations.labelCountyFeedback(element), ErrorText.VALUE.getText());

    element.click(SimpleSimulatorPage.selectDistrict);
    element.click(SimpleSimulatorPage.selectDistrictAveiro);
    element.click(SimpleSimulatorPage.butNextStep1);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.labelCoutyFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(SimpleSimulatorPage.labelCoutyFeedback),
        Translations.labelCountyFeedback(element), ErrorText.VALUE.getText());

    element.click(SimpleSimulatorPage.selectCounty);
    element.click(SimpleSimulatorPage.selectCountyAgueda);
    element.click(SimpleSimulatorPage.butNextStep1);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.butHabitationPopupClose), ErrorText.ELEMENT.getText());
    element.click(SimpleSimulatorPage.butHabitationPopupClose);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.butNextStep2), ErrorText.ELEMENT.getText());
    element.click(SimpleSimulatorPage.butNextStep2);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.butNextStepFinal), ErrorText.ELEMENT.getText());
    element.click(SimpleSimulatorPage.butNextStepFinal);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.labelElectricMarketerFeedback),
        ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(SimpleSimulatorPage.labelElectricMarketerFeedback),
        Translations.labelElectricMarketerFeedback(element), ErrorText.VALUE.getText());

    Utils.scrollToElement(driver, element.getElement(SimpleSimulatorPage.labelElectricMarketerTitle));
    element.click(SimpleSimulatorPage.selectElectricMarketer);
    element.click(SimpleSimulatorPage.selectElectricMarketerAudax);
    element.click(SimpleSimulatorPage.butNextStepFinal);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.labelGasMarketerFeedback),
        ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(SimpleSimulatorPage.labelGasMarketerFeedback),
        Translations.labelGasMarketerFeedback(element), ErrorText.VALUE.getText());

    Utils.scrollToElement(driver, element.getElement(SimpleSimulatorPage.labelGasMarketerTitle));
    element.click(SimpleSimulatorPage.selectGasMarketer);
    element.click(SimpleSimulatorPage.selectGasMarketerEdp);
    element.click(SimpleSimulatorPage.butNextStepFinal);

    Assert.assertTrue(element.checkElement(SimpleSimulatorPage.labelResultTitle), ErrorText.ELEMENT.getText());
    Assert.assertEquals(driver.getCurrentUrl(), Utils.getSimpleSimulatorResultUrl(), ErrorText.PAGE.getText());
  }

  private boolean doLogin(UserProfile profile)
    throws Exception {

    Elements element = new Elements(driver);

    Utils.waitingUntil(driver, LoginPage.inputMail, 60, Utils.WaitUntil.VISIBILITY);

    element.sendKeys(LoginPage.inputMail, profile.getMail());

    element.sendKeys(LoginPage.inputPassword, profile.getPassword());

    element.click(LoginPage.butLogin);

    Utils.waitingUntil(driver, HomePage.labelUserName, 60, Utils.WaitUntil.VISIBILITY);

    if (element.getText(HomePage.labelUserName).contains(profile.getName())) {

      return true;
    } else {

      return false;
    }

    //return true;
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
