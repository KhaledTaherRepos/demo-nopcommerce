# NopCommerce Automation Testing Project

This project is a test automation suite for the NopCommerce application. It uses Java, Selenium WebDriver, and Cucumber to perform end-to-end testing.

## Project Structure

```plaintext
demo_nopcommerce/
│
├── dependencies.png                # Image showing project dependencies
├── environment path.png            # Image showing environment paths
├── plugins.png                     # Image showing installed plugins
├── pom.xml                         # Maven configuration file
├── src/                            # Source directory
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       └── Main.java       # Main class
│   │   └── resources/
│   │       └── features/           # Cucumber feature files
│   │           ├── F01_Registration.feature
│   │           ├── F02_Login.feature
│   │           ├── F03_currencies.feature
│   │           ├── F04_Search.feature
│   │           ├── F05_hoverCategories.feature
│   │           ├── F06_homeSliders.feature
│   │           ├── F07_followUs.feature
│   └── test/
│       └── java/
│           └── org/example/
│               ├── pages/          # Page object models
│               │   ├── P01_register.java
│               │   ├── P02_login.java
│               │   ├── P03_homepage.java
│               └── stepDefs/       # Step definitions
│                   ├── D01_RegStepDef.java
│                   ├── D02_loginStepDef.java
│                   ├── D03_currenciesStepDef.java
│                   ├── D04_searchStepDef.java
│                   ├── D05_hoverCategoriesStepDef.java
│                   ├── D06_homeSlidersStepDef.java
│                   ├── D07_followUsStepDef.java
│                   └── Hooks.java
└── .idea/                          # IntelliJ IDEA project files

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- An IDE such as IntelliJ IDEA or Eclipse
- WebDriver for the browser you intend to use (e.g., ChromeDriver)

## Setup

1. **Clone the repository**:
   ```bash
   git clone <repository_url>
   cd demo_nopcommerce```

2. **Install dependencies:**:
    ```bash
    mvn install```

3. **Run tests:**:

    ```bash
    mvn test -DxmlFilePath=testng```

    

## Features

- **Registration Tests**: Verify user registration functionality.
- **Login Tests**: Verify user login functionality.
- **Currency Tests**: Verify currency change functionality.
- **Search Tests**: Verify search functionality.
- **Category Hover Tests**: Verify category hover functionality.
- **Home Sliders Tests**: Verify home slider functionality.
- **Follow Us Tests**: Verify social media follow functionality.

## Additional Information

- The project uses Cucumber for behavior-driven development (BDD). Feature files are located in `src/main/resources/features`.
- Page Object Model (POM) pattern is used for creating page classes located in `src/test/java/org/example/pages`.
- Step definitions are in `src/test/java/org/example/stepDefs`.

