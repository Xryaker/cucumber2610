@CER
Feature: check cer
  Scenario Outline: scheck
   When I open page "https://certificate.ithillel.ua/"
    And cent cerNumber "<NUMBER>"
    Examples:
      | NUMBER       |
      | 212325645665 |