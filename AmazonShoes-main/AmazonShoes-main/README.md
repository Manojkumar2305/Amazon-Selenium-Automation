# Amazon Shoes Automation

## Project Objective

Automate Amazon website using Selenium WebDriver and TestNG.

The automation performs:

- Open Amazon website
- Search for Shoes
- Apply Brand Filter → Nike
- Apply Price Filter → ₹2000 – ₹10000
- Count total displayed products
- Generate Extent Report

---

# Tech Stack

- Java
- Selenium WebDriver
- Maven
- TestNG
- Extent Reports

---

# Project Structure

AmazonShoesAutomation

├── pom.xml  
├── testng.xml  

├── reports/  

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
    └── test  
        ├── java  
        │     └── tests  
        │           └── AmazonShoesTest.java  
        │
        └── resources  
              └── config.properties

---

#
