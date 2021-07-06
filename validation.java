package com.company.passportnumber.entity;

import java
 ("%s|name")
(name = "PASSPORTNUMBER_PERSON")
(name = "passportnumber$Person")
(groups = {Default.class, UiCrossFieldChecks.class})
 public class validation extends StandardEntity { 
   private static final long serialVersionUID = -915265486164;

(message = "Bad formed person name: $validatedValue}"
         regexp = "^[A-Z] [a-z](\\s(([a-z]{1,3})| (([a-z]+\\")? [A-Z] [a-z])))*$") @Length (min = 2)

 (name = "NAME", nullable = false)

protected String name;

(message "Email address has invalid format: ${validatedValue}", = regexp "^ [a-zA-Z0-9_.+]+@[a-zA-Z0-9-]+\\. [a-zA-Z0-9-.]+$") @Column (name="EMAIL", length = 120)
protected String email;

 Max(message = "Person height can not exceed 300 centimeters", value = "300")

 Min (message "Person height should be positive", value="8", inclusive = false) = protected BigDecimal height;

 (name = "HEIGHT")
 (name = "COUNTRY", nullable = false) protected Integer country;
 (name="PASSPORT NUMBER", nullable = false, length = 15) protected String passportNumber;
