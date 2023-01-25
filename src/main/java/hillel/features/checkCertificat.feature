@ALL
Feature: check cer

  Scenario Outline: scheck
    When I open page "https://certificate.ithillel.ua/"
    And cent cerNumber "<NUMBER>" "<RESULT>"
    Examples:
      | NUMBER   | RESULT |
      | 45924126 | true   |
      | 4566666  | false  |