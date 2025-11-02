# PA - Advanced Programming Project

A JavaFX-based application project using Maven.

## Project Structure

```
PA/
├── src/
│   ├── main/
│   │   ├── java/com/pa/
│   │   │   ├── Main.java           # Main application entry point
│   │   │   └── MainController.java # Controller for the main view
│   │   └── resources/com/pa/
│   │       └── main-view.fxml      # FXML layout for the main view
│   └── test/
│       └── java/com/pa/
│           └── MainTest.java       # Unit tests
├── pom.xml                         # Maven configuration
└── README.md                       # This file
```

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building the Project

To compile the project:

```bash
mvn clean compile
```

## Running Tests

To run the unit tests:

```bash
mvn test
```

## Running the Application

To run the JavaFX application:

```bash
mvn javafx:run
```

## Features

- JavaFX UI with FXML layouts
- MVC architecture with separate controller classes
- Maven build system
- JUnit 5 for testing
