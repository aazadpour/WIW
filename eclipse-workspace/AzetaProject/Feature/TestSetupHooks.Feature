Feature: Test Order Hooks

Scenario: Setup driver and Test Before Running
Given The test is about to begin
When I run the test
Then the test will build the driver and its path

Scenario: Kill driver and Test After Running
Given The tests have been executed
When the tests have stopped running
Then The driver will be stopped