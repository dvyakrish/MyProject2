Feature: Data Table Verification

Scenario: Verify data table for login

Given Launch the Amazon Application
When Enter the userName and Password
|UserName|Password|
|9597752727|12365489|

Scenario: Verify data table for Search Field
Given Launch the Amazon Application
Then Search for the items
|Mobiles|
|Kitchens|
|WaterBottles|
|Phones|
|Test|