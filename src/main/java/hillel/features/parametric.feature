Feature:
  Scenario Outline:
    When I open page "https://<country>.wikipedia.org/"
    Then check
      |    | table1 | table2 | table3 | tab4 |  |  |
      | en |        |        |        |      |  |  |
      | fr |        |        |        |      |  |  |
      | ep |        |        |        |      |  |  |
    Examples:
      | country |
      | en      |
      | fr      |
      | ep      |
