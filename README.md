# Temperature Converter

This is a simple Java program that converts temperatures between Celsius and Fahrenheit based on user input.

## Features
- Converts Fahrenheit to Celsius and vice versa.
- Uses a simple ternary operator for conversion logic.
- Takes user input via the command line.

## Usage

1. Compile the program using:
   ```sh
   javac Main.java
   ```
2. Run the compiled Java program:
   ```sh
   java Main
   ```
3. Enter your choice:
   - `C` to convert from Fahrenheit to Celsius.
   - `F` to convert from Celsius to Fahrenheit.
4. Enter the temperature value to convert.
5. The program outputs the converted temperature.

## Example
```
Enter your choice (C for Fahrenheit to Celsius and F for Celsius to Fahrenheit) : C
Enter the temperature : 100
37.8 C
```

## How It Works
- The program prompts the user to enter their choice (`C` or `F`).
- The user inputs the temperature value.
- The program uses the following conversion formulas:
  - Celsius to Fahrenheit: `(temp * 9/5) + 32`
  - Fahrenheit to Celsius: `(temp - 32) * 5/9`
- The result is displayed with one decimal place.

## Requirements
- Java Development Kit (JDK) installed.
- Basic understanding of command-line execution.

## License
This project is open-source and available under the MIT License.

