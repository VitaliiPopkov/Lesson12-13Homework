package Task2Converter;

import java.util.Scanner;

public abstract class ConverterTemperature {

    Scanner scanner= new Scanner(System.in);
    double celsiusTemperatureNow = scanner.nextDouble();
    public abstract void convert();

}
