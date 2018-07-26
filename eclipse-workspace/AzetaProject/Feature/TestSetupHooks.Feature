Feature: Test Order Hooks

Scenario: Setup driver and Test Before Running
Given The test is about to begin
When  the Driver is set and the path is correctly set
Then start up the driver

Scenario: Kill driver and Test After Running
Given  tests have finished running 
When tests are not throwing compile errors
Then The driver will be stopped