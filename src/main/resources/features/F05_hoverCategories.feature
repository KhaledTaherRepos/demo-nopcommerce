Feature: Hover main categories
  Scenario: hover on one of main categories then click in sub category
    Given In home page hover in main categories
    When Sub category list appears click on random sub category
    Then Subcategory name appears in page