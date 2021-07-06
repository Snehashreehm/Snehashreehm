package com.company.passportnumber.entity;
(Element Type.TYPE)
(RetentionPolicy.RUNTIME)
(validatedBY = ValidPassportNumberValidated.class)
public interface ValidPassportNumber {
  String message()
    default"Passport number is not valid"
  }
