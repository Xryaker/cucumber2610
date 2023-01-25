@ALL
Feature: Some test

  Scenario: Print some text
    Given Print text Givem
    Given Print TEXT WHEN
    And Print text And
    Then Print text THEN

  Scenario: Print text inviroment
    Given Open page "hhtps://youtube.com"
    When Print text And
    Then Check title "Youtube" and "text"

  Scenario Outline: Outline1
    Given Print "<NAME>"
    Examples:
      | NAME     |
      | vasiliy  |
      | nikolay  |
      | viktoria |
      | oksana   |
      | oleg     |
      | dmitry   |

    Scenario Outline: Outline2
      Given Print "<NAME>"
      Then Print "<FAMILY>"
      And Print "<DATA>" and "<SEX>"
      Examples:
        | NAME    | FAMILY     | DATA  | SEX |
        | Vasiliy | Shevchenko | 26.04 | men |


