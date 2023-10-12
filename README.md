# Test Automation Framework for Trip-arc tech task

This project is a test automation framework that uses Java, Selenium, Junit5, and Cucumber to perform verification testing of Google search functionality. It can check if the search results match some expected criteria.

***

## Prerequisites

Java 17 or higher, Maven 3.9.5 or higher, Selenium WebDriver 3.141.59 or higher, Junit5 5.10.0 or higher, Cucumber 7.12.1 or higher, ChromeDriver 91.0.4472.101 or higher

## Installation

Clone this repository to your local machine using the command git clone https://github.com/nLevina/trip-arc-tech-task.git 

## Usage

To run the tests using Maven, use the command mvn test- To run the tests using Cucumber, use runner class - CucumberTest - The tests will launch a Chrome browser and navigate to https://www.google.com/ - The tests will enter different keywords, such as Zanzibar, in the search box and click on the search button - The tests will check if the search results match some expected criteria, such as result on Wikipedia 

## Features

The framework uses the Page Object Model (POM) design pattern to organize the web elements and actions for each page of the application - The framework uses Cucumber to write the test scenarios in a natural language (Gherkin) that is easy to understand and maintain - The framework uses Junit5 to manage the test execution and assertions - The framework uses Selenium WebDriver to interact with the web elements and perform actions on them
