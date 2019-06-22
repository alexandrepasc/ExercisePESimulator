package com.exercisepesimulator.elements;

import org.openqa.selenium.By;

public class LoginPage {

  public static By labelTitle = By.cssSelector("#adene-login > div > h2");

  public static By labelLoginTitle = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > h3");

  public static By inputMail = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(3) > label > input");

  public static By labelMailFeedback = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(3) > label > span");

  public static By inputPassword = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(4) > label > input");

  public static By labelPasswordFeedback = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(4) > label > span");

  public static By butLogin = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(5) > div > button");

  public static By butRecoverPwd = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > a");

  public static By butGovAuth = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(9) > form > button");

  public static By imgGovHeader = By.cssSelector(
      "#aspnetForm > div.container.container-page.container-page-height > div.fd > div.row.logo > div > a > img");

  public static By butATAuth = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div.sc-iwsKbI.ctZuQQ > form > button");

  public static By butRegister = By
      .cssSelector("#auth-card > div > div.sc-gZMcBi.gwjsYB > div.sc-iwsKbI.kxdJwJ > button");
}
