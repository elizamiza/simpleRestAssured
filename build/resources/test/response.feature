Feature: make sure restful service is responding

    Scenario: a sample run
        Given the service is running
        When I submit the correct parameters to the service
        Then I receive the expected output
