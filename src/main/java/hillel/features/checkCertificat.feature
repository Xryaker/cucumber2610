@ALL
Feature: check cer

#  Scenario Outline: scheck
#    When I open page "https://certificate.ithillel.ua/"
#    And cent cerNumber "<NUMBER>" "<RESULT>"
#    Examples:
#      | NUMBER   | RESULT |
#      | 45924126 | true   |
#      | 4566666  | false  |

  Scenario: open consultation form
    When I open page "https://dnipro.ithillel.ua/"
    And Click button cunsultation
    Then Check open consultation form "Запит на консультацію"

  Scenario: work with table
    When Create query
      | name    | mail              | telephone |
      | vasiliy | vasiok@gmail.com  | 123456789 |
      | Nikolay | somemail@mail.com | 987654321 |
      | Vitaliy | hdhdh@hhh.com     | 987456123 |

  Scenario: table
    When sout tableone
      | vasiliy |
      | nikolay |
      | vitalit |
      | dmitry  |

  Scenario: list maps
    When soutlistMAps
      | name    | mail              | telephone |
      | vasiliy | vasiok@gmail.com  | 123456789 |
      | Nikolay | somemail@mail.com | 987654321 |
      | Vitaliy | hdhdh@hhh.com     | 987456123 |
