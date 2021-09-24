/**
The parameters should either be the degrees in Celsius or Fahrenheit. They should be double type.
The returnvalue type is double for both functions. The functions should return the temperature in Celsisus or
Fahrenheit depending on the function. (celsiusToFahrenheit() should return Fahrenheit while fahrenheitToCelsius() should return
Celsius.)
**/
public class CtoFTester {
  public static void main(String[] args) {

  }
  public static double celsiusToFahrenheit(double celsius) {
    final double conversionConstant = 9.0/5.0;
    return (celsius * conversionConstant) + 32.0;
  }
}
