package com.exercisepesimulator.elements;

import org.openqa.selenium.By;

public class SimpleSimulatorPage {

  public static By labelSimpleSimulatorTest = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-bbmXgH.fNYDXK > div.sc-jqCOkK.fixed-container.gkwKbM > div:nth-child(1) > div > h2");

  public static By butElectricity = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-bbmXgH.fNYDXK > div.sc-jqCOkK.fixed-container.gkwKbM > div:nth-child(1) > div > div > div:nth-child(1)");

  public static By butGas = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-bbmXgH.fNYDXK > div.sc-jqCOkK.fixed-container.gkwKbM > div:nth-child(1) > div > div > div:nth-child(2)");

  public static By butElectricityGas = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-bbmXgH.fNYDXK > div.sc-jqCOkK.fixed-container.gkwKbM > div:nth-child(1) > div > div > div:nth-child(3)");

  public static By labelAdults = By.cssSelector("#habitants > div > div > div:nth-child(1) > div");

  public static By butAdultsMinus = By
      .cssSelector("#habitants > div > div > div:nth-child(1) > button.sc-eHgmQL.cPqgzi");

  public static By butAdultsPlus = By
      .cssSelector("#habitants > div > div > div:nth-child(1) > button.sc-eHgmQL.cXTZgb");

  public static By butUseTypeNormal = By.cssSelector("#undefined-9 > div.box.sc-fAjcbJ.cvuaDh");

  public static By butUseTypePermanent = By.cssSelector("#undefined-10 > div.box.sc-fAjcbJ.izugQM");

  public static By butUseTypePontual = By.cssSelector("#undefined-43 > div.box.sc-fAjcbJ.izugQM");

  public static By checkBuiltYearTill2000 = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-bbmXgH.fNYDXK > div.sc-jqCOkK.fixed-container.gkwKbM > div:nth-child(4) > div > ul > li:nth-child(3) > div");

  public static By selectDistrict = By.cssSelector("#location > div > div > div:nth-child(1) > div");

  public static By selectDistrictAveiro = By
      .cssSelector("#location > div > div > div:nth-child(1) > div > div.sc-kvZOFW.kIHzzN > div:nth-child(1)");

  public static By labelDistrictFeedback = By.cssSelector("#location > div > div > div:nth-child(1) > span");

  public static By selectCounty = By.cssSelector("#location > div > div > div:nth-child(2) > div");

  public static By selectCountyAgueda = By
      .cssSelector("#location > div > div > div:nth-child(2) > div > div.sc-kvZOFW.kIHzzN > div:nth-child(1)");

  public static By labelCoutyFeedback = By.cssSelector("#location > div > div > div:nth-child(2) > span");

  public static By butNextStep1 = By.cssSelector("#buttons-simulator > button");

  public static By labelHabitationPopupTitle = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-dNoQZL.iedJWt > div.sc-jqCOkK.fixed-container.gkwKbM > div.sc-dOkuiw.cBaJzZ.sc-kUaPvJ.cJXKRp > div.show.sc-iqzUVk.kNYFwz > div > header");

  public static By butHabitationPopupClose = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-dNoQZL.iedJWt > div.sc-jqCOkK.fixed-container.gkwKbM > div.sc-dOkuiw.cBaJzZ.sc-kUaPvJ.cJXKRp > div.show.sc-iqzUVk.kNYFwz > div > span");

  public static By butNextStep2 = By.cssSelector("#buttons-simulator > button.sc-iAyFgw.egRaBp.sc-fjdhpX.fzWIcs");

  public static By labelBillingTitle = By.cssSelector(
      "#adene-simulador-simples > div > div.sc-iyvyFf.eAjCtQ > div.sc-jqCOkK.fixed-container.gkwKbM > div:nth-child(1) > div > h2");

  public static By labelElectricMarketerTitle = By.cssSelector("#comerel > div > h2");

  public static By selectElectricMarketer = By.cssSelector("#comerel > div > div > div");

  public static By selectElectricMarketerAudax = By
      .cssSelector("#comerel > div > div > div > div.sc-hqyNC.juFRDt.sc-kvZOFW.kIHzzN > div:nth-child(1)");

  public static By labelElectricMarketerFeedback = By.cssSelector("#comerel > div > span");

  public static By labelGasMarketerTitle = By.cssSelector("#comerg > div > h2");

  public static By selectGasMarketer = By.cssSelector("#comerg > div > div > div");

  public static By selectGasMarketerEdp = By
      .cssSelector("#comerg > div > div > div > div.sc-hqyNC.juFRDt.sc-kvZOFW.kIHzzN > div:nth-child(2)");

  public static By labelGasMarketerFeedback = By.cssSelector("#comerg > div > div > span");

  public static By butNextStepFinal = By.cssSelector("#buttons-simulator > button.sc-iAyFgw.egRaBp.sc-fjdhpX.fzWIcs");

  public static By labelResultTitle = By.cssSelector("#results > div > h2");
}
