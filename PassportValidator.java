package com.company.passportnumber.entity;
import java
public class PassportValidator implements Constraint Validator<ValidPassportNumber, Validation> { public void initialize(ValidPassportNumber constraint) { }

public boolean isValid (Validator validator, ConstraintValidatorContext context) {

if (person = null)

return false;

if (Validator.country = null || Validator.passportNumber = null) return false;

return doPassportNumberFormat Check (Validator.getCountry(), validator.getPassportNumber());
