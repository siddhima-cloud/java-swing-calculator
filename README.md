# Java Swing Calculator

A simple desktop calculator application built with Java Swing — created as a learning project to practice Java GUI development.

## Features

- Basic arithmetic: addition, subtraction, multiplication, division
- Decimal support
- Clear / reset functionality
- Keyboard and mouse input (if implemented in this repo)
- Simple, lightweight Swing-based UI for learning and experimentation

## Prerequisites

- Java Development Kit (JDK) 8 or later

## Run / Build

Open the project in your IDE (IntelliJ IDEA, Eclipse, NetBeans) and run the class that contains the `public static void main(String[] args)` method (for example, a class named `Calculator` or `CalculatorApp`).

Or build and run from the command line:

1. Compile (from the project root):

```bash
# Compile all .java files into the 'out' directory
mkdir -p out
javac -d out $(find . -name "*.java")
```

2. Run (replace <MainClass> with the fully-qualified class that contains main):

```bash
java -cp out <fully-qualified-main-class>
# example: java -cp out com.example.calculator.CalculatorApp
```

3. Create a runnable JAR (optional):

```bash
# from project root after compiling into out/
jar cfe Calculator.jar <fully-qualified-main-class> -C out .
java -jar Calculator.jar
```

Note: Replace `<fully-qualified-main-class>` with your project's main class (package + class).

## Project structure (suggested)

- src/ — Java source files
- resources/ — images, icons or other assets

If your project layout differs, adjust the commands above or use your IDE's run configuration.

## Contributing

Contributions and improvements are welcome. If you plan larger changes, please open an issue first to discuss the change.

## License

This repository is open source — include a license file if you want (MIT suggested).

---

Author: siddhima-cloud
