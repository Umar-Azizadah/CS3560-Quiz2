# CS3560 Quiz 2 — JUnit 5 and TDD

## Project Overview
This project uses Java, JUnit 5, and Test-Driven Development (TDD) to implement and test two classes:

- **Calculator:** Performs addition, subtraction, multiplication, integer division, and checks whether a number is even.
- **DateChecker:** Determines whether a month has 31 days, using a Month enum and exception handling for invalid input.

## Running Tests
1. Open the project in IntelliJ IDEA.
2. Make sure Maven dependencies are loaded.
3. Right-click the `src/test/java` folder and select **Run All Tests**.

Alternatively, run the following command in the terminal:

`mvn test`

## TDD Reflection
For this assignment, I used Test-Driven Development (TDD) to implement and test the Calculator and DateChecker classes using JUnit 5. I followed the Red-Green-Refactor process by writing failing tests first, implementing enough code to make them pass, and refactoring when needed. I also followed the Build, Operate, Check flow from the lecture by setting up the expected result, calling the method to get the actual result, and using JUnit assertions to compare them. I tested edge cases such as division by zero, negative numbers, and invalid month inputs. Overall, this assignment helped me understand how TDD can catch errors early, while GitHub commits helped me track my progress throughout development.
