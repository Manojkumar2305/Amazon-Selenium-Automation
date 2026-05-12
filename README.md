# Amazon-Selenium-Automation
Automated Amazon shoe search and filtering workflow using Selenium WebDriver, Java, TestNG, Maven, and Page Object Model (POM) framework with brand filtering, price range selection, scrolling, and dynamic result count validation.


# Amazon Shoes Automation

## Project Objective

Automate the Amazon website using Selenium WebDriver and TestNG.

The automation workflow performs:

* Open Amazon website
* Search for Shoes
* Apply Brand Filter → Nike
* Apply Price Filter → ₹2000 – ₹10000
* Count total displayed products
* Generate Extent Report

---

# Tech Stack

* Java
* Selenium WebDriver
* Maven
* TestNG
* Extent Reports

---

# Project Structure

```text
AmazonShoesAutomation
│
├── pom.xml
├── testng.xml
│
├── reports/
│
└── src
    ├── main
    │   └── java
    │       ├── driver
    │       │     └── DriverManager.java
    │       │
    │       ├── listeners
    │       │     └── TestListener.java
    │       │
    │       ├── pages
    │       │     └── AmazonPage.java
    │       │
    │       └── utils
    │             ├── ConfigReader.java
    │             └── ExtentManager.java
    │
    ├── test
    │   └── java
    │       └── tests
    │             └── AmazonShoesTest.java
    │
    └── resources
        └── config.properties
```
