package Task2Converter;

public class FahrenheitTemperature extends ConverterTemperature {
    @Override
    public void convert() {
        double degreeFahrenheit = ((celsiusTemperatureNow * 1.8)+32);
        System.out.println(degreeFahrenheit);
    }
}
