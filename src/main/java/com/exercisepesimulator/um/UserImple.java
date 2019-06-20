package com.exercisepesimulator.um;

import com.exercisepesimulator.common.Utils;
import com.exercisepesimulator.um.UserProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserImple {

  public static UserProfile setProfile(UserProfile profile)
    throws Exception {

    profile.setSalt(Utils.getRandomValue(1111, 9999));

    profile.setMail("test".concat(Integer.toString(profile.getSalt())).concat("@mail.com"));

    profile.setPassword("123qweasd");

    //TODO generate random nif numbers
    profile.setNif("183533631");

    profile = setBirthDate(profile);

    List<Gender> valuesGender = Collections.unmodifiableList(Arrays.asList(Gender.values()));
    profile.setGender(valuesGender.get(Utils.getRandom(valuesGender.size())));

    //TODO generate zip code
    profile.setZipCode1(3810);
    profile.setZipCode2(055);

    profile.setPhone(Integer.toString(Utils.getRandomValue(111111111, 999999999)));

    return profile;
  }

  private static UserProfile setBirthDate(UserProfile profile)
    throws Exception {

    profile.setDayBirthDate(Utils.getRandomValue(1, 28));
    if (profile.getDayBirthDate() < 10) {
      profile.setBirthDate("0".concat(Integer.toString(profile.getDayBirthDate())));
    } else {
      profile.setBirthDate(Integer.toString(profile.getDayBirthDate()));
    }

    profile.setMonthBirthDate(Utils.getRandomValue(1, 12));
    if (profile.getMonthBirthDate() < 10) {
      profile.setBirthDate(profile.getBirthDate().concat("/0").concat(Integer.toString(profile.getMonthBirthDate())));
    } else {
      profile.setBirthDate(profile.getBirthDate().concat("/").concat(Integer.toString(profile.getMonthBirthDate())));
    }

    profile.setYearBirthDate(Utils.getRandomValue(1914, 2000));
    profile.setBirthDate(profile.getBirthDate().concat("/").concat(Integer.toString(profile.getYearBirthDate())));

    return profile;
  }
}
