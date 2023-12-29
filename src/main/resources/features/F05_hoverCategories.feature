@smoke
Feature: F05_hoverCategories | User clicks on the main category or hover and select sub-category
  Scenario: User can click on sub-categories
    When User hover on main category computers and clicks on a sub-category
    Then the sub-category title is (equal or contains) while selecting software
