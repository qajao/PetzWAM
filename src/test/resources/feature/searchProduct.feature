Feature: Seach a Product
  Scenario: Search a Simple Product with Sucess
    Given I acess Petz homepage
    When I search "Aquário Curvo Boyu Led EA-100E 125L"
    Then I see a list of product "Aquário Curvo Boyu Led EA-100E 125L"
    And I click at product "Aquário Curvo Boyu Led EA-100E 125L"
    Then Show the title "Aquário Curvo Boyu Led EA-100E 125L" and price "R$ 2.099,99"
