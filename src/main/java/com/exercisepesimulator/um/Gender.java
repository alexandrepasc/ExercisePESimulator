package com.exercisepesimulator.um;

public enum Gender {

  MALE("Masculino"),
  FEMALE("Feminino"),
  OTHER("Outro");

  private String gender;

  public String getGender() {
    return gender;
  }

  Gender(String gender) {
    this.gender = gender;
  }
}
