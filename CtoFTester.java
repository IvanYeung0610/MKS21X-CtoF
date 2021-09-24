/**
The parameters should either be the degrees in Celsius or Fahrenheit. They should be double type.
The returnvalue type is double for both functions. The functions should return the temperature in Celsisus or
Fahrenheit depending on the function. (celsiusToFahrenheit() should return Fahrenheit while fahrenheitToCelsius() should return
Celsius.)
**/
public class CtoFTester {
  public static void main(String[] args) {
    double degreesInCelsius = 35.8;
    double degreesInfahrenheit = 56.7;
    System.out.println(celsiusToFahrenheit(degreesInCelsius));
    System.out.println(fahrenheitToCelsius(degreesInfahrenheit));
  }
  public static double celsiusToFahrenheit(double celsius) {
    final double conversionConstant = 9.0/5.0;
    return (celsius * conversionConstant) + 32.0;
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    final double conversionConstant = 5.0/9.0;
    return (fahrenheit - 32) * conversionConstant;
  }
}
