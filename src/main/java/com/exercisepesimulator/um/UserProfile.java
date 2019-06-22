package com.exercisepesimulator.um;

public class UserProfile {

  private String name;

  private String mail;

  private String password;

  private String nif;

  private String birthDate;
  private int dayBirthDate;
  private int monthBirthDate;
  private int yearBirthDate;

  private Gender gender;
  
  private int zipCode1;
  
  private int zipCode2;

  private String phone;

  private int salt;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNif() {
    return nif;
  }

  public void setNif(String nif) {
    this.nif = nif;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public int getZipCode1() {
    return zipCode1;
  }

  public void setZipCode1(int zipCode1) {
    this.zipCode1 = zipCode1;
  }

  public int getZipCode2() {
    return zipCode2;
  }

  public void setZipCode2(int zipCode2) {
    this.zipCode2 = zipCode2;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getSalt() {
    return salt;
  }

  public void setSalt(int salt) {
    this.salt = salt;
  }

  public int getDayBirthDate() {
    return dayBirthDate;
  }

  public void setDayBirthDate(int dayBirthDate) {
    this.dayBirthDate = dayBirthDate;
  }

  public int getMonthBirthDate() {
    return monthBirthDate;
  }

  public void setMonthBirthDate(int monthBirthDate) {
    this.monthBirthDate = monthBirthDate;
  }

  public int getYearBirthDate() {
    return yearBirthDate;
  }

  public void setYearBirthDate(int yearBirthDate) {
    this.yearBirthDate = yearBirthDate;
  }
}
