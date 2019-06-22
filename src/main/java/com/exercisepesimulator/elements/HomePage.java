package com.exercisepesimulator.elements;

import org.openqa.selenium.By;

public class HomePage {

  public static By tagHtml = By.tagName("html");

  public static By butReservedArea = By.cssSelector("#profile-link > div");

  public static By linkReservedArea = By.id("profile-link");

  public static By labelUserName = By
      .cssSelector("#root > div > div > header > ul > li:nth-child(2) > div > button > div > span");
}
