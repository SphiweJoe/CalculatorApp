
---

# Calculator Application

A simple web-based calculator application built using **Java**, **HTML**, and **CSS**. The calculator takes in a mathematical expression via the UI, processes it, and returns the calculated result. If the input is invalid, an error message is displayed. The application runs on **localhost** using **port 8080**.

## Languages Used
- **Java** (Backend)
- **HTML** (Frontend)
- **CSS** (Frontend)

## Testing Methods
- **JUnit** (Unit testing)
- **Mockito** (Mock testing)

## Project Structure

```
calculator-app/
│
├── src/
│   ├── mainCalculator/
│   │   ├── Calculator.java          # Main logic for calculation
│   │   └── CalculatorApp.java       # Entry point for the application
│   │
│   └── testCalculator/
│       ├── CalculatorTest.java      # Unit tests for Calculator.java
│       └── CalculatorAppTest.java   # Tests for CalculatorApp.java
│
├── resources/
│   └── static/
│       ├── index.html               # HTML for calculator UI
│       └── styles.css               # CSS for styling the UI
│
└── pom.xml                         # Maven dependencies and configuration
```

## Features
- **Input Handling**: The calculator UI allows the user to enter a mathematical expression.
- **Error Handling**: If the input is invalid (e.g., malformed expression), an error message is displayed.
- **Expression Evaluation**: The backend processes the input expression and returns the computed result.
- **Port 8080**: The application runs on **localhost:8080**, accessible via a web browser.

## How to Run

1. Clone this repository:
   ```bash
   git clone <repository-url>
   cd calculator-app
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Open your web browser and navigate to `http://localhost:8080` to use the calculator.

## Testing

Unit tests are included using **JUnit** and **Mockito** for mocking dependencies. To run the tests:

1. Use Maven to run the tests:
   ```bash
   mvn test
   ```

2. The test results will be available in the console output or within the `target/test-classes` directory.

3. The below are screenshots of the tests run and the output/results:

![Screenshot 2025-02-17 111921](https://github.com/user-attachments/assets/4adebe40-194e-4e83-ade3-745ec934b980)
![Screenshot 2025-02-17 112138](https://github.com/user-attachments/assets/3f38eea0-6091-4d34-82d4-a1046263e59d)
![Screenshot 2025-02-17 112259](https://github.com/user-attachments/assets/301fb96f-1e80-4c76-b329-8b89855e30c6)

---
