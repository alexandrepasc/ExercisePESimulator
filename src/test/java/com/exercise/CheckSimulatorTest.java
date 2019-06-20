package com.exercise;

import com.exercisepesimulator.common.Elements;
import com.exercisepesimulator.common.ErrorText;
import com.exercisepesimulator.common.PreTest;
import com.exercisepesimulator.common.Utils;

import com.exercisepesimulator.elements.LoginPage;
import com.exercisepesimulator.um.UserImple;
import com.exercisepesimulator.um.UserProfile;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.rmi.CORBA.Util;

public class CheckSimulatorTest extends PreTest {

  UserProfile profile = new UserProfile();
  Elements element = new Elements(driver);

  @Parameters({ "browser", "gui" })
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional("firefox") String browser, @Optional("no") String gui)
    throws Exception {

    PreTest.beforeTest(browser, gui);

    driver.get(Utils.getLoginUrl());

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getLoginUrl(), ErrorText.VALUE.getText());

    UserImple.getLoginData(profile);
  }

  @Test(enabled = true, invocationCount = 1)
  public void simulatorUrl()
    throws Exception {

    element.sendKeys(LoginPage.inputMail, profile.getMail());
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
